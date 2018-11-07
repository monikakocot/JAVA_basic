package com.company.counterString;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;



public class Tab {

    static char[] countTab(char[] tab) {

        try {
            Map<Character, Integer> counterTab = new TreeMap<>();
            for (int i = 0; i < tab.length; i++) {
                counterTab.put(tab[i], 0);
            }
            for (int i = 0; i < tab.length; i++) {
                counterTab.put(tab[i], counterTab.get(tab[i]) + 1);
            }
            System.out.println(Collections.singletonList(counterTab));

        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Size of tab is only 4!!!");
            ex.printStackTrace();
        }

        return tab;
    }
}
