package com.company.assocationAttribute;

/*
Association with the attribute
 */
public class Main {

    public static void main(String[] args){

        Company f1 = new Company("Mcdonalds");

        Worker p1 = new Worker("Adam", "Nowak");
        Worker p2 = new Worker("Tomek", "Kowalski");
        Worker p3 = new Worker("Krzys", "Janowski");

        WorkerCompany pf1 = new WorkerCompany("2016");

        pf1.addCompany(f1);
        pf1.addWorker(p1);

        System.out.println(pf1);

    }
}


