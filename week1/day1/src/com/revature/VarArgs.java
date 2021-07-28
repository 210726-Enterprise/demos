package com.revature;

// Variable Arguments example
public class VarArgs {

    public static void example(String ... args){

        System.out.println(args.getClass().getSimpleName());

        for(Object obj: args){
            System.out.println(obj);
        }
    }
}
