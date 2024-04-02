package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
    public static void main(String[] args) {

        //print the name of all instructor
        List<String> namesList = Instructors.getAll().stream()
                .map(Instructor::getName).toList();
        namesList.forEach(System.out::println);

        System.out.println("-----");
        namesList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
//        namesList = Instructors.getAll().stream().map(Instructor::getName).collect(Collectors.toList());
        namesList.forEach(System.out::println);

        System.out.println("----");
        //Instructor By years of experience with name
        Map<Integer, List<String>> mapOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));
        mapOfExperienceAndNames.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));
    }
}
