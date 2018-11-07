package com.company.theMostCommonNumber;

/*
Program show the most common number in TABLE
*/
public class Main {

    public static void main(String[] args) {

        int numbers[] = { 1, 2, 2, 2, 212, 545, 8, 5, 5, 7, 8, 9, 4, 3 };

        int regular = 0;
        int max = 0;
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            counter = 0;

            for (int j = 0; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {
                    counter++;

                    if (counter > max) {

                        max = counter;
                        regular = numbers[i];
                    }
                }

            }
        }

        System.out.println("The most common number is: " + regular + " and it appears: " + max + " times.");
    }
}

