package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        //returning instructors sorted  by their name and have more than 10 years of experience
        List<Instructor> instructorList = Instructors.getAll().stream()
                .filter(instructor -> instructor.getYearsOfExperience() > 10)
                .sorted(Comparator.comparing(Instructor::getName))
                .toList();
        instructorList.forEach(System.out::println);
    }
}
