package com.company.assocationAttribute;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    public String name,surname;

    List<WorkerCompany> workerCompany = new ArrayList<>();

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void addWorkerCompany(WorkerCompany p1){
        if(!workerCompany.contains(p1)) {
            workerCompany.add(p1);
        }
    }

    public List<WorkerCompany> showWorkersOfCompany(){
        return workerCompany;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
