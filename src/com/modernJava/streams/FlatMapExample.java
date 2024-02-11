package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        //Get a list of all the courses which instructor offers

        Set<String> instructorSet = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        System.out.println(instructorSet);

//        List<String> coursesList = Instructors.getAll().stream()
//                .flatMap(Instructor::getCourses)
//                .toList();
    }
}
