package com.modernJava.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("Sequential: " + IntStream.rangeClosed(1, 100).sum());
        System.out.println("Parallel: " + IntStream.rangeClosed(1, 100).parallel().sum());
    }
}
