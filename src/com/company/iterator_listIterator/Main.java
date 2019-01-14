package com.company.iterator_listIterator;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main
{
    public static void main(String[] args)
    {
        LinkedList<String> listaPowiazana = new LinkedList<String>();

        listaPowiazana.add("lala1");
        listaPowiazana.add("lala2");
        listaPowiazana.add("lala3");
        listaPowiazana.add("lala4");

        System.out.println("WYPISANIE FOR: ");
        for (int i = 0; i < listaPowiazana.size(); i++)
        {
            System.out.println(listaPowiazana.get(i));
        }


        System.out.println("WYPISANIE ITERATOR: ");
        Main.wypiszElementyListy(listaPowiazana);

        ListIterator<String> iter = listaPowiazana.listIterator(listaPowiazana.size()); // iter na końcu

        System.out.println("WYPISANIE PETLA WHILE OD KONCA BO ITERATOR NA KONCU: ");
        while (iter.hasPrevious())
        {
            System.out.println(iter.previous());
            iter.set("podmiana");
        }
        System.out.println("WYPISANIE PO PODMIANIE: ");
        Main.wypiszElementyListy(listaPowiazana);

        iter = listaPowiazana.listIterator();
        iter.next();
        iter.add("nowylala");
        //iter.remove();//usuwa poprzednika

        System.out.println("WYPISANIE PO dodaniu nowylala: ");
        Main.wypiszElementyListy(listaPowiazana);
        
    }

    public static void wypiszElementyListy(LinkedList<?> lista)
    {

        Iterator iteratorListy = lista.iterator(); // iter na początku
        while(iteratorListy.hasNext())
            System.out.println(iteratorListy.next());

        System.out.println();
    }
}
