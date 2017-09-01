package com.restaurant.menu;

import com.restaurant.items.Item;
import java.util.ArrayList;

public class Menu {
  private ArrayList<Item> items = new ArrayList<Item>();
  
  public void addItem(Item item){
    items.add(item);
  }
  
  public void displayItems(){
    for (int i = 0; i < items.size(); i++){
        System.out.println(items.get(i).getName() + ": " + items.get(i).getCost() + "$");
    }
  }
  
  public ArrayList getItems(){
    return items;
  }
  
  public void removeItem(Item item){
    for (int i = 0; i < items.size(); i++){
        if (items.get(i).equals(item)){
            items.remove(i);
            System.out.println(item.getName() + " removed.");
            break;
        }
    }
     System.out.println("Item not found.");
  }
  
}
