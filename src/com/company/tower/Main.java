package com.company.tower;
import java.util.Scanner;

/*
Simple program which draw tower. User can choose the size of tower.
For example size = 5, the output looks like:

*
**
***
****
*****

*/

public class Main {

        public static void main(String[] args) {

            System.out.println("Put the size of the tower:");
            Scanner choice = new Scanner(System.in);
            int size = choice.nextInt();
            int i;

            for (i = 1; i <= size; i++) {

                System.out.print("*");

                for (int k = 1; k < i; k++)
                {
                    System.out.print("*");
                }

                System.out.println();

            }
        }
    }

