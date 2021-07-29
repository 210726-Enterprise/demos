package com.revature.model;

public class Crocodile implements Audible, Eatable {
    @Override
    public void speak() {
        System.out.println("Croaky hiss... you feel scared.");
    }

    @Override
    public void eat() {
        System.out.println("DO a barrel roll!");
    }
}
