package com.company.maxDivine;

/*
Finding a number between 2 and 10,000 that has the largest number of divisors.
 */

public class Main {

    public static int maxDivide(int a){

        int divide=0;

        for(int j=1;j<a;j++){

            if(a%j==0)
                divide++;
        }

        return divide;
    }

    public static void main(String[] args) {

        int max;
        int nums[]=new int[10001];
        max=nums[0];
        int b=0;

        for(int i=2;i<10001;i++){

            if(maxDivide(i)>max) {
                max=maxDivide(i);
                b=i;
            }
        }
        System.out.println("The largest number of divisors: " +max+" for number : " +b);

    }
}
