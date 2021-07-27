package com.revature;

import com.revature.temp.Primitives;

public class Driver {
    public static void main(String[] args){

        final String URL = "https://google.com";

        System.out.println(URL);
        System.out.println(URL);

        StaticVsInstance noodleSoup = new StaticVsInstance();

        noodleSoup.printSomethingNonStatic(); // belongs to the instance

        StaticVsInstance.printSomethingStatic(); // belongs to the class

        //byte b, short s, int i, long l
        Primitives primitives = new Primitives((byte)1,(short)5,10,15);

        System.out.println(primitives.getB()); // prints 1
        primitives.setB((byte)100);
        System.out.println(primitives.getB()); // prints 100

        System.out.println(primitives.s); // prints 5
        primitives.s = 20;
        System.out.println(primitives.s); // print 20



    }
}
