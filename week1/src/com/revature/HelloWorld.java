package com.revature;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class HelloWorld {
    public static void main (String args[]){
        Person person = new Person();
        person.speak();

        Person alex = new Person("Alex", 29, "Medium rare eggs", 1.25);
        alex.speak();


        // 8 primitives in Java

        byte b; //8bit integer
        short s; //16 bit integer
        int i; //32 bit integer
        long l; //64 bit integer
        float f; //32 bit floating point
        double d; //64 bit floating point
        char c; //16 bit unicode character
        boolean boo; // 0 or a 1 true/false

        // Wrapper class equivalents
        Byte b2;
        Short s2;
        Integer i2;
        Long l2;
        Float f2;
        Double d2;
        Character c2;
        Boolean boo2;

    }

    public static String helloString(){
        return "Hello World!";
    }
}
