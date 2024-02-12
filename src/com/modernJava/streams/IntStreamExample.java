package com.modernJava.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {
    public static void main(String[] args) {
        //using of
        IntStream numbers = IntStream.of(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println);

        System.out.println("-----------");

        //iterate
        numbers = IntStream.iterate(0, i -> i + 2).limit(5);
        numbers.forEach(System.out::println);

        System.out.println("-----------");

        //Random generator
        numbers = IntStream.generate(new Random()::nextInt).limit(5);
        numbers.forEach(System.out::println);

        System.out.println("-----------");

        //Range
        numbers = IntStream.range(0, 5);
        numbers.forEach(System.out::println);

        System.out.println("-----------");

        //Range closed
        numbers = IntStream.rangeClosed(6, 10);
        numbers.forEach(System.out::println);

        System.out.println("-----------");

        //Random generator


    }
}
