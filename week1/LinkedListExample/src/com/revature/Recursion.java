package com.revature;

import com.revature.enums.Operation;

import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        while(true){
            userMenu();
        }
        //doSomething(0);

        // 0
        // 1
        // ..
        // 10
        // 11
    }


    public static int doSomething(int x){
        if(x > 10) return 0;
        System.out.println(x);
        x += 1;
        return doSomething(x);
    }

    public static void userMenu(){
        System.out.println("Main menu");
        System.out.println("Select an option:");
        System.out.println("1) addition");
        System.out.println("2) subtraction");
        System.out.println("0) exit");

        Scanner scanner = new Scanner(System.in);

        // todo: add some input validation
        int choice = scanner.nextInt();
        // 1
        switch(choice) {
            case 0:
                System.exit(0);
            case 1:
                System.out.println((int) calculate(Operation.ADD));
                break;
            case 2:
                System.out.println(calculate(Operation.SUBTRACT));
                break;
            default:
                System.out.println("You did not choose an option");
                userMenu();
        }

        // could call itself here and we wouldn't need the infinite loop
    }

    public static int addition(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();

        return num1 + num2;
    }

    public static int subtraction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();

        return num1 - num2;
    }

    public static int multiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();

        return num1 * num2;
    }

    public static int divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();

        return num1 / num2;
    }


    public static float calculate(Operation operation){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter a second number:");
        int num2 = scanner.nextInt();

        switch (operation){
            case ADD: return num1 + num2;
            case SUBTRACT: return num1 - num2;
            case MULTIPLY: return num1 * num2;
            case DIVIDE:
                if(num2 != 0){
                    return num1 / num2;
                }
        }
        return 0;
    }


}
