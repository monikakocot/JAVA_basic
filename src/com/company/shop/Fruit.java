package com.company.shop;

public abstract class Fruit {

    private double quantity;


    public Fruit(double quantity){
        this.setQuantity(quantity);
    }

    //SETTERS,GETTERS, TOSTRING
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity(){
        return quantity;
    }


    @Override
    public String toString(){
        return this.getClass().getName()+" "+getQuantity();
    }

}
