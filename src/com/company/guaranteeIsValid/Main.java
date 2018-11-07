package com.company.guaranteeIsValid;

import java.time.LocalDate;
/*
Define Product class with name, description and specification.Define Guarantee Class with validUntil atribute.
Create method isValid.
Here mothod isValid works to check guaranteeIsValid.

 */


public class Main {

    public static void main(String[] args) {


        Product fridge = new Product("Refrigerator Electrolux", "very good", "1000W");
        Product pc = new Product("Computer","Lenovo","Intel Core i7");
        Product cheese = new Product("Gouda","spicy","show must go on");
        Product water = new Product("Nestle","wet","with minerals");

        /*
        Guarantee guaranteeIsValid=new Guarantee(product, LocalDate.of(2018, 12, 25));
        Guarantee secondGuarantee=new Guarantee(product,LocalDate.of(2015, 10, 20));
        Guarantee thirdGuarantee=new Guarantee(pc ,LocalDate.of(2015, 10, 20));
        // ewentualnie mozna bylo staworzyc liste w Klasie Guarantee o typie Produkt i dopisywać produkty
        */
        Guarantee firstGuarantee = new Guarantee(LocalDate.of(2018,12,25));
        Guarantee secondGuarantee=new Guarantee(LocalDate.of(2015, 10, 20));
        Guarantee thirdGuarantee=new Guarantee(LocalDate.of(2015, 10, 20));

/////////////////////////////////////////////////////////////////////

        firstGuarantee.addProductToGuarantee(fridge);
        firstGuarantee.addProductToGuarantee(pc);

        cheese.addGuaranteeToProduct(secondGuarantee);
        water.addGuaranteeToProduct(thirdGuarantee);

        System.out.println("Check the products from guaranteeIsValid");
        System.out.println();

        firstGuarantee.showProductsFromList();

        System.out.println("Check if products are valid");
        System.out.println();
////////////////////////////////////////////////////////

        firstGuarantee.isValid();
        secondGuarantee.isValid();



    }

}

