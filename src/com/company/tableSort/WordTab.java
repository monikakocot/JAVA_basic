package com.company.tableSort;

public class WordTab implements Comparable<WordTab> {

    private String word;

    public WordTab(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return this.word;
    }

    @Override
    public int compareTo(WordTab o) {
        int compareWord = word.compareTo(o.word);
        return compareWord;
    }
}
