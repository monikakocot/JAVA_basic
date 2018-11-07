package com.company.waterBootles;

import java.util.ArrayList;

/*
We collect water. There are three types of bootles: Large,Medium,Small.
Create a class with methods:

void addLarge (int) - adds the given number of large bottles to the water supply.
Analogically for Medium and Small.

The method that makes it possible to obtain information about how many bottles there are.
The method that allows the total capacity of the collected water.
 */
public class Main {
    public static void main(String args[]) {

        ArrayList<MyWater> listOfTheBootle = new ArrayList<>();

        MyWater largeBootles = new MyWater();
        MyWater mediumBootles = new MyWater();
        MyWater smallBootles = new MyWater();

        largeBootles.addLarge(5);
        mediumBootles.addMedium(3);
        smallBootles.addSmall(10);

        listOfTheBootle.add(largeBootles);
        listOfTheBootle.add(mediumBootles);
        listOfTheBootle.add(smallBootles);

        System.out.println("Check total amount of water: ");

        System.out.println(MyWater.getCapacity());

        System.out.println();
        System.out.println("Check the kind of bootles that we have: ");
        MyWater.getCapacityOfKinds(listOfTheBootle);

        System.out.println();
        System.out.println("After change the velocity of Large bootles from 2 to 5 ");
        Capacity.LARGE.setValue(5);

        System.out.println(MyWater.getCapacity());
    }
}
        /*
        ArrayList<MyWater> listaButelek2 = new ArrayList<>();

        MyWater largeBootles1 = new MyWater();
        MyWater mediumBootles1 = new MyWater();
        MyWater smallBootles1 = new MyWater();

        largeBootles.addLarge(100);
        mediumBootles.addMedium(300);
        smallBootles.addSmall(500);

        listaButelek.add(largeBootles1);
        listaButelek.add(mediumBootles1);
        listaButelek.add(smallBootles1);

        MyWater.getCapacityOfKinds(listaButelek2);
        System.out.println(MyWater.getCapacity());  */