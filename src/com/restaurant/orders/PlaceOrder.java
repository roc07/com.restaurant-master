package com.restaurant.orders;

import com.restaurant.items.Item;
import com.restaurant.menu.Menu;
import java.util.ArrayList;

public class PlaceOrder {
    private ArrayList<Order> orders;
    private ArrayList<Item> availableItems;
    
    public PlaceOrder(Menu menu){
        this.orders = new ArrayList<Order>();
        this.availableItems = menu.getItems();
    }
    
    public void orderItem(Item item, int quantity){
        for (int i = 0; i < availableItems.size(); i++){
            if (availableItems.get(i).equals(item)){              
                this.orders.add(new Order(item, quantity));     
            }               
        }
    }
    
    public ArrayList<Order> getOrder(){
        return this.orders;
    }
}
