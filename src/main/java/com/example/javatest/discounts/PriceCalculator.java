package com.example.javatest.discounts;

import java.util.ArrayList;

public class PriceCalculator {

    private final ArrayList<Double> prices = new ArrayList<>();
    private double discount = 0;

    public double getTotal() {
        double result = 0;
        for (Double price : prices) {
            result += price;
        }
        return result * ((100 - discount)/100);
    }

    public ArrayList<Double> addPrice(double price) {
         prices.add(price);
        return prices;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
