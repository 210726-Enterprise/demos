package com.revature;

public class StaticVsInstance {

    private String something = "something";

    public static void printSomethingStatic(){
        System.out.println("Coming from static method.");
    }

    public void printSomethingNonStatic(){
        System.out.println("Coming from non-static method.");
    }

    @Override
    public String toString() {
        return something;
    }
}
