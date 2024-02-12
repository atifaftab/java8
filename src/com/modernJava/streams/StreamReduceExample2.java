package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the instructor who has the highest years of experience
        Optional<Instructor> yearsOfExperienceOptional = Instructors.getAll().stream()
                .reduce((a, b) -> a.getYearsOfExperience() > b.getYearsOfExperience() ? a : b);
        yearsOfExperienceOptional.ifPresent(System.out::println);

    }
}
