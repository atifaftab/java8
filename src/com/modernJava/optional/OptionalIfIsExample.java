package com.modernJava.optional;

import java.util.Optional;

public class OptionalIfIsExample {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.ofNullable("Java Rocks! ");
        if (optionalS.isPresent())
            System.out.println(optionalS.get());
        optionalS.ifPresent(System.out::println);
    }
}
