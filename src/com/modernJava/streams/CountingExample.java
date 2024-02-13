package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        // count number of instructor who teaches online courses
        //stream.count
        long count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .count();
        System.out.println("count = " + count);

        //Collectors.counting()
        count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .collect(Collectors.counting());
        System.out.println("count = " + count);
    }
}
