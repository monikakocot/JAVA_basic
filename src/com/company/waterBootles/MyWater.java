package com.company.waterBootles;

import java.util.ArrayList;

public class MyWater {

    private static int numberOfLarge;
    private static int numberOfMedium;
    private static int numberOfSmall;
    static Capacity largeCapacity = Capacity.LARGE;
    static Capacity smallCapacity = Capacity.SMALL;
    static Capacity mediumCapacity = Capacity.MEDIUM;

    //add Boottles to the store

    void addLarge(int large) {
        this.numberOfLarge += large;
    }

    void addMedium(int medium) {
        this.numberOfMedium += medium;
    }
    void addSmall (int small) {
        this.numberOfSmall += small;
    }

// information about total amount of the water in store

    public static double getCapacity() {
        System.out.println("Now we have (total litres of water:");
        return numberOfLarge * largeCapacity.value + numberOfMedium * mediumCapacity.value + numberOfSmall * smallCapacity.value;

    }

    public static void getCapacityOfKinds(ArrayList lista) {

        System.out.println("Large bootles:" + numberOfLarge);
        System.out.println("Medium bootles:" + numberOfMedium);
        System.out.println("Small bootles:" + numberOfSmall);

    }

}
