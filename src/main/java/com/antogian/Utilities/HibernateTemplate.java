package com.antogian.Utilities;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class HibernateTemplate
{
    private static SessionFactory factory;
    private static ServiceRegistry registry;

    public static void doHibernate()
    {
        try
        {
            Configuration configuration = new Configuration().configure();
            registry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            factory = configuration.buildSessionFactory(registry);
        }
        catch(Throwable ex)
        {
            System.err.println("Failed to create session factory object" + ex);
            throw new ExceptionInInitializerError();
        }
        Session session = factory.openSession();
        Transaction tx = null;
        int objId;
        try
        {
            tx = session.beginTransaction();
            Object obj = new Object();
            session.save(obj);
            //objId = (int) session.save(obj);
            //List objectsList = session.createQuery("FROM Item").list();
//            for(Object object : objectsList)
//            {
//                System.out.println(object.toString());
//            }
            tx.commit();
        }
        catch(HibernateException ex)
        {
            if(tx != null)
                tx.rollback();
            ex.printStackTrace();
        }
        finally
        {
            session.close();
        }
        StandardServiceRegistryBuilder.destroy(registry);
    }
}
