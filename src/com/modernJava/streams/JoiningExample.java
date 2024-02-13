package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("A", "B", "C", "D").collect(Collectors.joining());
//        String result1 = String.join("", "A", "B", "C", "D");
        System.out.println(result);


        result = Stream.of("A", "B", "C", "D").collect(Collectors.joining(","));
//        result = String.join(",", "a,b", "c,d", "e,f");
        System.out.println(result);

        result = Stream.of("A", "B", "C", "D").collect(Collectors.joining(",", "{", "}"));
        System.out.println(result);

        //instruction names separated by ' and prefix { and suffix }
        String namesConcatenated = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println("namesConcatenated = " + namesConcatenated);

    }

    //
}
