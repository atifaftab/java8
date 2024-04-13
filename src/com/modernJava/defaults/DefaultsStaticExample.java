package com.modernJava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultsStaticExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mike", "Bob", "Salmon", "Calf", "Monkey");
//        Collections.sort(names);
//        names.forEach(System.out::println);

//        names.sort(Comparator.comparing(String::length));
        names.sort(Comparator.naturalOrder());
        System.out.println(names);
    }
}
