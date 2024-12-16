package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupMinMaxAvgExample {
    public static void main(String[] args) {
//grouping the instructor in 2 sets of online courses vs not online courses and get the max years of experience
//    of the instructor

        Map<Boolean, Optional<Instructor>> listMap = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourse,
                        Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));
        listMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v.get()));

        System.out.println("========");
        Map<Boolean, Instructor> map = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourse,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)),
                                Optional::get
                        )));
        map.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));

        System.out.println("====    Average     ====");
        //average years of experience of instructors who teaches online or not
        Map<Boolean, Double> doubleMap = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourse,
                        Collectors.averagingInt(Instructor::getYearsOfExperience)));

        doubleMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v));
    }

}
