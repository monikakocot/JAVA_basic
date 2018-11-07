package com.company.binary;


import java.util.Stack;

/*

Program which change number for binary system.
For example for "5" output should be: "101"

 */
public class Main {

    public static void main(String[] args) {

        System.out.println(toBinary(5));
    }

    public static String toBinary(int n){

        Stack<Integer> stack = new Stack<>();

        while(n!=0){
            stack.push(n%2);
            n/=2;
        }

        StringBuilder builder = new StringBuilder();

        while(!stack.empty()){
            // to the builder variable, we add a value from the top of the stack
            builder.append(stack.peek());

            //removing the first element from the top of the stack
            stack.pop();
        }

        return builder.toString();

    }
}

