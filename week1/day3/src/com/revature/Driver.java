package com.revature;

import com.revature.exceptions.InsufficientFundsException;
import com.revature.exceptions.NoodleSoupException;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Driver {
    public static void main(String args[]){
        //userInput();

        //throwable : parent class of the exception/error hierarchy
        //throws : a way to tell the compiler that a method might throw a specific exception. provided in the method signature
        //throw : the act of ACTUALLY throwing an exception


        // File IO

        File newFile = new File("newFile.txt");
        try {
            newFile.createNewFile();

            // some other code that may throw something else
            throw new NoodleSoupException("New message");

        } catch (IOException|NoodleSoupException exception){
            exception.printStackTrace();
        } catch (Exception exception){
            System.out.println("In the generic Exception catch");
            exception.printStackTrace();
        } finally {
            System.out.println("We made it! Finally...");
        }



        double balance = 1000;
        double userWithdrawal = 2000;

        if(userWithdrawal > balance){
            try {
                throw new InsufficientFundsException();
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }

        // end of program
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
