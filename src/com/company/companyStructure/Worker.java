package com.company.companyStructure;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private String surname;
    private double salary;

    public Managers manager;
    List<Worker> workers = new ArrayList<>();

    public Worker(String name, String surname, double salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        workers.add(this);
    }

    // adding manager to worker

    public void addManagerToWorker (Managers m){
        this.manager=m;
        m.addWorkerToManager(this);
    }

    // show workers of manager

    public static List<Worker> showFromM(Managers m) {
        return m.showWorkers();

    }

    /*
    public static ArrayList<Worker> addWorker ( Worker w) {

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(w);
        System.out.println("Dodano do listy pracownika" + w.toString());
        return workers;
    }
*/

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


}


