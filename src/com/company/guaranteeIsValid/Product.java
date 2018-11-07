package com.company.guaranteeIsValid;

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

    public void addGuaranteeToProduct (Guarantee g){
        g.addProductToGuarantee(this);
        //this.addGuaranteeToProduct(g);
    }

    //SETERS,GETTERS, TOSTRING

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