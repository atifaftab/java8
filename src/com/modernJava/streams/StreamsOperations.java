package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsOperations {
    public static void main(String[] args) {
        //count
        long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .count();

        //count but using avanced method
        long count1 = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .mapToLong(List::size)
                .sum();

        System.out.println(count + " " + count1);

        //distinct count
        Long distinctCount = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(distinctCount);

        //distinct courses
        List<String> distinctCourses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .toList();
        System.out.println(distinctCourses);


        //anyMatch
        boolean anyMatch = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .anyMatch(i -> i.startsWith("J"));
        System.out.println(anyMatch);

        //allMatch
        boolean allMatch = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .allMatch(i -> i.startsWith("J"));
        System.out.println(allMatch);

        //nonMatch
        boolean nonMatch = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .noneMatch(i -> i.startsWith("J"));
        System.out.println(nonMatch);
    }
}
