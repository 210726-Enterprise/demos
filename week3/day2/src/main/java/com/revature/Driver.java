package com.revature;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Driver {
    public static void main(String[] args) {

        Square square = (x) -> x * x;
        Square cube = (x) -> x * x * x;

        int x = 5;

        System.out.println(square.calculate(x)); // 25
        System.out.println(cube.calculate(x)); // 125


        // list of strings

        List<String> names = Arrays.asList("revature", "brandon", "apples", "noodle Soup", "sourdough",
                "Carburetor", "Pillow", "Aardvark", "Angular", "Alderaan");

        // words that start with start A
        //
        Predicate<String> p = (s) -> s.startsWith("A");

        Predicate<String> containsTwoOs = (s) -> {
            boolean flag = false;
            for(char c : s.toCharArray()){
                if(c == 'o' || c == 'O'){
                    if(flag){
                        return true;
                    }
                    else{
                        flag = true;
                    }
                }

            }
            return false;
        };
        //
        Predicate<String> p2 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("A");
            }
        };

        for (String word : names){
            if(p2.test(word)){
                System.out.println(word);
            }
        }


        System.out.println(containsTwoOs.test("Boogie"));
        System.out.println(containsTwoOs.test("Bogie"));

        MemberPredicate mp = new MemberPredicate();

        mp.setNameContainsX(p2); ///

        System.out.println(mp.nameContainsX.test("Xavier"));
        System.out.println(mp.nameContainsX.test("Beluga"));
        System.out.println(mp.nameContainsX.test("Apples"));

        mp.setNameContainsX((s) -> s.contains("7"));

        System.out.println(mp.nameContainsX.test("Se7en"));
        System.out.println(mp.nameContainsX.test("Xavier"));
        System.out.println(mp.nameContainsX.test("Beluga"));


        Consumer<String> consume = word -> StringUtils.decapitalize(word);


        //System.out.println(names);
        names.forEach(word2 -> StringUtils.capitalize(word2));
        names.forEach(StringUtils::capitalize);

        names.forEach(System.out::println);

        //System.out.println(names);


    }
}
