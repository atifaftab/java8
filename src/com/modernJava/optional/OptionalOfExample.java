package com.modernJava.optional;

import java.util.Optional;

public class OptionalOfExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hey there");
//        Optional<String> optionalString = Optional.of(null);
        System.out.println(optionalString);
    }
}
