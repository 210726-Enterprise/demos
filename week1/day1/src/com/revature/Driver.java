package com.revature;

import com.revature.temp.Primitives;

public class Driver {
    public static void main(String[] args) {


        final String URL = "https://google.com/";

        String string1 = "Hello"; // new string in the pool
        String string2 = " World!"; // new string in the pool
        String string3 = string1 + string2;
        string2 = "Something else";

        StringBuilder builder = new StringBuilder(); //allows a better of string concatenation. faster than StringBuffer
        StringBuffer buffer = new StringBuffer(); //slower than Builder but threadsafe


        // upcasting

        //parent            child
        Object object1 = new StaticVsInstance();
        //downcast
        //        StaticVsInstance staticVsInstance = (StaticVsInstance) new Object(); // throws a ClassCastException
        StaticVsInstance s = (StaticVsInstance) object1;

        System.out.println(s);


        builder.append("Hello");
        builder.append(" World!");
        buffer.append("Hello").append(" World!");

        StaticVsInstance noodleSoup = new StaticVsInstance();

        String print = builder.toString();

        System.out.println(print);
        System.out.println(buffer);

        System.out.println(noodleSoup.toString());

        VarArgs.example();



//        System.out.println(string1);
//        System.out.println(string2);
//        System.out.println(string1 + string2); // new string in the pool "Hello world!"
//        System.out.println(string1 + string2); // no new string created

//        System.out.println(URL);
//        System.out.println(URL);
//

//
//        noodleSoup.printSomethingNonStatic(); // belongs to the instance
//
//        StaticVsInstance.printSomethingStatic(); // belongs to the class
//
//        //byte b, short s, int i, long l
//        Primitives primitives = new Primitives((byte)1,(short)5,10,15);
//
//        System.out.println(primitives.getB()); // prints 1
//        primitives.setB((byte)100);
//        System.out.println(primitives.getB()); // prints 100
//
//        System.out.println(primitives.s); // prints 5
//        primitives.s = 20;
//        System.out.println(primitives.s); // print 20

    }
}
