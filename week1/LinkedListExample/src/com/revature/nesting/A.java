package com.revature.nesting;

public class A {

    private String somethingPrivate = "This is private";

    private void something(){
        System.out.println("In class A");
    }

    public void printSomething(){
        // private method call
        something();
    }

    public String getSomethingPrivate(){
        return somethingPrivate;
    }
}
