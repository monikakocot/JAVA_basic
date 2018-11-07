package com.company.boxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Define the BOX class which contains boxes of given sizes (width, height).

Create methods:

- combining boxes diagonally (the new box has a width equal to the sum of the width of the boxes and the height equal
to the sum of the height of the boxes).
- combining boxes horizontally (the new box has a width equal to the sum of the width of the boxes and the height equal
to MAX from the height of the boxes).
- combining boxes vertically (the new box has a height equal to the sum of the height of the boxes and a width equal
to MAX from the width of the boxes).


 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the width and then the height of the box. Put '0' aftes last box");
        Scanner sc = new Scanner(System.in);
        int width, height;

        List<Box> boxes = new ArrayList<Box>();

        while ((width = sc.nextInt())!=0 && (height = sc.nextInt())!=0) {
            boxes.add(new Box(width,height));
        }
        System.out.println("FINISH");

        System.out.println();
        System.out.println("Now I have boxes:");

        System.out.println(boxes);

        System.out.println();
        System.out.println("Using method 'showBoxes' Now I have boxes:");

        Box.showBoxes(boxes);

        System.out.println();
        System.out.println("Combine the first 2 diagonally, 2 sequentially Vertical, 2 last Horizontal:");
        System.out.println("After connection I have:");


        Box.combinePairsOfBoxes(boxes);

        System.out.println();
        System.out.println("Combine all the pairs of boxes diagonally:");
        System.out.println("After connection I have:");

        // !!!!!!!!!!!!!!!!!!!!IT DOESNT WORK CORRECTLY !!!!!!!!!!!!
        Box.combineAllPairsDiagonally(boxes);
    }
}