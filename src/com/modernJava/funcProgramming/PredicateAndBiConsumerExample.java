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
        //instructor experience is 10>10
        Predicate<Instructor> instructorPredicate1 = i -> i.getYearsOfExperience() > 10;
        //biConsumer print name and courses
        BiConsumer<String, List<String>> stringListBiConsumer = (name, courses) -> System.out.println("name " + name + " and courses " + courses);

        //loop instructor and print
        instructorList.forEach(i -> {
            if (instructorPredicate.and(instructorPredicate1).test(i)) {
                stringListBiConsumer.accept(i.getName(), i.getCourses());
            }
        });
    }
}
