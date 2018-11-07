package com.company.personalData;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Person> {

    public int compare(Person o1, Person  o2) {
        int age = o1.getAge() - o2.getAge();
        if (age == 0) {
            return o1.compareTo(o2);
        }
        return age;
    }
}
