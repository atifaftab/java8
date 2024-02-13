package com.modernJava.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;
        IntStream numStream = IntStream.rangeClosed(0, 10);
        numbers = numStream.boxed().collect(Collectors.toList());
        numbers.forEach(System.out::println);

        System.out.println("----");
        Optional<Integer> sunNum = numbers.stream().reduce(Integer::sum);   //  .reduce((a,b)-> a+b)
        int sumInt = numbers.stream().reduce(0, (a, b) -> a + b);   //  .reduce((a,b)-> a+b)
        sunNum.ifPresent(System.out::println);
        System.out.println(sumInt);

        System.out.println("----");
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();   //  .mapToInt(i -> i)
        System.out.println(sum);
    }
}
