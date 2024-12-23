package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.stream.Collectors;

public class CollectorsSummingAveragingExample {
    public static void main(String[] args) {
        //sum of years of experience of all Instructor
        System.out.println("SUM:");
        System.out.println(Instructors.getAll().stream()
                .map(Instructor::getYearsOfExperience)
                .reduce(Integer::sum).get());

        System.out.println(Instructors.getAll().stream()
                .mapToInt(Instructor::getYearsOfExperience)
                .sum());

        System.out.println(Instructors.getAll().stream()
                .map(Instructor::getYearsOfExperience)
                .mapToInt(Integer::intValue)
                .sum());

        System.out.println("----");

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
