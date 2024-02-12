package com.modernJava.streams;

import java.util.Random;
import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        //using off
        LongStream longStream = LongStream.of(1, 2, 3, 4, 5);
        longStream.forEach(System.out::println);

        System.out.println("-----------");

        //iterate
        longStream = LongStream.iterate(0, i -> i + 1).limit(5);
        longStream.forEach(System.out::println);

        System.out.println("-----------");

        //Random Generate
        longStream = LongStream.generate(new Random()::nextInt).limit(5);
        longStream.forEach(System.out::println);

        System.out.println("-----------");

        //range
        longStream = LongStream.range(0, 5);
        longStream.forEach(System.out::println);

        System.out.println("-----------");

        //rangeCLosed
        longStream = LongStream.rangeClosed(6, 10);
        longStream.forEach(System.out::println);
    }
}
