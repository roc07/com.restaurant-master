package com.restaurant.orders;

import com.restaurant.items.Item;

public class Order {
    private String name;
    private int quantity;
    private Item item;
    
    public Order (Item item, int quantity){
        this.item = item;
        this.name = item.getName();
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Item getItem() {
        return item;
    }
}
