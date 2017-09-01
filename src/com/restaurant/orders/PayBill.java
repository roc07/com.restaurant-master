package com.restaurant.orders;

public class PayBill {
    public double payableAmount(PlaceOrder order){
        double ammount = 0d;
        for (int i = 0; i < order.getOrder().size(); i++){
            ammount += order.getOrder().get(i).getItem().getCost() * order.getOrder().get(i).getQuantity();
        }
        return ammount;
    }
}
