package com.modernJava.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[10];
//        System.out.println(intArr[1].intValue());

        Optional<Integer> num = Optional.ofNullable(intArr[2]);
        System.out.println(num);

        System.out.println("-----");
        int checkNum = num.isPresent() ? num.get() : -1;
//        int checkNum = num.orElse(0);
        System.out.println(checkNum);
    }
}
