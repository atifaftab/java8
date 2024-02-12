package com.modernJava.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        //of
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.2, 3.4, 4.8, 5.0);
        doubleStream.forEach(System.out::println);

        System.out.println("-----------");

        //iterate
        doubleStream = DoubleStream.iterate(1, i -> i * 2.4).limit(5);
        doubleStream.forEach(System.out::println);

        System.out.println("-----------");

        //generate
        doubleStream = DoubleStream.generate(new Random()::nextInt).limit(7);
        doubleStream.forEach(System.out::println);

        System.out.println("-----------");

        //range
        doubleStream = LongStream.range(1, 5).asDoubleStream();
        doubleStream.forEach(System.out::println);

        System.out.println("-----------");

        //rangeclosed
        doubleStream = LongStream.rangeClosed(8, 14).asDoubleStream();
        doubleStream.forEach(System.out::println);
    }
}
