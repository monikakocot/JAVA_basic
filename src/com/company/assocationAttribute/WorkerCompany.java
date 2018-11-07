package com.company.assocationAttribute;

public class WorkerCompany {

    public String dateOfEmploymeent;
    public Company company;
    public Worker worker;

    public WorkerCompany(String dateOfEmploymeent) {
        this.dateOfEmploymeent = dateOfEmploymeent;
    }

    public void addWorker(Worker p){
        this.worker=p;
        p.addWorkerCompany(this);
    }

    public void addCompany(Company f){
        this.company=f;
        f.addWorkerCompany(this);
    }

    public String toString(){
        return "Pracownik " + worker.name + " " + worker.surname + " starts work in the company:  " +
                company.name + " in " + dateOfEmploymeent +" year";
    }
}


