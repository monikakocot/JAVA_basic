package com.company.productsToCategory;

import java.util.ArrayList;
import java.util.List;

public class Product {

    public String name, sth;

    //list for *

    List<ProductCategory> productCategory = new ArrayList<>();

    public Product(String name, String sth) {
        this.name = name;
        this.sth = sth;
    }

    //method that associates with the attribute
    public void addProductToCategory(ProductCategory p1) {
        if (!productCategory.contains(p1)) {
            productCategory.add(p1);
        }
    }

    public List<ProductCategory> showProductsOfCategory() {
        return productCategory;
    }

    //GETTERS,SETTERS, TO STRING

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSth() {
        return sth;
    }

    public void setSth(String sth) {
        this.sth = sth;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", sth='" + sth + '\'' +
                '}';
    }
}