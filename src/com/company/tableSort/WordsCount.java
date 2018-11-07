package com.company.tableSort;

import java.util.Arrays;

public class WordsCount implements Comparable {
    private String word;
    private int count;

    public WordsCount(String word,int count){
        this.word = word;
        this.count = count;
    }

    @Override
    public String toString(){
        return this.word+" "+count;
    }

    @Override
    public int compareTo(Object o) {
        WordsCount second = (WordsCount)o;
        if ( second.count>this.count){
            return 1;
        }else if (second.count == this.count){
            return 0;
        }else{
            return -1;
        }
    }

    public static void sortByCount(WordsCount[] wc) {
        Arrays.sort(wc);
    }

}
