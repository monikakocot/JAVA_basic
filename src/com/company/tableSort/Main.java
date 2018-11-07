package com.company.tableSort;

/*
Application for read words from the file ".txt" and:

- Show the sorted array of words by method:
getWords - returns a sorted array of all words
- Show words as array like pairs of:
unique word - number of occurrences by method: getUniqueWordsCount
- Show sorted words with the number of occurrences by number of occurence.

 */
public class Main {

    public static void main(String[] args) {

        SortedWordsFromFile swf = new SortedWordsFromFile("1.txt");

        System.out.println("Method getWords");
        System.out.println();
        WordTab[] ws = swf.getWords();

        System.out.println("Method getUniqueWordsCount");
        WordsCount[] wc = swf.getUniqueWordsCount();

        System.out.println();
        System.out.println("Number of unique (not repeated) words: " + wc.length);

        System.out.println();
        System.out.println("Show the words with the number of instances of it");

        for (int i=0; i<wc.length; i++) {
            System.out.println(wc[i].toString());}

        System.out.println();
        System.out.println("Sorted by number of occurrences from the largest:");
        WordsCount.sortByCount(wc);
        for (int i=0; i<wc.length; i++) System.out.println(wc[i].toString());
    }

}
