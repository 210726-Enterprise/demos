package com.revature;

import com.revature.exceptions.NoodleSoupException;

import java.util.Scanner;

public class Driver {
    public static void main(String args[]){
        userInput();

        //throwable : parent class of the exception/error hierarchy
        //throws : a way to tell the compiler that a method or class might throw a specific exception. provided in the method signature
        //throw : the act of ACTUALLY throwing an exception
    }



    public static void userInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number");
        int num2 = scanner.nextInt();

        System.out.println("Sum: " + (num1 + num2));
    }
}
