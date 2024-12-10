package com.modernJava.streams;

import java.util.*;

public class StreamMaxExample {
    public static void main(String[] args) {
        // max using stream through reduce

        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //max using stream max function
        Optional optional = numberList.stream().max(Integer::compareTo);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
//        optional.ifPresent(System.out::println);
        int maxInt = numberList.stream()
                .reduce(0,Integer::max);
        System.out.println(maxInt);

        //sum
        System.out.println("====== SUM ====");
        Optional<Integer> reduce = numberList.stream().reduce((a, b) -> a > b ? a : b);
        reduce.ifPresent(System.out::println);

        Optional<Integer> sum = numberList.stream().reduce(Integer::sum);
        sum.ifPresent(System.out::println);

        System.out.println("------");
        System.out.println(numberList.stream().max(Comparator.naturalOrder()).get());
        System.out.println(numberList.stream().max(Integer::compareTo).get());
        System.out.println(numberList.stream().reduce(0,Integer::sum));

    }
}
