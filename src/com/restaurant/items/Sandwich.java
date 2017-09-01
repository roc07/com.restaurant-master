package com.restaurant.items;

import com.restaurant.items.container.Container;
import com.restaurant.items.container.Wrapper;

public abstract class Sandwich implements Item {
  private Category category = Category.Snack;

  public Category getCategory() {
    return this.category;
  }

  public Container getContainer() {
    return new Wrapper();
  }

    public abstract int getQuantity();

    public abstract void setQuantity(int quantity);

    public abstract String getName();

    public abstract double getCost();
}

