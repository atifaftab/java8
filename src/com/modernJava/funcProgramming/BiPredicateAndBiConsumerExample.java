package com.modernJava.funcProgramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateAndBiConsumerExample {
    public static void main(String[] args) {

        List<Instructor> instructorList = Instructors.getAll();

        BiPredicate<Boolean, Integer> biPredicate = (online, experience) -> online && experience > 10;
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name " + name + " courses " + courses);

        //print name and course of those instructor who teaches online and have experience more than 10 years.
        instructorList.forEach(instructor -> {
            if (biPredicate.test(instructor.isOnlineCourse(), instructor.getYearsOfExperience())) {
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
