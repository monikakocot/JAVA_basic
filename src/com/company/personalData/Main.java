package com.company.personalData;

/*
Program for storing personal data(name,surname,age,height,weight).
Functional:
- adding new people
- searching people by: name, surname, age etc.
- searching the oldest person, the highest etc.
- sort people by: name,surname etc.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Gosia", "Parda", 60, 45));
        persons.add(new Person("Kuba", "Nowak", 44, 90));
        persons.add(new Person("Michał", "Ciołek", 22, 75));
        persons.add(new Person("Ala", "Nowak", 32, 50));

        System.out.println("NOT SORTED: ");
        for (Person niesort : persons) {
            System.out.println(niesort);
        }

        Collections.sort(persons);

        System.out.println();
        System.out.println("\nSORTED BY SURNAME: ");
        for (Person niesort : persons) {
            System.out.println(niesort);
        }
        System.out.println();


        Collections.sort(persons, new ComparatorAge());

        System.out.println("\nSORTED BY AGE: ");
        for (Person niesort : persons) {
            System.out.println(niesort);
        }

        System.out.println();

        Collections.sort(persons, new ComparatorWeight());

        System.out.println("\nSORTED BY WEIGHT: ");
        for (Person niesort : persons) {
            System.out.println(niesort);
        }
        System.out.println();

        System.out.println("FIND A PERSON BY NAME:");
        Scanner sc = new Scanner(System.in);

        //try {
            String findByName = sc.next();

            for (int i = 0; i <= persons.size() - 1; i++) {

                if (findByName.equalsIgnoreCase(persons.get(i).getName())) {
                    System.out.println("Congratulation ! Person:" + persons.get(i).getName() + "is founded in data base");
                    break;
                } else {
                    System.out.println("Sorry ! Person:" + persons.get(i).getName() + "is NOT founded in data base");
                    break;
                }

            }
       /* } catch(InputMismatchException ex) {
            System.err.println("Number cannot be a name"); //err- wyświetla na czerwono
            ex.printStackTrace();
        }
*/
        //InputMismatchException - unneccesary, console treat numbers like String

        System.out.println();

        System.out.println("If you want to find the oldest person put: 'maxAge' or if the fatest ' maxWeight':");
        Scanner sc1 = new Scanner(System.in);
        String findMax = sc.next();
        String Age = "maxAge";
        String Weight = "maxWeight";

        if (findMax.equalsIgnoreCase(Age)) {


            int maxAge = persons.get(0).getAge();
            for (int j = 0; j <= persons.size() - 1; j++) {

                if (persons.get(j).getAge() > maxAge) {
                    maxAge = persons.get(j).getAge();
                }
            }
            System.out.println("The oldest person is: " + maxAge + "years  old");

        } else if (findMax.equalsIgnoreCase(Weight)) {


            int maxWeight = persons.get(0).getWeight();
            for (int k = 0; k <= persons.size() - 1; k++) {

                if (persons.get(k).getWeight() > maxWeight) {
                    maxWeight = persons.get(k).getWeight();
                }
            }
            System.out.println("The weight of the fatest person is: " + maxWeight);
        }
    }
}
