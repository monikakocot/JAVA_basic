package com.company.airplane;
import java.util.*;

/*
Program which shows the number of seats in the rows in the airplane.
User put number of seats in all airplane and nu,ber of rows.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the number of seats in airplane: ");
        int numberOfPlaces = scanner.nextInt();
        System.out.println("Put the number of rows: ");
        int numberOfRows = scanner.nextInt();

        if (numberOfPlaces % numberOfRows == 0) {
            System.out.println(numberOfPlaces / numberOfRows);
        }
        // numberOfRows-1, 1 the last one is not regular
        else {
            System.out.println(numberOfPlaces / (numberOfRows - 1));
            System.out.println(numberOfPlaces % (numberOfRows - 1));
        }
    }
}
