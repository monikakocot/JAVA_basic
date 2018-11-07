package com.company.binarAssociationCompany;

public class Worker {


    public String name,surname;
    public Company company;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public void addComapany(Company company){
        this.company=company;
        company.addWorker(this);
    }

    public Company showCompany(){
        return company;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

