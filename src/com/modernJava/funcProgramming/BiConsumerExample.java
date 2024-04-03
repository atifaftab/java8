package com.modernJava.funcProgramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        //BiConsumer will take 2 param and will not return anything
        //print 2 number
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("x : " + a + ", b : " + b);
        biConsumer.accept(10, 100);

        //calculating sum of 2 numbers
        BiConsumer<Integer, Integer> biConsumer1 = (a, b) -> System.out.println("sum of " + a + " and " + b + " is " + (a + b));
        biConsumer1.accept(4, 13);

        //concatenate String
        BiConsumer<String, String> biConsumer2 = (a,b) -> System.out.println(a.concat(b));
        biConsumer2.accept("how ", "are you ?");

    }
}
