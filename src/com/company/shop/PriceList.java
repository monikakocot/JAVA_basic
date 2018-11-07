package com.company.shop;

import java.util.HashMap;

public class PriceList {

    private HashMap<String,Double > prices = new HashMap<String,Double>();

    // adding products to price list
    public void set(String name,double price){
        prices.put(name, price);
    }

    //show the price of product from price list
    public double get(String name){
        return prices.get(name);
    }

}

