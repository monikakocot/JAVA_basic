package com.company.sortWorker;

/*
List of Employees sorted by salary.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeBySalary extends Person implements Comparable <EmployeeBySalary> {

    private double salary;

    public EmployeeBySalary(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }
    
    public static void main(String[] args) {

        List<EmployeeBySalary> employeeList = new ArrayList<>();

        employeeList.add(new EmployeeBySalary("Zdzislaw", "Pyton", 2000));
        employeeList.add(new EmployeeBySalary("Marek", "Kowal", 3000));
        employeeList.add(new EmployeeBySalary("Ada", "Pyton", 5000));
        employeeList.add(new EmployeeBySalary("Romek", "Nowak", 1000));
        employeeList.add(new EmployeeBySalary("Zdzislaw", "Ponce", 3500));

        Collections.sort(employeeList);
        System.out.println(employeeList);
    }

    @Override
    public int compareTo(EmployeeBySalary o) {
        if ( getSalary()<o.getSalary())

            return -1;
        if ( getSalary()> o.getSalary())

            return 1;
        return 0;
    }

    // GETTERS, SETTERS, TOSTRING

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