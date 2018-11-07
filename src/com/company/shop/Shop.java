package com.company.shop;

// http://www.kirkk.com/modularity/2009/12/solid-principles-of-class-design/
/*
Simple simulation of shop.
 */
public class Shop {

    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        priceList.set("Strawberry", 10);
        priceList.set("Banana", 12);

        Basket basket = new Basket();

        basket.add(new Strawberry(5));
        basket.add(new Banana(7));

        System.out.println("ZAWARTOSC KOSZYKA:");
        basket.showContent();


        // add Basket to the Cash
        Cash cash = new Cash(1);

        System.out.println();
        System.out.println("Print the bill: ");
        cash.printBill(basket,priceList);

        System.out.println();
        System.out.println("Show the price of banana!");
        System.out.println(priceList.get("Banana"));
    }
}
