package com.modernJava.streams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        //sum
        int sum = IntStream.rangeClosed(1, 1000).sum();
        System.out.println(sum);

        //min
        OptionalInt min = IntStream.rangeClosed(0, 1000).min();
        min.ifPresent(System.out::println);

        OptionalInt max = IntStream.rangeClosed(0, 1000).max();
        max.ifPresent(System.out::println);

        //average
        OptionalDouble average = IntStream.rangeClosed(0, 1000).average();
        average.ifPresent(System.out::println);
    }
}
