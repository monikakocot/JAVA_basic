package com.company.companyStructure;

import java.util.ArrayList;
import java.util.List;

/*
Structure of company:

- directors
- managers
- workers

In output  you can see Managers of Directors and Workesrs od Managers.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here

        List<Worker> workers = new ArrayList<>();

        Worker w1 = new Worker("Wojtek", "Strączek", 200);
        Worker w2 = new Worker("Anna", "Bączek", 3000);
        Worker w3 = new Worker("Maciek", "Piwo", 2500);
        Worker w4 = new Worker("Piotr", "Sebek", 1500);
        Worker w5 = new Worker("Kasia", "Fistaszek", 1000);


        Managers m1 = new Managers("Monika", "Kozak", 5000, "Do pracy rodacy");
        Managers m2 = new Managers("Agata", "Ryga", 6000, "Dziś świętujemy");
        Managers m3 = new Managers("Eryk", "Patyk", 10000, "Hakuna matata!");

        Directors d1 = new Directors("Jurek", "Ogórek", 20000);
        Directors d2 = new Directors("Marek", "Karawanek", 30000);

        ArrayList<Worker> company = new ArrayList<>();
        company.add(w1);
        company.add(w2);
        company.add(w3);
        company.add(w4);
        company.add(w5);

        company.add(m1);
        company.add(m2);
        company.add(m3);

        company.add(d1);
        company.add(d2);

        System.out.println("Workers of the company:");
        System.out.println();

        for (Worker list : company) {
            System.out.println(list);
        }

        m1.addWorkerToManager(w1);
        m1.addWorkerToManager(w2);

        m2.addWorkerToManager(w3);
        m2.addWorkerToManager(w4);
        m3.addWorkerToManager(w5);

        d1.addManagerTODirector(m1);
        d1.addManagerTODirector(m2);
        d2.addManagerTODirector(m3);

        System.out.println();
        System.out.println("Workers of Manager M1:");
        System.out.println();
        System.out.println(m1.showWorkers());

        System.out.println();
        System.out.println("Workers of Manager M2:");
        System.out.println();
        System.out.println(m2.showWorkers());

        System.out.println();
        System.out.println("Workers of Manager M3:");
        System.out.println();
        System.out.println(m3.showWorkers());

        System.out.println();
        System.out.println("Managers fo Director D1:");
        System.out.println();
        System.out.println(d1.showManagers());


        System.out.println();
        System.out.println("Structure of company with Directors:");
        System.out.println();

        for (int i = 0; i <= company.size() - 1; i++) {
            if (company.get(i) instanceof Directors) {
                System.out.println(company.get(i));

                for (int j = 0; j <= company.size() - 1; j++) {

                    if (company.get(j) instanceof Managers) {
                        System.out.println(company.get(j));

                        System.out.println("                             " + Worker.showFromM((Managers) company.get(j)));
                    }
                }
            }
        }
                System.out.println();
                System.out.println("Structure of company without Directors:");
                System.out.println();

                for (int i = 0; i <= company.size() - 1; i++) {

                    if (company.get(i) instanceof Managers) {
                        System.out.println(company.get(i));

                        System.out.println("             " + Worker.showFromM((Managers) company.get(i)));

                    }
                }
            }
        }

