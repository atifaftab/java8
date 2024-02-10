package com.modernJava.funcProgramming;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {

    Instructor getInstructor(String name, int yearOfExperience, String title, String gender, boolean onlineCourses, List<String> courses);
}
