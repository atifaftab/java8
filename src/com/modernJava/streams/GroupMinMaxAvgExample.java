package com.modernJava.streams;

import com.modernJava.funcProgramming.Instructor;
import com.modernJava.funcProgramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupMinMaxAvgExample {
    public static void main(String[] args) {
        Map<Boolean, Optional<Instructor>> listMap = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::isOnlineCourse,
                        Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience))));
        listMap.forEach((k, v) -> System.out.println("key: " + k + " value:" + v.get()));
    }
}
