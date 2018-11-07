package com.company.gameWords;

import java.util.Random;
import java.util.Scanner;

/*
A simple game of guessing words.
The program shows an incomplete word - part of the letters is hidden under "*".
The number "*" in the word increases with each subsequent round.
 */

public class Game {
    public static void main(String[] args) {

        String [] words = {"flower","book","tiger","table", "glass", "beer", "enginee","orange"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // fails - to caunt wrong answers

        int fails=0;

        // round - the number of your round

        int round =0;

        String response;

        while (fails <=3){

            String word = words[random.nextInt(words.length)];
            String hashWord = word;

            // 4. Increasing of the number of 'stars' ine the word with every next round

            for(int i=0;i<round;i+=5) {

                char randomChar = hashWord.charAt(random.nextInt(hashWord.length()));

                if(randomChar =='*'){
                    i--;
                    continue;
                }

                hashWord = hashWord.replaceFirst(String.valueOf(randomChar), "*");
            }

            System.out.println("Your random word is: " + hashWord);
            System.out.println("Put your answer: ");
            response=scanner.nextLine();

            if(word.equalsIgnoreCase(response)){
                System.out.println("Congratulation!");
                round++;
            }

            else {

                System.out.println("Your answer is wrong. Try again");

                fails++;
            }
        }

        System.out.println("Game Over! Points:" + (round));
    }
}
