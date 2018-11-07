package com.company.boxes;

import java.util.ArrayList;
import java.util.List;

public class Box {

    double width;
    double height;


    public Box(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // methods for combine boxes

    public Box joinDiagonal(Box second) {
        return new Box(this.width + second.width, this.height + second.height);
    }

    public Box joinHorizontally(Box second) {
        return new Box(this.width + second.width, Math.max(this.height, second.height));
    }

    public Box joinVertically(Box second) {
        return new Box(Math.max(this.width, second.width), this.height + second.height);
    }

    public static ArrayList<Box> showBoxes(List<Box> boxes) {

        // ArrayList<Box> returnBoxes = new ArrayList<Box>();

        for (int i = 0; i < boxes.size(); i++) {

            System.out.println(boxes.get(i));
        }
        return null;
    }

//methods for combine first 6 of boxes

//methods connecting every two pairs of boxes in a different way

    public static ArrayList<Box> combinePairsOfBoxes (List<Box> boxes) {

        for (int i = 0; i < boxes.size(); i++) {

            System.out.println(boxes.get(i).joinDiagonal(boxes.get(i+1)));
            i=i+2;

            System.out.println(boxes.get(i).joinHorizontally(boxes.get(i+1)));
            i=i+2;

            System.out.println(boxes.get(i).joinVertically(boxes.get(i+1)));
            i=i+2;
        }
        return null;
    }

    // methods combining pairs of boxes diagonally (you can have a separate analogical method for vertically and horizontally)

    // !!!!!!!!!!!!!!!!!!!!IT DOESNT WORK CORRECTLY !!!!!!!!!!!!

    public static ArrayList<Box> combineAllPairsDiagonally (List<Box> boxes) {

        //ArrayList<Box> returnBoxes = new ArrayList<Box>();

        for (int i = 0; i < boxes.size(); i++) {

            if(i==0){
                System.out.println(boxes.get(i).joinDiagonal(boxes.get(i+1)));
            }
            else if ( i%2 == 0) {
                System.out.println(boxes.get(i).joinDiagonal(boxes.get(i+1)));
                i=i+2;
            }
        }
        return null;
    }

   /* // not good method

    public static ArrayList<Box> wydzielBoxy (List<Box> boxes) {

       // ArrayList<Box> returnBoxes = new ArrayList<Box>();

        for (int i = 0; i < boxes.size(); i++) {

            if ( i== 0) {
                System.out.println(boxes.get(i).joinDiagonal(boxes.get(i+1)));
            }

            if ( i==2) {
                System.out.println(boxes.get(i).joinHorizontally(boxes.get(i+1)));
            }

            if ( i==4) {
                System.out.println(boxes.get(i).joinVertically(boxes.get(i+1)));
            }
        }
        return null;
    }
*/

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}