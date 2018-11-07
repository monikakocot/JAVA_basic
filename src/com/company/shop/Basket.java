package com.company.shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private int number;
    private static int currentNumber = 1;

    public Basket(){
        this.number = currentNumber++;
    }

    private List<Fruit> fruits = new ArrayList<Fruit>();

    // add Fruit to the Basket
    void add(Fruit f){
        fruits.add(f);
    }

    public void showContent(){
        System.out.println("Zawartość koszyka numer "+number);
        for (Fruit f:fruits){
            System.out.println(f.toString());
        }
    }

    public ArrayList<Fruit> getFruits(){
        return (ArrayList<Fruit>) fruits;
    }

    //GETTERS, SETTERS

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getCurrentNumber() {
        return currentNumber;
    }

    public static void setCurrentNumber(int currentNumber) {
        Basket.currentNumber = currentNumber;
    }
}

