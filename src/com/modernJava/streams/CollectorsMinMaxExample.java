package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        //instructor with minimum years of experience

        Optional<Instructor> instructorMinExp = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));
//                .min(Comparator.comparing(Instructor::getYearsOfExperience));
        instructorMinExp.ifPresent(System.out::println);
        System.out.println("-----");

        instructorMinExp = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructorMinExp = " + instructorMinExp);

        System.out.println("-----");

        Optional<Instructor> instructorMaxExp = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        instructorMaxExp.ifPresent(System.out::println);
        System.out.println("-----");

        instructorMaxExp = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructorMaxExp = " + instructorMaxExp);


//        Optional<Integer> minExp = Instructors.getAll().stream()
//                .map(Instructor::getYearsOfExperience)
//                .collect(Collectors.minBy((a, b) -> a - b));
////                .min((a, b) -> a - b);
//        minExp.ifPresent(System.out::println);


        //instructor with maximum years of experience
//        Optional<Integer> maxExp = Instructors.getAll().stream()
//                .map(Instructor::getYearsOfExperience)
//                .collect(Collectors.maxBy((a, b) -> a - b));
//        maxExp.ifPresent(System.out::println);
    }
}
