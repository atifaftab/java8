package com.modernJava.funcProgramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExampleForInstructor {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();

        //all instructor who teaches online
        Predicate<Instructor> predicate = i -> i.isOnlineCourse();
//        Predicate<Instructor> predicate = Instructor::isOnlineCourse;
        //instructor experience >10
        Predicate<Instructor> predicate1 = i -> i.getYearsOfExperience() > 10;

        instructorList.forEach(i -> {
            if (predicate.test(i))
                System.out.println(i);
        });
        System.out.println("---------------");

        //is instructor teaches online and experience is >10 years
        instructorList.forEach(i -> {
            if (predicate1.and(predicate).test(i)) {
                System.out.println(i);
            }
        });
        System.out.println("-----last ---------");

        //without using if
        instructorList.stream()
                .filter(i -> predicate1.and(predicate).test(i))
//                .map(Instructor::getName)
                .forEach(System.out::println);
    }
}
