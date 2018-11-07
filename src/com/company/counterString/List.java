package com.company.counterString;

import java.util.*;
import java.util.ArrayList;

public class List {

    static ArrayList count (ArrayList list) {

        Map<String, Integer> counter = new TreeMap<>();

        for (int i = 0; i < list.size(); i++) {
            counter .put(String.valueOf(list.get(i)), 0);
        }
        for (int i = 0; i < list.size(); i++) {
            counter .put(String.valueOf(list.get(i)), counter .get(String.valueOf(list.get(i))) + 1);
        }

        System.out.println(Collections.singletonList(counter));
        //System.out.println(Arrays.asList(counter));

        /*
        Collections.SingletonList will create an immutable List. An immutable List (also referred to as an unmodifiable List)
        can not have it changed. The methods to add or remove items will throw exceptions.
        A singleton. The letter contains only that item and can not be altered.

        singletonList takes an item, and creates an immutable list containing only that item.
        unmodifiableList takes a list, and creates an immutable list that references that list.
        It is analogous to the difference between add and addAll. One takes an item, one takes a list containing items.

        Arrays.asList returns a fixed-size list backed by the specified array.
        (Changes to the returned list "write through" to the array.)
        This method acts as bridge between array-based and collection-based APIs.

        Collections.singletonList(something) is immutable whereas Arrays.asList(something) is a fixed size List representation
        of an Array where the List and Array gets joined in the heap. Arrays.asList(something) allows non-structural
        changes made to it, which gets reflected to both the List and the conjoined array.

         */

        return list;
    }
}

