package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample1 {
    public static void main(String[] args) {
        //Group list of name by their length
        List<String> name = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> mapLengthName = name.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("mapLengthName = " + mapLengthName);
        System.out.println("-----");

        //grouping by instructors by their genders
        Map<String, List<Instructor>> mapGenderInstructor = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));
//        System.out.println("mapGenderInstructor = " + mapGenderInstructor);
        mapGenderInstructor.forEach((k, v) -> {
            System.out.println("key = " + k + " value = " + v);
        });
        System.out.println("-----");
        // grouping by experience where >10 years of experience is classified as senior and other are juniors
        Map<String, List<Instructor>> mapExperienceInstructor = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(i -> i.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"));
        mapExperienceInstructor.forEach((k, v) -> {
            System.out.println("key = " + k + " value = " + v);
        });
    }
}
