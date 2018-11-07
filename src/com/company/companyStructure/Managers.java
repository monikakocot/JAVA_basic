package com.company.companyStructure;

import java.util.ArrayList;
import java.util.List;

public class Managers extends Worker {

    private String yell;
    List<Worker> workers = new ArrayList<>();
    public Directors director;

    public Managers(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    public Managers(String name, String surname, double salary, String yell) {
        super(name, surname, salary);
        this.yell = yell;
    }

    // adding workers to manager
    public void addWorkerToManager(Worker w) {
        if (!workers.contains(w)) {
            workers.add(w);
            w.addManagerToWorker(this);
        }
    }

    // adding director to manager

    public void addDirectorToManager (Directors d ){
        this.director=d;
        d.addManagerTODirector(this);
    }

    // metoda pokazująca Managerów Dyrektora

    public static List<Managers> showFromD(Directors d) {
        return d.showManagers();
    }

    // show workers of manager

    public List<Worker> showWorkers(){
        return workers;
    }

    // GETTERS, SETTERS, TO STRING

    public String getYell() {
        return yell;
    }

    public void setYell(String yell) {
        this.yell = yell;
    }

    @Override
    public String toString() {
        return "Managers{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", salary=" + getSalary() +
                "yell='" + yell + '\'' +
                '}';
    }
}
