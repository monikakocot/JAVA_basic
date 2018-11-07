package com.company.counter;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
Program that reads n numbers and prints the number of occurrences of every number
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write down how many numbers do you want to analise ?");

        int n = scanner.nextInt();
        int number;

        System.out.println("Put the numbers for analise:");

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 1; i <= n; i++) {

            number = scanner.nextInt();

            if (map.containsKey(number)) {

                map.put(number, map.get(number) + 1);

            } else {

                map.put(number, 1);
            }
        }

        System.out.println("First way to print the result");

        for (int el : map.keySet())
            System.out.println(el + " occurs " + map.get(el) + " times");


        System.out.println("Second way to print the result");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value == 1) {
                System.out.println(key + " occurs 1 time");
            } else {
                System.out.println(key + " occurs " + value + " times");
            }
        }
    }
}