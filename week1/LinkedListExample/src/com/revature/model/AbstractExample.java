package com.revature.model;

abstract class AbstractExample {

    protected String sound;



    public void speak(){
        System.out.println(sound);
    }

    public abstract void eat();
}
