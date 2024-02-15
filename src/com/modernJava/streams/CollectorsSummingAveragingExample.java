package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.stream.Collectors;

public class CollectorsSummingAveragingExample {
    public static void main(String[] args) {

        int sum = Instructors.getAll().stream()
                .collect(Collectors.summingInt(Instructor::getYearsOfExperience));
//                .mapToInt(Instructor::getYearsOfExperience).sum();
        System.out.println("sum = " + sum);

        System.out.println("-----");

        double average = Instructors.getAll().stream()
                .collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("average = " + average);
    }
}
