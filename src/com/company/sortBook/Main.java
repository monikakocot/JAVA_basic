package com.company.sortBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Create a Book Class with information about:
-title,
-number of pages,
-price.

Create a List of Books and sort by tittle.
After write another 2 comparators to sort by number of pages and price.

 */
public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.program();
    }

    private void program() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("Harry Potter", 56, "250","small"));
        books.add(new Book("Mowa Ciała", 72, "3000","big"));
        books.add(new Book("Technologie energetyczne", 72, "500","very big"));
        books.add(new Book("Java - podstawy", 30, "400","small"));
        books.add(new Book("Prawo jednego", 220, "400","very small"));

        System.out.println("NOT SORTED: ");
        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books);

// by method compareTo

        System.out.println("\nSORTED: ");
        for (Book book : books) {
            System.out.println(book);
        }
// COMPARATORS
        Collections.sort(books, new ComparatorPages());


        System.out.println("\nSORTED BY PAGES: ");
        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books, new ComparatorPrices());


        System.out.println("\nSORTED BY PRICE: ");
        for (Book book : books) {
            System.out.println(book);
        }

        Collections.sort(books, new ComparatorSizes());


        System.out.println("\nSORTED BY SIZE: ");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\nSORTED BY SIZE: ");
        books.sort(Comparator.comparing(Book::getSize)); // not working

    }


    // Comparator for int
    class ComparatorPages implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            int pages = o1.getPages()- o2.getPages();
            if (pages == 0) {
                return o1.compareTo(o2);
            }
            return pages;
        }

    }

    // Comparator for String with numbers
    class ComparatorPrices implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            int prices = Integer.parseInt(o1.getPrice())-Integer.parseInt(o2.getPrice());
            if (prices == 0) {
                return o1.compareTo(o2);
            }
            return prices;
        }
    }

    // Comparator for String
    class ComparatorSizes implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            int prices = o1.getSize().compareTo(o2.getSize());
            if (prices == 0) {
                return o1.compareTo(o2);
            }
            return prices;
        }
    }
}




