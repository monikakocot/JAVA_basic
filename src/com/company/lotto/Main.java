package com.company.lotto;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
A program that randomizes 6  numbers from the range of 49 numbers.
Numbers can not be repeated.
 */

public class Main {

    public static void main(String[] args) {
        // write your code here

        Random random = new Random();

        Set<Integer> numbers = new TreeSet<>();

        while (numbers.size() != 6) {

            numbers.add(random.nextInt(49) + 1);

        }
        System.out.println(numbers);
    }
}