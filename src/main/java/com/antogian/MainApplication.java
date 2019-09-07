package com.antogian;

import com.antogian.DTO.OrderDTO;
import com.antogian.Repositories.Order;
import com.antogian.Repositories.OrderDetails;
import com.antogian.Utilities.Consumer;
import com.antogian.Utilities.OrderConverter;
import com.antogian.Utilities.OrderDetailsConverter;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MainApplication
{
    //static User userObj;
    private static Session session;
    private static SessionFactory factory;
    private static ServiceRegistry registry;

    private static void buildSessionFactory()
    {
        try
        {
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
//            registry = new StandardServiceRegistryBuilder()
//                    .applySettings(configuration.getProperties())
//                    .build();
            factory = configuration.buildSessionFactory();
//            factory = configuration.buildSessionFactory(registry);
        }
        catch(Throwable ex)
        {
            System.err.println("Failed to create session factory object" + ex);
            throw new ExceptionInInitializerError();
        }
        // Creating Configuration Instance & Passing Hibernate Configuration File
/*        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");

        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        // Creating Hibernate SessionFactory Instance
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);*/

        //return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public static void main(String[] args)
    {
//        List<OrderDetails> allItems;
//        allItems = Consumer.getOrderDetails("http://localhost:8080/api");

        List<OrderDTO> allOrderDTOS;
        allOrderDTOS = Consumer.getAllOrders("https://athena-ordering.herokuapp.com/api");

//        CategoryService categoryService = new CategoryService();
//        List<Category> categories = categoryService.toCategoryEntity(allCategoriesDTO);

        buildSessionFactory();
        for(OrderDTO orderDTO : allOrderDTOS)
        {
            Order order = OrderConverter.getOrder(orderDTO);
            int orderId = insertOrder(order);
            List<OrderDetails> orderDetailsList = OrderDetailsConverter.getOrderDetailsFromCart(orderDTO.getCart(), orderId);
            insertOrderDetails(orderDetailsList);
        }
        //--------------------------------------------------------------------------------------------------------------
    }

    private static int insertOrder(Order order)
    {
        session = factory.openSession();
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            session.save(order);
            transaction.commit();
        }
        catch(HibernateException ex)
        {
            if(transaction != null)
                transaction.rollback();
            ex.printStackTrace();
        }
        finally
        {
            session.close();
        }
        //StandardServiceRegistryBuilder.destroy(registry);

        return order.getOrderID();
    }

    private static void insertOrderDetails(List<OrderDetails> orderDetailsList)
    {
        session = factory.openSession();
        Transaction transaction = null;
        try
        {
            transaction = session.beginTransaction();
            for(OrderDetails od : orderDetailsList)
            {
                session.save(od);
            }
            transaction.commit();
        }
        catch(HibernateException ex)
        {
            if(transaction != null)
                transaction.rollback();
            ex.printStackTrace();
        }
        finally
        {
            session.close();
        }
        //StandardServiceRegistryBuilder.destroy(registry);
//        session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
//        session.beginTransaction();
//
//        for(OrderDetails od : orderDetailsList)
//        {
//            session.save(od);
//        }
//        session.getTransaction().commit();
//
//        if(session != null)
//        {
//            session.close();
//        }
    }
}
