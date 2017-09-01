package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Cup;

public abstract class HotDrinks implements Item {
  private Category category = Category.Drinks;

  public Category getCategory() {
    return this.category;
  }

  public Container getContainer() {
    return new Cup();
  }

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);

    public abstract String getName();

    public abstract double getCost();
}

