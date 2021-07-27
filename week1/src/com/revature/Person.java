package com.revature;

public class Person {
    // Class Members or Member Variables
    String name;
    int age;
    String catchphrase = "Bazinga!";
    double height;

    // created a new constructor
    public Person(String name, int age, String catchphrase, double height){
        this.name = name;
        this.age = age;
        this.catchphrase = catchphrase;
        this.height = height;
    }

    public Person(){
        // default constructor
    }

    public void speak(){
        System.out.println(catchphrase);
    }
}
