package com.modernJava.streams;

import java.util.Arrays;
import java.util.List;

public class StreamLimitAndSkipExample {
    public static void main(String[] args) {
        //use of Limit and skip
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> limitNum = number.stream().limit(3).toList();
        limitNum.forEach(System.out::println);

        System.out.println("----------------");
        List<Integer> skipNum = number.stream().skip(3).toList();
        skipNum.forEach(System.out::println);
    }
}
