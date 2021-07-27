package com.revature;

public class StaticVsInstance {
    public static void printSomethingStatic(){
        System.out.println("Coming from static method.");
    }

    public void printSomethingNonStatic(){
        System.out.println("Coming from non-static method.");
    }
}
