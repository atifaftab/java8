package com.modernJava.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[10];
//        System.out.println(intArr[1].intValue());

        Optional<Integer> num = Optional.ofNullable(intArr[2]);
        System.out.println(num);
    }
}
