package com.revature.model;

public class AbstractImpl extends AbstractExample{

    @Override
    public void speak() {
        super.speak();
    }

    @Override
    public void eat() {
        System.out.println("You take a bite out of a burger.");
    }

    public AbstractImpl(String sound){

        // this() is calling the no arg constructor of this instance
        this();
        this.sound = sound;
    }

    public AbstractImpl(){
        // calling the parents no arg constructor
        super();
    }


}
