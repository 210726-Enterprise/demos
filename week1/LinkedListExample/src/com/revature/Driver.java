package com.revature;

import com.revature.collection.Animal;
import com.revature.collection.Cat;
import com.revature.collection.Dog;
import com.revature.model.AbstractImpl;
import com.revature.model.Crocodile;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {

    static final int x = 10;
    int y = 10;

    public static void main(String[] args) {

        // Variable Scopes in Java
        // Class scope -> belongs to the instance of the class
        // Method scope -> belongs to that method
        // Block scope -> belongs to that block
        //^ focus mainly on above ^
        // Static "scope" -> belongs to the class itself

//        Driver driver = new Driver();
//        System.out.println(driver.y);
//        System.out.println(Driver.x);

        // Type Coercion

//        String ten = "10";
//        System.out.println(Integer.parseInt(ten) + 1 + Integer.parseInt("5")); //115? or an Error
//
//        char c = 's';
//        System.out.println(c);
//        System.out.println(++c); // going to print t?
//        System.out.println(c);

//        for(char letter = 'a'; letter <= 'z';){
//            System.out.println(++letter); //z
//        }


        /// How to print whatever character has ASCII 176

        char c = 44;

        List<Character> alphabet = new ArrayList();


        // auto boxing -> imlicitly converting our primitives to a wrapper equivalent is called boxing
        alphabet.add(c);

        // converting in the other direction implicitly from wrapper to primitive is called unboxing
        char c2 = alphabet.get(0);

        System.out.println(c2);

        String s = Character.toString((char) 176);
        System.out.println(s);


//        // Shadowing Demo
//
//        System.out.println(x); // 10
//        x = 1;
//        System.out.println(x); // 1
//        int x = 15;
//        System.out.println(x); // 15
//        System.out.println(Driver.x); // 1?
//
//        for(int i = 0; i < 1; i++){
//            // block
//            System.out.println(x);
//            System.out.println(i);
//        }
//
//
//
//        System.out.println(x);

        //System.out.println(x);
//        List<Animal> list = new ArrayList<>();
//        List<Dog> list2 = new LinkedList<>();
//
//        // these are our custom interface implementations
//        Animal dog = new Dog();
//        Animal cat = new Cat();
//
//        Dog dog1 = new Dog();
//        Cat cat1 = new Cat();
//
//        list.add(cat);
//        list.add(dog);
//
//        list2.add(dog1);
//        list2.add((Dog)dog);
//
//
//        System.out.println(getDogFromList(list));
//
//        System.out.println(dogOrCat(true));
//        System.out.println(dogOrCat(false));
//
//        Crocodile croc = new Crocodile();
//
//        croc.speak();
//        croc.eat();
//
//        AbstractImpl human = new AbstractImpl("It is Thursday my dudes... right?");
//        human.speak();

//        Animal anonymous = new Animal() {
////            @Override
////            public String speak() {
////                return "This is our own, on-the-fly speak() implementation";
////            }
//
//            @Override
//            public void eat(String food){
//                System.out.println("You eat: " + food);
//            }
//        };
//
//        String food = "Chocolate bar";
//        String food2 = "Garbage";
//
//        Animal anonymousLambda = (String f) -> {
//            System.out.println("You eat: " + f);
//        };
//
//        anonymous.eat(food);
//        anonymousLambda.eat(food2);
//        System.out.println(anonymousLambda.speak());

    }

    // This is an example of a covariant return type


    /**
     * This method retrieves a dog from a list of animals
     * @link
     *
     * @param list
     * @return Animal
     * @author Brandon Pinkerton
     */
    public static Animal getDogFromList(List<Animal> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getClass().getSimpleName().equals("Dog")){
                return list.get(i);
            }
        }
        return null;
    }

    // More covariance!
    public static Animal dogOrCat(boolean choice){

        // Because Dogs and Cats are both Animals, either one can be returned
        if(choice){
            return new Dog();
        } else{
            return new Cat();
        }
    }



}
