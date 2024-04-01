package com.modernJava.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static void main(String[] args) {
        //min using min of Stream
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //using min
        Optional<Integer> min = number.stream().min(Integer::compareTo);
        if (min.isPresent()) {
            System.out.println(min.get());
        }
        //same
        min.ifPresent(System.out::println);

        //REDUCE

        //using identity and binaryOperation
        int reduceMin = number.stream().reduce(0, (a, b) -> a < b ? a : b);
        System.out.println(reduceMin);
        //only binaryOperation
        Optional<Integer> reduceMinBinary = number.stream().reduce((a, b) -> a < b ? a : b);
        reduceMinBinary.ifPresent(System.out::println);

        //USING MIN AND MAX
        Optional<Integer> max = number.stream().reduce(Integer::max);
        max.ifPresent(System.out::println);

        Optional<Integer> min1 = number.stream().reduce(Integer::min);
        min1.ifPresent(System.out::println);


        System.out.println("---------");
//        practice
        System.out.println(number.stream().reduce(Integer::min).get());
        System.out.println(number.stream().min(Comparator.naturalOrder()).get());
        System.out.println(number.stream().reduce((a,b) -> a<b?a:b).get());
        System.out.println(number.stream().reduce(Integer::max));
    }
}
