package com.modernJava.optional;

import java.util.Optional;

public class OptionalOfExample {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.of("Hey there");
//        Optional<String> optionalString = Optional.of(null);
        System.out.println(optionalString);

        System.out.println(getWords());
    }

    public static Optional<String> getWords() {
        String[] words = new String[10];
        Optional<String> word = Optional.ofNullable(words[2]);
        if (word.isPresent())
            return word;
        return Optional.empty();
    }
}
