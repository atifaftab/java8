package com.modernJava.funcProgramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerExample {
    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();

        //all instructor who teaches online
        Predicate<Instructor> instructorPredicate = i -> i.isOnlineCourse();
//        Predicate<Instructor> instructorPredicate = Instructor::isOnlineCourse;
        //instructor experience is >10
        Predicate<Instructor> instructorPredicate1 = i -> i.getYearsOfExperience() > 10;
        //biConsumer print name and courses
        BiConsumer<String, List<String>> stringListBiConsumer = (name, courses) -> System.out.println("name " + name + " and courses " + courses);

        //loop instructor, check predicates and print consume
        instructorList.forEach(i -> {
            if (instructorPredicate.and(instructorPredicate1).test(i)) {
                stringListBiConsumer.accept(i.getName(), i.getCourses());
            }
        });

        //replacing if by filter
        System.out.println("\n----- replacing if by filter -------");
        instructorList.stream()
                .filter(i -> instructorPredicate1.and(instructorPredicate).test(i))
                .forEach(i -> stringListBiConsumer.accept(i.getName(), i.getCourses()));


        System.out.println("\n----- doing same without predicate and consumer");
        instructorList.stream()
                .filter(i -> i.getYearsOfExperience() > 10 && i.isOnlineCourse())
                .forEach(i -> System.out.println("name " + i.getName() + " and courses " + i.getCourses()));

    }
}
