package com.modernJava.streams;

import java.util.Random;
import java.util.stream.Stream;

public class StreamFactoryMethodExample {
    public static void main(String[] args) {

        //of
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.forEach(System.out::println);

        System.out.println("-------");
        Stream<Integer> stream1 = Stream.iterate(0, i -> i + 2).limit(5);
        stream1.forEach(System.out::println);

        System.out.println("-------");
        Stream<Integer> stream2 = Stream.generate(new Random()::nextInt).limit(5);
        stream2.forEach(System.out::println);
    }
}
