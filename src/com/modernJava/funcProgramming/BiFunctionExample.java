package com.modernJava.funcProgramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BiFunctionExample {
    public static void main(String[] args) {
        //BiFunction 2 inputs List<Instructor> and 2nd is predicate which will filter if the instructor has online
        //courses and return a map of <String,Integer> String is name and Integer is years of experience
//        Predicate<Instructor> instructorPredicate = i -> i.isOnlineCourse();
        Predicate<Instructor> instructorPredicate = Instructor::isOnlineCourse;

        List<Instructor> instructorList = Instructors.getAll();

//        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> mapBiFunction = (instructors, predicateMapBiFunction) ->{
//            Map<String, Integer> map = new HashMap<>();
//            instructorList.stream()
//                    .filter(instructorPredicate)
//                    .collect(Collectors.toSet());
//        }

        BiFunction<List<Instructor>, Predicate<Instructor>, Map<String, Integer>> biFunction = (instructors, predicate) -> {
            Map<String, Integer> map = new HashMap<>();
            instructorList.forEach(instructor -> {
                if (predicate.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        };
//        instructorList.forEach(i-> biFunction.apply(i,instructorPredicate));
        System.out.println(biFunction.apply(instructorList, instructorPredicate));

    }
}
