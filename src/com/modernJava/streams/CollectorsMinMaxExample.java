package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        //instructor with minimum years of experience
        Optional<Integer> minExp = Instructors.getAll().stream()
                .map(Instructor::getYearsOfExperience)
                .collect(Collectors.minBy((a, b) -> a - b));
        minExp.ifPresent(System.out::println);
    }
}
