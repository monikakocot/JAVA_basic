package com.company.productsToCategory;

/*
Adding products to the category
 */
public class ProductCategory {


    public  boolean isFav;

    public Category category;
    public Product product;

    public ProductCategory(boolean isFav) {

        this.isFav = isFav;
    }

    public void addProduct(Product p){
        this.product = p;
        p.addProductToCategory(this);
    }

    public void addCategory(Category c){
        this.category=c;
        c.addProductToCategory(this);
    }

    public void show() {
        System.out.println(this);
    }

    public String toString(){
        return "Produkt: " + product.name + " " + product.sth + " is in category: " +
                category.name + " Is it your favorite one? " + isFav;
    }

}


