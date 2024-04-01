package com.modernJava.streams;

import java.util.*;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> integerList = Arrays.asList();
        int sum = integerList.stream()
                //0 +1=1    //10+5=15       //36+9 = 45
                //1+2=3     //15+6 = 21
                //3+3=6     //21+7 = 28
                //6+5=10    //28+8 = 36
                .reduce(0, Integer::sum);
        System.out.println(sum);

        int multiplication = integerList.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(multiplication);

        //using reduce but 2nd type
        Optional<Integer> optional = integerList.stream()
                .reduce(Integer::sum);

        optional.ifPresent(System.out::println);

        System.out.println("----");
        Optional<Integer> division = integerList.stream().reduce(Integer::divideUnsigned);
        int division1 = integerList.stream().reduce(1, Integer::divideUnsigned);
        division.ifPresent(System.out::println);
        System.out.println(division1);

//        if (optional.isPresent()) {
//            System.out.println(optional.get());
//        }
    }
}
