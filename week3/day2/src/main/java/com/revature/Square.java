package com.revature;


/*
    Square will have a single method to calculate the square of an integer

    A functional interface can have only ONE target method
 */

@FunctionalInterface
public interface Square {

    // this is the target or the functional method
    int calculate(int x);
}
