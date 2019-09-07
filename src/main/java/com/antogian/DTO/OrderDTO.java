package com.antogian.DTO;

import com.antogian.DTO.ShoppingCart;
import com.antogian.Entities.User;

public class OrderDTO
{
    private User user;
    private ShoppingCart cart;
    private boolean paid = false;

    public OrderDTO()
    {
        user = new User();
        cart = new ShoppingCart();
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public ShoppingCart getCart()
    {
        return cart;
    }

    public void setCart(ShoppingCart cart)
    {
        this.cart = cart;
    }

    public boolean isPaid()
    {
        return paid;
    }

    public void setPaid(boolean paid)
    {
        this.paid = paid;
    }
}
