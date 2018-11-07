package com.company.tableSort;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;

public class SortedWordsFromFile {

    private String fileName;

    public SortedWordsFromFile(String name){
        this.fileName = name;
    }
    final static Charset ENCODING = StandardCharsets.UTF_8;

    // getWords - returns a sorted array of all words

    WordTab[] getWords() {

        ArrayList<String> sortedWords = new ArrayList<>();
        Path path = Paths.get(fileName);
        String word;
        try (Scanner scanner =  new Scanner(path, ENCODING.name())){
            while (scanner.hasNext()){
                word = scanner.next();
                try{
                    sortedWords.add(word);
                }
                catch(NullPointerException e){
                    sortedWords.add(word);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(sortedWords);

        System.out.println("SORTED WORDS: ");
        for (String sort : sortedWords) {
            System.out.println(sort);
        }

        // change from the list to array

        WordTab [] wordsTab = new  WordTab [sortedWords.size()+1];

        for (int i = 0;i<sortedWords.size();i++)
        {
            try {
                wordsTab[i++] = new WordTab(sortedWords.get(i));
            }
            catch(NullPointerException e){
                sortedWords.add(sortedWords.get(i));
            }
        }

        return wordsTab;

    }

    // getUniqueWordsCount - returns tables of WordsCount class objects, fragments is a pair: unique word - number of occurrences.

    WordsCount[] getUniqueWordsCount(){
        HashMap<String,Integer> wordsCounts = new HashMap<String,Integer>();

        Path path = Paths.get(fileName);
        String word;
        try (Scanner scanner =  new Scanner(path, ENCODING.name())){
            while (scanner.hasNext()){
                word = scanner.next();
                try{
                    wordsCounts.put(word, wordsCounts.get(word)+1);
                }
                catch(NullPointerException e){
                    wordsCounts.put(word, 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // change from the list to array
        WordsCount[] words = new WordsCount[wordsCounts.size()];

        int i = 0;
        for (Entry<String, Integer> entry : wordsCounts.entrySet())
        {
            words[i++] = new WordsCount(entry.getKey(),entry.getValue());
            System.out.println(entry);
        }

        return words;
    }


}

