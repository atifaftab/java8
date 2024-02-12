package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Optional;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of instructor b/w instructors who teaches online

        int yearsOfExperience1 = Instructors.getAll().stream()
                .filter(instructor -> instructor.isOnlineCourse())
                .map(Instructor::getYearsOfExperience)
                .reduce(0, (a, b) -> a + b);
        System.out.println(yearsOfExperience1);

        Optional<Integer> yearsOfExperience = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .map(Instructor::getYearsOfExperience)
                .reduce(Integer::sum);
        yearsOfExperience.ifPresent(System.out::println);
    }
}
