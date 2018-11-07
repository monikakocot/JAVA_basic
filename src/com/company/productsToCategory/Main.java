package com.company.productsToCategory;

public class Main {

    public static void main(String[] args) {

        Product hipek = new Product("Hipek","signs 'heey jeee oooooo jeee ooo'");
        Product ciupek = new Product("Ciupek","sings 'Ive got a ove like Jagger'");
        Product hero = new Product("Hero","dances Bachata");

        Category singers = new Category("Singers");
        Category dancers = new Category("Dancers");

        ProductCategory one = new ProductCategory(true);

        one.addCategory(singers);
        one.addProduct(hipek);
        one.addProduct(ciupek);

        one.show();
    }
}
