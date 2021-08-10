package com.revature;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class ClassExercise {
    public static void main(String[] args) {
        /*
            For this exercise, work as a group to provide an implementation example for each of the following concepts.
            Once complete, leverage these interfaces across a few different Stream API methods to manipulate a list of
            objects. You can either choose to implement in-line with a lamda, or by instantiating an object of each type.
         */
            List<String> worldNames = Arrays.asList(
            "Naboo", "Tatooine", "Kashyyyk", "Endor", "Hoth",
            "Dagoba", "Mustafar"
         );

        World[] worldsArray;
        // Supplier interface -- retrieve a list
        //Supplier<String> supplier = () -> String.valueOf(worldNames);
        Supplier<String> supplier = () -> String.valueOf(worldNames.get( (int)(Math.random() * 100) % 7)).toUpperCase(); // returns a preassigned element
        System.out.println(supplier.get());

        // Consumer interface
        Consumer<String> consumer = (s) -> System.out.println(s.length() + " " + s); // (always void) takes in an argument and does something with it. Opposite of supplier
//        worldNames.stream().forEach(consumer);
          consumer.accept("Hoth");

        // Predicate interface
        Predicate<String> pred = (s) -> s.startsWith("D"); // Tests if logical expression applies to object
        for(String t: worldNames){
            System.out.println(pred.test(t));
        }

        // Reducer interface
        //System.out.println(worldNames.stream().mapToInt((n) -> n.length()).sum());
        System.out.println(worldNames.stream().mapToInt((n)->n.length()).reduce( (n1, n2) -> n1 + n2 ).getAsInt()); // Reducing a stream to a single value.
                                                                                                                    // Performs an operation on a stream and reduces it to a single value


        // Function interface
        Function<Integer,Double> function = (number) -> number/2.0; // Takes in one type and returns a different type -- (can also be same types)
        System.out.println(function.apply(7));

    }
}
