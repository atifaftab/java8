package com.modernJava.funcProgramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerExampleForInstructor {
    public static void main(String[] args) {


        List<Instructor> instructor = Instructors.getAll();

        //looping through all instructor and printing all values of instructor
        Consumer<Instructor> consumer = i -> System.out.println(i);
//      Consumer<Instructor> consumer = System.out::println;
        instructor.forEach(consumer);
        System.out.println("--------------");

        //practice
        instructor.forEach(System.out::println);
        System.out.println("--------------");

        //looping through all instructor and printing only name of all instructor
        Consumer<Instructor> consumer1 = i -> System.out.println(i.getName());
        instructor.forEach(consumer1);

        System.out.println("--------------practice");

        //practice
        Consumer<Instructor> instructorConsumer = instructor1 -> System.out.println(instructor1.getName());
        instructor.forEach(instructorConsumer);

        System.out.println("--------------");

        //looping through all instructor and printing the name and courses
        Consumer<Instructor> consumer2 = i -> System.out.println(i.getCourses());
        instructor.forEach(consumer1.andThen(consumer2));

        System.out.println("--------------");

        //looping through all instructor and printing their name if the years of experience is >10
//        Consumer<Instructor> consumer3 = i -> {
//            if (i.getYearsOfExperience() > 10)
//                System.out.println(i.getName());
//        };
        instructor.forEach(i -> {
            if (i.yearsOfExperience > 10) System.out.println(i.getName());
        });

        //practice
        System.out.println("--------------practice");
        instructor.forEach(i -> {
            if (i.getYearsOfExperience() > 10) {
                System.out.println(i.getName());
            }
        });

        System.out.println("--------------");

//        looping through all instructors and print out their names and years of experiences  if the years of
//         experience >5 and teaches course online
        instructor.forEach(i -> {
            if (i.yearsOfExperience > 5 && (i.isOnlineCourse())) {
                consumer1.andThen(j -> System.out.println(j.yearsOfExperience)).accept(i);
            }
        });


        //test
        instructor.forEach(i -> {
            if (i.getYearsOfExperience() > 5 && i.isOnlineCourse()) {
                consumer1.andThen(j -> System.out.println(j.yearsOfExperience)).accept(i);
            }
        });
        System.out.println("--------------");

        //print name of only max experience
        Optional<Integer> maxExp = instructor.stream().map(Instructor::getYearsOfExperience).max(Integer::compareTo);
        maxExp.ifPresent(System.out::println);
        System.out.println("--------------");
        instructor.forEach(i -> {
            if (maxExp.isPresent()) {
                if (i.getYearsOfExperience() == maxExp.get()) {
                    System.out.println(i.getName());
                }
            }
        });
    }
}
