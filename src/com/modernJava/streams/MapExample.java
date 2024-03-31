package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        //return only instructor names from the instructor list

        //practice
        Instructors.getAll().stream()
                .map(Instructor::getName)
                .forEach(System.out::println);

        System.out.println("-----------");

        List<String> namesList = Instructors.getAll().stream()
//                .peek(i -> System.out.println(i))    peek is use for debug
                .map(Instructor::getName)
                .collect(Collectors.toList());
        System.out.println(namesList);

        List<String> namesListUpperCase = Instructors.getAll().stream()
                // .peek(System.out::println)    //peek is use for debug
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .toList();
        System.out.println(namesListUpperCase);

        Set<String> namesSetUpperCase = Instructors.getAll().stream()
                // .peek(System.out::println)    //peek is use for debug
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(namesSetUpperCase);
    }

}
