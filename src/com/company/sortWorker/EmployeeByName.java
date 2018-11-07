package com.company.sortWorker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
List of Employees sorted by name.
 */
public class EmployeeByName extends Person implements Comparable <EmployeeByName> {

    private double salary;

    public EmployeeByName(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public static void main(String[] args) {

        List<EmployeeByName> employeeList = new ArrayList<>();

        employeeList.add(new EmployeeByName("Zdzislaw", "Pyton", 2000));
        employeeList.add(new EmployeeByName("Marek", "Kowal", 3000));
        employeeList.add(new EmployeeByName("Ada", "Pyton", 5000));
        employeeList.add(new EmployeeByName("Romek", "Nowak", 1000));
        employeeList.add(new EmployeeByName("Zdzislaw", "Ponce", 3500));

        Collections.sort(employeeList);
        System.out.println(employeeList);
    }

    @Override
    public int compareTo(EmployeeByName o) {
        return getFirstName().compareTo(o.getFirstName());

    }

    //GETTERS, SETTERS, TOSTRING

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name " + this.getFirstName()+
                " salary=" + salary +
                '}';
    }
}
