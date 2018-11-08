package com.company.interfejs;

/*
An example of using Interfejs.

The Person class has a 'save method'.
Its implementation is suppressed by the external class and method (Interfejs).
Thanks to that someone else can work on the functionality of saving data.
Flexibility - the data can be eg saved to the database or Cachowane.
 */
public class Person {

    private String firstName;

    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    // method save:
    private Savable savable;

    public void save(){
        savable.save();
    }

    public Savable getSavable() {
        return savable;
    }

    public void setSavable(Savable savable) {
        this.savable = savable;
    }

    // others GETTERS,SETTERS

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


    public static void main(String[] args) {
        Person person = new Person("Adam","Mrowka");
        person.setSavable(new Cache());
        person.save();
        person.setSavable(new Database());
        person.save();
    }

}
