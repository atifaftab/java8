package com.modernJava.funcProgramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerExampleForInstructor {
    public static void main(String[] args) {


        List<Instructor> instructors = Instructors.getAll();

        //looping through all instructors and printing all values of instructors
        Consumer<Instructor> consumer = i -> System.out.println(i);
//      Consumer<Instructor> consumer = System.out::println;
        instructors.forEach(consumer);
        System.out.println("--------------");

        //practice
        instructors.forEach(System.out::println);
        System.out.println("--------------");

        //looping through all instructors and printing only name of all instructors
        Consumer<Instructor> consumer1 = i -> System.out.println(i.getName());
        instructors.forEach(consumer1);

        System.out.println("------------practice using directly stream and map------------");
        Instructors.getAll().stream().map(Instructor::getName).forEach(System.out::println);

        System.out.println("-------name and courses-------");

        //looping through all instructors and printing the name and courses
        Instructors.getAll().stream().forEach(i -> {
            System.out.println(i.getName());
            System.out.println(i.getCourses());
        });
        System.out.println("-------name and course 2-------");

        Consumer<Instructor> consumer2 = i -> System.out.println(i.getCourses());
        instructors.forEach(consumer1.andThen(consumer2));

        System.out.println("------printing their name if the years of experience is >10--------");


        //looping through all instructors and printing their name if the years of experience is >10
//        Consumer<Instructor> consumer3 = i -> {
//            if (i.getYearsOfExperience() > 10)
//                System.out.println(i.getName());
//        };
        instructors.forEach(i -> {
            if (i.yearsOfExperience > 10) System.out.println(i.getName());
        });

        //same without using if
        instructors.stream().
                filter(i -> i.getYearsOfExperience() > 10)
//                .map(Instructor::getName)
                .forEach(i -> System.out.println(i.getName()));

        System.out.println("------names and years of experiences  if the years of\n" +
                "//         experience >5 and teaches course online--------");

//        looping through all instructors and print out their names and years of experiences  if the years of
//         experience >5 and teaches course online
        instructors.forEach(i -> {
            if (i.yearsOfExperience > 5 && (i.isOnlineCourse())) {
                consumer1.andThen(j -> System.out.println(j.yearsOfExperience)).accept(i);
            }
        });

        instructors.stream()
                .filter(i -> i.getYearsOfExperience() > 5 && i.isOnlineCourse())
                .forEach(i -> {
                    System.out.println(i.getName());
                    System.out.println(i.getYearsOfExperience());
                });

        //test
        instructors.forEach(i -> {
            if (i.getYearsOfExperience() > 5 && i.isOnlineCourse()) {
                consumer1.andThen(j -> System.out.println(j.yearsOfExperience)).accept(i);
            }
        });

        System.out.println("-------print name of only max experience-------");

        //print name of only max experience
        Optional<Integer> maxExp = instructors.stream().map(Instructor::getYearsOfExperience).max(Integer::compareTo);
        maxExp.ifPresent(System.out::println);
        System.out.println("--------------");
        instructors.forEach(i -> {
            if (maxExp.isPresent()) {
                if (i.getYearsOfExperience() == maxExp.get()) {
                    System.out.println(i.getName());
                }
            }
        });

//        Instructors.getAll().stream()
//                .filter(instructor -> instructor.getYearsOfExperience())                                                                                             )


    }
}
