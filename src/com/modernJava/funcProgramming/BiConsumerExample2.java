package com.modernJava.funcProgramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructorList = Instructors.getAll();

        //print out name and gender of instructors
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("name " + a + " gender " + b);
        instructorList.forEach(i -> biConsumer.accept(i.getName(), i.getGender()));
        System.out.println("---------------");
        //print out name and courses
        BiConsumer<String, List<String>> listBiConsumer = (name, courseList) -> System.out.println("name " + name + " courses " + courseList);
        instructorList.forEach(i -> listBiConsumer.accept(i.getName(), i.getCourses()));
        System.out.println("---------------");
        //name and gender of all instructor who teaches online
        instructorList.forEach(i -> {
            if (i.isOnlineCourse()) {
                biConsumer.accept(i.getName(), i.getGender());
            }
        });
    }
}
