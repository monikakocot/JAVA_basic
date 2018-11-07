package com.company.productIsValid;

import java.time.LocalDate;
/*
Define Product class with name, description and specification.Define Guarantee Class with validUntil atribute.
Create method isValid.
Here mothod isValid works to check guaranteeIsValid.

 */


public class Main {

    public static void main(String[] args) {

        Guarantee firstGuarantee = new Guarantee(LocalDate.of(2018,12,25));
        Guarantee secondGuarantee=new Guarantee(LocalDate.of(2015, 10, 20));
        Guarantee thirdGuarantee=new Guarantee(LocalDate.of(2015, 10, 20));


        Product fridge = new Product("Refrigerator Electrolux", "very good", "1000W",firstGuarantee);
        Product pc = new Product("Computer","Lenovo","Intel Core i7",firstGuarantee);
        Product cheese = new Product("Gouda","spicy","show must go on",thirdGuarantee);
        Product water = new Product("Nestle","wet","with minerals",secondGuarantee);
        Product meat = new Product("Pork", "very good", "salty");

        System.out.println("Check if products are valid");

        fridge.isValid();
        water.isValid();

    }
}

