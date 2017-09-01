package com.restaurant;

import com.restaurant.items.Item;
import com.restaurant.items.Coffee;
import com.restaurant.items.Juices;
import com.restaurant.items.Tea;
import com.restaurant.items.nonvegitems.NonVegSandwich;
import com.restaurant.items.vegitems.VegSandwich;
import com.restaurant.menu.Menu;
import com.restaurant.orders.Order;
import com.restaurant.orders.PayBill;
import com.restaurant.orders.PlaceOrder;

public class ComRestaurant {

  public static void main(String[] args) {
    
      Menu testMenu = new Menu();
      
      String lambStr = "Lamb Sandwich";
      String blckTeaStr = "Black Tea";
      String coffeeStr = "Jacobs Coffee";
      
      Juices removeLater = new Juices("Lemon Juice", 99.00);
      NonVegSandwich lamb = new NonVegSandwich(lambStr, 14.20);
      VegSandwich tomato = new VegSandwich("Tomato Sandwich", 4.90);
      Tea blackTea = new Tea(blckTeaStr, 1.20);
      Coffee jaCoffee = new Coffee(coffeeStr, 1.40);
      Juices orange = new Juices("Orange Juice", 3.00);
      
      testMenu.addItem(lamb);
      testMenu.addItem(tomato);
      testMenu.addItem(blackTea);
      testMenu.addItem(jaCoffee);
      testMenu.addItem(orange);
      testMenu.addItem(removeLater);
      
      testMenu.displayItems();
      
      System.out.println();
      System.out.println("After removing Lemon Juice:");
      testMenu.removeItem(removeLater);
      System.out.println();
      
      testMenu.displayItems();
      
      System.out.println();
      System.out.println("Placing order:");
      PlaceOrder testOrder = new PlaceOrder(testMenu);
      testOrder.orderItem(lamb, 4);
      testOrder.orderItem(blackTea, 3);
      testOrder.orderItem(jaCoffee, 2);
      
      System.out.println();
      System.out.println("Paying bill amount:");      
      PayBill currentBill = new PayBill();
      System.out.printf("%.2f", currentBill.payableAmount(testOrder));
      
  }
  
}
