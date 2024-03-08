package com.modernJava.funcProgramming;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
//        InstructorFactory instructorFactory = (name, yearsOfExperience, title, gender, onlineCourse, courses) -> new Instructor(name, yearsOfExperience, title, gender, onlineCourse, courses);
//        InstructorFactory instructorFactory = Instructor::new;
//        Instructor instructor = instructorFactory.getInstructor("Atif", 7, "Sr Software engineer", "Male", true
//                , Arrays.asList("Java", "Java8", "React"));
//
//        System.out.println(instructor);
        
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.getInstructors("Atif", 7, "Sr Software engineer", "Male", true
                , Arrays.asList("Java", "Java8", "React"));
        System.out.println("instructor = " + instructor);
        
    }
}
