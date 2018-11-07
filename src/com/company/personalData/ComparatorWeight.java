package com.company.personalData;

import java.util.Comparator;

public class ComparatorWeight implements Comparator<Person> {

    public int compare(Person o1, Person  o2) {
        int weight = o1.getWeight() - o2.getWeight();
        if (weight == 0) {
            return o1.compareTo(o2);
        }
        return weight;
    }
}