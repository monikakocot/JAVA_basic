package com.company.phoneBook;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // FIRST CONTACT

        ContactModel contactModel = new ContactModel("Fredie", "Kowalski");

        contactModel.addNumber(
                new NumberModel("123-123-123", "work", true));
        contactModel.addNumber(
                new NumberModel("321-321-321", "home", true));

        // SECOND CONTACT

        ContactModel nextContactModel = new ContactModel("Adam", "Górka");
        NumberModel next = new NumberModel("222-333-444","home",true);
        NumberModel next1 = new NumberModel("222-333-444","home",false);
        NumberModel next2 = new NumberModel("222-425-555","work",true);
        ArrayList<NumberModel> list = new ArrayList<>();
        list.add(next);
        list.add(next1);
        list.add(next2);
        nextContactModel.addNumber(list);

        /*
        nextContactModel.addNumber(
                new NumberModel("888-888-888", "home", false));
        nextContactModel.addNumber(
                new NumberModel("800-600-222", "work", true));
        */

        System.out.println("Show the numbers of  FIRST contacts: ");

        for (NumberModel contactNumbers : contactModel.getNumbers()) {
            System.out.println(contactNumbers);
        }

        System.out.println();
        System.out.println("Show the numbers of  SECOND contacts: ");

        for (NumberModel nextContactNumbers : nextContactModel.getNumbers()) {
                System.out.println(nextContactNumbers);
        }

        System.out.println();
        System.out.println("Check if Conctacs are the same: ");
        System.out.println(contactModel.equals(nextContactModel));

        System.out.println();
        System.out.println("Show me the numbers of FirsttContact: ");
        System.out.println(nextContactModel.getNumbers());

        System.out.println();
        System.out.println("Check if FirstContact has active numbers: ");

        contactModel.hasActiveNumbers();

        System.out.println();
        System.out.println("Check if SecondContact has active numbers: ");

        nextContactModel.hasActiveNumbers();
    }
}