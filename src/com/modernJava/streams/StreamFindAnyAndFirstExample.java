package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFirstExample {

    public static void main(String[] args) {

        //findFirst
        Optional<Instructor> first = Instructors.getAll().stream().findFirst();
        first.ifPresent(System.out::println);

        System.out.println("-----");
        //findAny
        Optional<Instructor> any = Instructors.getAll().stream().findAny();
        any.ifPresent(System.out::println);
    }
}
