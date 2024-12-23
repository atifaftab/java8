package com.modernJava.funcProgramming;

import java.util.function.Function;

public class FunctionExample {
    //it take one argument and returns one, first datatype is type argument second datatype is type of return
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = i -> Math.sqrt(i);
//        Function<Integer, Double> sqrt = Math::sqrt;
        System.out.println(sqrt.apply(64));
        System.out.println(sqrt.apply(81));

        Function<String,String > upperCase = i-> i.toUpperCase();
//        Function<String, String> upperCase = String::toLowerCase;
        System.out.println(upperCase.apply("thank you"));

        Function<String, String > concat = i-> i.concat(" java world");
        System.out.println(concat.apply("Hello"));
        System.out.println(upperCase.andThen(concat).apply("You again in"));
        System.out.println(upperCase.compose(concat).apply("You again in"));



    }
}

