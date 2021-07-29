package com.revature;

import com.revature.model.Nose;
import com.revature.model.Person;
import com.revature.nesting.C;

public class WideningDriver {
    public static void main(String[] args) {

//        short s1 = 130;
//
//        byte b = 10; // max value in can have is -128 <= b <= 127
//
//        byte b2 = (byte) s1;
//
//        //System.out.println("narrowing of 130 from a short to a byte: " + b2);
//
//
//        // widening (also known as upcasting)
//        short s = b;
//        int i = b;
//        long l = b;
//        float f = b;
//        double d = b;
//
//        // A a = new B(); -> upcasting
//        // B b = (B) new A(); -> downcasting
//
//        // say that class B has a doSomething() method
//        // a.doSomething() is not valid id it is not declared in class A
//
//        // b.doSomething()
//
//        System.out.println("short value : "+ s);
//        System.out.println("int value : "+ i);
//        System.out.println("long value : "+ l);
//        System.out.println("float value : "+ f);
//        System.out.println("double value : "+ d);
//
//        float newVal = 12.555555f;
//
//        // an example of narrowing (also downcasting). we need to explicitly cast it
//        i = (int)newVal;
//        s = (short)newVal;
//        l = (long)newVal;
//
//        System.out.println("short value : "+ s);
//        System.out.println("int value : "+ i);
//        System.out.println("long value : "+ l);


        Person person = new Person();
        Nose nose = new Nose();
        nose.setShape("Banana");
        nose.setPierced(true);
        person.setName("Brandon");
        person.setNose(nose);

        System.out.println("Name: " + person.getName());
        System.out.println("Nose: " + person.getNose().isPierced() + " " + person.getNose().getShape());


        Person person2 = new Person(
                "Squdward",
                new Nose(
                        "Eggplant",
                        true
                )
        );

        System.out.println(person2);

        System.out.println(person2.equals(person));


        // User
        // username -> string
        // password -> string
        // userId -> int
        // account -> Account
        // address -> Address

        // Account
        // accountNumber -> int
        // balance -> float

        // Address
        // streetNumber -> int
        // street -> string
        // city -> string
        // state -> string
        // zip -> int


        /*

        User user = new User(
            new Account( ... whatever this ctor need),
            new Address( ... whatever it needs)
        );



        user.getAddress()
        user.getAccount().getBalance()
        */


        C newC = new C();

        System.out.println(newC.getSomething());
    }
}
