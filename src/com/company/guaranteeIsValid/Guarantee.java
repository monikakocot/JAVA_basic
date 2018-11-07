package com.company.guaranteeIsValid;

import java.time.LocalDate;
import java.util.ArrayList;

public class Guarantee {

    private Product product;
    private LocalDate validUntil;

    public Guarantee(Product product, LocalDate validUntil) {
        this.product = product;
        this.validUntil = validUntil;
    }

    public Guarantee(LocalDate validUntil) {
        this.validUntil = validUntil;
    }


    public void isValid () {

        if (validUntil.isAfter(LocalDate.now()))
            System.out.println("Guarantee is valid");
        else {
            System.out.println("Guarantee is NOT valid");
            //setProduct(null);
            //setValidUntil(null);
        }
    }
    ArrayList<Product> products = new ArrayList<>();

    public ArrayList addProductToGuarantee (Product p) {
        if(!products.contains(p)){
            products.add(p);
            this.addProductToGuarantee(p);
        }
        return products;
    }


    public void showProductsFromList(){

        for( Product p: products){
            System.out.println(p);
        }

    }


    //SETERS,GETTERS

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;

    }

}