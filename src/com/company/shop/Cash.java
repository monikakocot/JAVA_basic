package com.company.shop;


public class Cash {
    private int number;


    public Cash(int number){
        setNumber(number);
    }

    // PRINT the bill

    public void printBill(Basket basket, PriceList priceList){
        String fruitName;
        double result;
        System.out.println("Cash number: "+getNumber()+" Basket: " +basket.getNumber());
        for (Fruit fruit:basket.getFruits()){

            //fruitName = fruit.getClass().getSimpleName(); // gotowa metoda do wyświetlania listy
            //Ta metoda zwraca prostą nazwę klasy bazowej. Tutaj pobieramy klase obiektu fruit a
            // fruit to klasa po której dziedziczą klasy Strawbeery i Banana - wykrywa te nazwy
            fruitName = fruit.getClass().getSimpleName();
            result = fruit.getQuantity()*priceList.get(fruitName);

            System.out.println(fruitName+" "+fruit.getQuantity()+" kg*"+priceList.get(fruitName)+" = "+result);
            /*
Który kod jest lepszy
Kilkukortne wywołanie
*/
        }

    }

    // GETTERS, SETTERS

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}


