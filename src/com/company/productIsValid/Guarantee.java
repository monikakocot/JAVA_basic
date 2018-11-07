package com.company.productIsValid;

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


    //SETERS,GETTERS,TOSTRING

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