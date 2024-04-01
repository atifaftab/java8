package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.List;

public class StreamComparatorExample {
    public static void main(String[] args) {

        //returning all instructor sorted by their name
        List<Instructor> instructorList = Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName))
                .toList();

        Instructors.getAll().stream()
                        .sorted(Comparator.comparing(instructor -> instructor.getName()))
                        .toList();

        System.out.println(instructorList);
        System.out.println("---------------");
        instructorList.forEach(System.out::println);

        System.out.println("---------------");
        

        //reversed
        List<Instructor> instructorReversedList = Instructors.getAll().stream()
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .toList();

        instructorReversedList.forEach(System.out::println);
    }
}
