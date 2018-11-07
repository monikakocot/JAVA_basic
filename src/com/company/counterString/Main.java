package com.company.counterString;

import java.util.ArrayList;

/*
In the test class, create a list of String elements, where some elements will be repeated.
Then, imply a method that counts the number of occurrences of individual items and displays them at the end.
Call this method by passing the previously created list and check the result.

 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Check if counter for List works properly");

        ArrayList<String> lista = new ArrayList<>();

        lista.add("Jan");
        lista.add("Zosia");
        lista.add("Jan");
        lista.add("Ana");
        lista.add("Zosia");
        lista.add("Monika");
        lista.add("Jessenia");

        List.count(lista);

        System.out.println( " Check if counter for Tab works properly");

        char[] tab= new char[6];
        tab[0] ='a';
        tab[1] ='a';
        tab[2] ='b';
        tab[3] ='c';
        tab[4] ='d';
        tab[5] ='a';

        Tab.countTab(tab);

    }

    }
