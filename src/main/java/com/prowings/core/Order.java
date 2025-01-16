package com.prowings.core;

public class Order {
    private String orderId;
    private double amount;

    
    public Order(String orderId, double amount) {
        this.orderId = orderId;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{orderId='" + orderId + "', amount=" + amount + '}';
    }
}
