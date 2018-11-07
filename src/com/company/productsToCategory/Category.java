package com.company.productsToCategory;

import java.util.ArrayList;
import java.util.List;

public class Category {

    public String name;

    //list for *

    List<ProductCategory> productCategory = new ArrayList<>();

    public Category(String name) {
        this.name = name;
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

    // GETTERS, SETTERS, TOSTRING

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
