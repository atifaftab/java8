package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample3 {
    public static void main(String[] args) {

        //grouping by length of String and also checking that the names contains e and only return those names
        // which has e in it
        List<String> names = List.of("Sid", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> namesMap = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.filtering(s -> s.contains("e"), Collectors.toList())));
        System.out.println("namesMap = " + namesMap);
        System.out.println("-------------");


        // instructor grouping them by senior(>10) and junior(<10) and filter them on online courses
        Map<String, List<Instructor>> mapOnlineCoursesInstructor = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor -> instructor.getYearsOfExperience() > 10 ? "SENIOR" : "JUNIOR"
                        , Collectors.filtering(Instructor::isOnlineCourse, Collectors.toList())));

        System.out.println("mapOnlineCoursesInstructor = " + mapOnlineCoursesInstructor);
        System.out.println("-------------");

        mapOnlineCoursesInstructor.forEach((key, value) -> System.out.println("key  = " + key + " value " + value));
    }
}
