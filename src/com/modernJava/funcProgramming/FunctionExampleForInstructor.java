package com.modernJava.funcProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionExampleForInstructor {
    public static void main(String[] args) {
        //Map of instructor with name and years of experience
        //Function which will take List<Instructor> and return Map<String, Integer>
        //to create map of instructor who have online courses, so create predicate

        Map<String, Integer> nameExperienceMap = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getYearsOfExperience));
        List<Instructor> instructorList = Instructors.getAll();
        nameExperienceMap.forEach((name, experience) -> System.out.println("name: " + name + " experience: " + experience));

        System.out.println("===========");

        Predicate<Instructor> instructorPredicate = Instructor::isOnlineCourse;
//        Predicate<Instructor> instructorPredicate = Instructor::isOnlineCourse;
//        Function<Instructor, Map<String, Integer>> function = Instructors.getAll().stream();

        Function<List<Instructor>, Map<String, Integer>> mapFunction = instructors -> {
            Map<String, Integer> mapNameAndExperience = new HashMap<>();
            instructors.forEach(instructor -> {
                if (instructorPredicate.test(instructor)) {
                    mapNameAndExperience.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return mapNameAndExperience;
        };
        System.out.println(mapFunction.apply(instructorList));
//        System.out.println("---------------");
//
//        Map<String, Integer> stringIntegerMap = mapFunction.apply(instructorList);
//        stringIntegerMap.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
