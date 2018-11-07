package com.company.equation;

import java.util.Scanner;

/*

Quadratic equation
 */
public class Main {
    public static void main(String[] args)
    {

        System.out.println(" Quadratic equation looks like: ax^2+bx+c");

        System.out.println("Put a:");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();

        System.out.println("Put b:");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();

        System.out.println("Put c:");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();

        System.out.println("Your equation is:");
        System.out.print(a);
        System.out.print("x^2+");
        System.out.print(b);
        System.out.print("x+");
        System.out.println(c);


        double delta = b*b - 4*a*c;
        if (delta < 0)
        {
            System.out.println("There are no roots of the equation");
        }
        else if (delta==0)
        {
            System.out.println("x1:");
            System.out.println((-b) / (2 * a));
        }
        else if (delta > 0)
        {

            System.out.println("x1:");
            System.out.println((-b+Math.sqrt(delta)) / (2*a));

            System.out.println("x2:");
            System.out.println((-b-Math.sqrt(delta)) / (2*a));
        }

    }
}


