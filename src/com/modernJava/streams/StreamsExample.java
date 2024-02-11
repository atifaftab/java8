package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //creating a map of names and courses of instructors who teaches online and have more than 10 years of experience

        Predicate<Instructor> isOnlineCoursePredicate = Instructor::isOnlineCourse;
        Predicate<Instructor> moreThan10yearsOfExperiencePredicate = i -> i.getYearsOfExperience() > 10;

//        List<Instructor> list = Instructors.getAll().stream()
//                .filter(isOnlineCoursePredicate)
//                .filter(moreThan10yearsOfExperiencePredicate)
//                .toList();
//        System.out.println(list);

        Map<String, List<String>> nameAndCourseMap = Instructors.getAll().stream()
                .filter(isOnlineCoursePredicate)
                .filter(moreThan10yearsOfExperiencePredicate)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
        System.out.println(nameAndCourseMap);
    }
}
