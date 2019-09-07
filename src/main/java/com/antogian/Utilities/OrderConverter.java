package com.antogian.Utilities;

import com.antogian.DTO.OrderDTO;
import com.antogian.Repositories.Order;

public class OrderConverter
{
    public static Order getOrder(OrderDTO orderDTO)
    {
        Order order = new Order();

        if(orderDTO.isPaid())
            order.setPayStatus("Paid");
        else
            order.setPayStatus("CashOut");

        order.setTenderType("CreditCard");
        order.setCustFName(orderDTO.getUser().getFirstName());
        order.setCustLName(orderDTO.getUser().getLastName());
        order.setCustAddress(orderDTO.getUser().getAddress());
        order.setCustPhone(orderDTO.getUser().getPhoneNumber());

        return order;
    }
}
