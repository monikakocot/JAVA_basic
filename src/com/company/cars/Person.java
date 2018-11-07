package com.company.cars;

public class Person {

    private String firstName;
    private String lastName;


    public Person(String firstName, String lastName){

        setFirstName(firstName);
        setLastName(lastName);
    }

    // GETTERS,SETTERS

    public String getName(){
        return firstName+" "+lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
