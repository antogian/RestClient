package com.antogian.DTO;

public class CartEntry
{
    private int quantity = 1;
    private ItemDTO item;

    public CartEntry()
    {
        item = new ItemDTO();
        quantity = 1;
    }

    public ItemDTO getItem()
    {
        return item;
    }

    public void setItem(ItemDTO item)
    {
        this.item = item;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

}
