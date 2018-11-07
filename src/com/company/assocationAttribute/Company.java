package com.company.assocationAttribute;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public String name;

    List<WorkerCompany> workerCompany = new ArrayList<>();

    public Company(String name) {
        this.name = name;
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
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}