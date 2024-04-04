package com.modernJava.optional;

import java.util.Optional;

public class OptionalOrElseThrowExample {
    public static void main(String[] args) {

        //orElse
        Integer[] num = new Integer[10];
        num[1] = 5;
        Optional<Integer> optionalnum = Optional.ofNullable(num[1]);
        int result = optionalnum.orElse(-1);
        System.out.println("orElse: " + result);

        //orElseGet
        result = optionalnum.orElseGet(() -> -1);
        System.out.println("orElseGet: " + result);
    }
}
