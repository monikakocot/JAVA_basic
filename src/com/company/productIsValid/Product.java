package com.company.productIsValid;

import java.time.LocalDate;

public class Product {

    private String name;
    private String description;
    private String specification;
    Guarantee guarantee;

    public Product(String name, String description, String specification) {
        this.name = name;
        this.description = description;
        this.specification = specification;
    }

    public Product(String name, String description, String specification, Guarantee guarantee) {
        this.name = name;
        this.description = description;
        this.specification = specification;
        this.guarantee = guarantee;
    }


    public void isValid () {

        if (guarantee.getValidUntil().isAfter(LocalDate.now()))
            System.out.println("Guarantee for: " + this.getName()+  " is valid");
        else {
            System.out.println("Guarantee for: " + this.getName()+  " is NOT valid");
            //setProduct(null);
            //setValidUntil(null);
        }
    }

    // GETTERS, SETTERS

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getSpecification() {
        return specification;
    }
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}