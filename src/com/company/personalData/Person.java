package com.company.personalData;

public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private  int age;
    private int weight;

    public Person(String name, String surname, int age, int weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
    }

    //SORT
    @Override
    public int compareTo(Person o) {
        int compareSurname = surname.compareTo(o.surname);

        if(compareSurname == 0) {
            return name.compareTo(o.name);
        }
        else {
            return compareSurname;
        }
    }

    // GETTERS, SETTERS, TO STRING

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

}
