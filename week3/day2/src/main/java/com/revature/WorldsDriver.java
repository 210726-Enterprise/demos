package com.revature;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class WorldsDriver {

    public static void main(String[] args) {
//        World naboo = new World("Naboo");
//        World tatooine = new World("Tatooine");
//        World kashyyyk = new World("Kashyyyk");
//
//        List<String> worldNames = Arrays.asList(
//                "Naboo", "Tatooine", "Kashyyyk", "Endor", "Hoth",
//                "Dagoba", "Mustafar"
//        );
//
//        World[] worldsArray;
//
//        List<World> worlds = worldNames.stream().map(World::new).collect(Collectors.toList());
//
//        //List<World> worlds = Arrays.asList(worldsArray);
//
//        worlds.get(0).setPopulation(100000);  // 4
//        worlds.get(1).setPopulation(50000);  // 5
//        worlds.get(2).setPopulation(500000); // 2
//        worlds.get(3).setPopulation(499999); // 3
//        worlds.get(4).setPopulation(500);    // 6
//        worlds.get(5).setPopulation(1000000000); // 1
//        worlds.get(6).setPopulation(2);      // 7
////
////
////        // Default order of the list. Index based, first in first out
////        System.out.println(worlds);
////
////        // sort the list based on our compareTo method definition
////        Collections.sort(worlds);
////
////        // Displays the list in Descending order
////        System.out.println(worlds);
////
//        Comparator<World> sortAscending = new Comparator<World>() {
//            @Override
//            public int compare(World o1, World o2) {
//                return o1.getPopulation() - o2.getPopulation();
//            }
//        };
////
////        // sort the list based on our new sortAscending comparator
////        Collections.sort(worlds, sortAscending);
////
////        // Display the list in Ascending order
////        System.out.println(worlds);
////
//        Comparator<World> sortByNameAscending = ((o1, o2) -> {
//            return o1.getName().compareTo(o2.getName());
//        });
////
////        Collections.sort(worlds, sortByNameAscending);
////
////        System.out.println(worlds);
////
////        Stream<World> worldsFilter = worlds.stream().filter((x) -> (x.getPopulation() > 20000 && x.getPopulation() < 1000000000));
////
////        worldsFilter.forEach(System.out::print); // this is going to print based on the above predicate
////
////        //worldsFilter.filter((x) -> x.getName().startsWith("N")).forEach(System.out::println);
////
////
////        System.out.println();
////        worlds.forEach(System.out::print);
//
//
//        // 1) interate through
//
//        // 2) reduce(BinaryOperator) used to reduce the elements of a stream to a single value
//        //      make a total population of all worlds
//
//        // 3) set a new iterator in parallel and call a terminal operator on one to see if the parallel
//        //      stream is affected
//
//        Stream<Float> streamIterated = Stream.iterate(2f, n -> n/2).limit(10);
//
////        streamIterated.forEach(System.out::println);
//
//        Predicate<World> populationConstraints = (x) -> (x.getPopulation() > 20000 && x.getPopulation() < 1000000000);
//
//        BinaryOperator<Float> bo = new BinaryOperator<Float>() {
//            @Override
//            public Float apply(Float aFloat, Float aFloat2) {
//                return aFloat * aFloat2;
//            }
//        };
//
//        //streamIterated.reduce(bo).ifPresent(System.out::println);
//
//
//        ToIntFunction<World> toIntFunction = new ToIntFunction<World>() {
//            @Override
//            public int applyAsInt(World value) {
//                return value.getPopulation();
//            }
//        };
//
//        // Long hand use of lambdas
//        //worlds.stream().mapToInt((w) -> w.getPopulation()).reduce((p1, p2) -> p1 + p2).ifPresent((total) -> System.out.println(total));
//
//        // Shorthand use of method references
//        worlds.stream()
//                .filter(populationConstraints)
//                .mapToInt(World::getPopulation)
//                .reduce(Integer::sum)
//                .ifPresent(System.out::println);
//
//        Collections.addAll(worlds, new World("Kamino"), new World("Earth"), new World("Couruscant"));
//
//        worlds.addAll(worlds);
//
//        worlds.sort(sortAscending);
//
//        worlds.forEach(System.out::println);
//
//        System.out.println();
//
//        worlds.sort(sortByNameAscending);
//
//        worlds.forEach(System.out::println);


        Optional<Integer> intOptional = Optional.of(5);

        Optional<Integer> intOptional2 = Optional.empty();

        // if a value exists, retrieve and print it
        if(intOptional.isPresent()){
            System.out.println(intOptional.get());
        }


        if(intOptional2.isPresent()){
            System.out.println(intOptional2.get());
        }
    }
}
