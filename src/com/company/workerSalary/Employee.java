package com.company.workerSalary;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    protected String name;
    private String surname;
    private double salary;

    private  static List<Employee> employees = new ArrayList<>();

    public Employee() {
    }

    public Employee(String name, String surname) {

        this.name = name;
        this.surname = surname;
        Employee.employees.add(this);

        System.out.println("I added: " + this);
        System.out.println("Size of the list is:  " + employees.size());
    }

    public Employee(String name, String surname, double salary) {

        this(name,surname);
        setSalary(salary);

    }

    static List<Employee> getAllEmployees() {

        return employees;
    }

    public static double sumAllSalaries(){
        double sum=0;
        for (Employee employee:Employee.getAllEmployees()){
            sum += employee.getSalary();
        }
        return sum;
    }

    //GETTERS,SETTERS, TO STRING

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


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return name+" "+surname;
    }

}