package com.company.binarAssociationCompany;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public String name;


    List<Worker> workers = new ArrayList<>();

    public Company(String nazwa)
    {
        this.name=name;
    }

    public void addWorker(Worker p1){

        if(!workers.contains(p1)) {
            workers.add(p1);

            //p1.addCompany(this); - info zwrotne dodaje praownika do firmy i od razu firmę do pracownika. Nie muszę wywoływać 2 metod
        }
    }

    public List<Worker> showWorkers(){
        return workers;
    }

    public String toString(){
        return name;
    }
}
