package com.company.christmasTree;
import java.util.Scanner;

/*
Simple program which draw Christmas Tree. User can choose the size of tree.
For example size = 5, the output looks like:

    *
   ***
  *****
 *******
*********

*/

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("Put the size of Christmas Tree:");
        Scanner choice = new Scanner(System.in);
        int size = choice.nextInt();

        size = size * 2;
        int i;

        for (i = 1; i <= size; i += 2) {
            for (int m = (size - i) / 2; m > 0; m--) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
