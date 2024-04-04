package com.modernJava.optional;

import java.util.Optional;

public class OptionalOfExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hey there");
//        Optional<String> optionalString = Optional.of(null);
        System.out.println(optionalString);

        getWords().ifPresent(System.out::println);
    }

    public static Optional<String> getWords() {
        String[] words = new String[10];
        words[1] = "Atif";
        Optional<String> word = Optional.ofNullable(words[1]);
        if (word.isPresent())
            return word;
        return Optional.empty();
//        return word;
    }
}
