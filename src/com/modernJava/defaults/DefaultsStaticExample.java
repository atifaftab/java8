package com.modernJava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DefaultsStaticExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Bob", "Salmon", "calf", "monkey");
        Collections.sort(names);
        names.forEach(System.out::println);
    }
}
