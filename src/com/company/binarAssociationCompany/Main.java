package com.company.binarAssociationCompany;

/*
Binary assosiacion
 */
public class Main {

    public static void main(String[] args){

        Company f1 = new Company("Mcdonalds");

        Worker p1 = new Worker("Adam", "Nowak");
        Worker p2 = new Worker("Tomek", "Kowalski");
        Worker p3 = new Worker("Krzys", "Janowski");

        f1.addWorker(p1);
        f1.addWorker(p2);
        f1.addWorker(p3);

        System.out.println(f1.showWorkers());

        p1.addComapany(f1);

        System.out.println(p1.showCompany());
    }
}