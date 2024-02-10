package com.modernJava.funcProgramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
//        Predicate<Instructor> instructorPredicate1 = i -> i.getYearsOfExperience()>10;
        Predicate<Instructor> instructorPredicate = ConvertToMethodReferenceExample::greaterThanTenYearsOfExperience;
        Instructors.getAll().forEach(instructor -> {
            if (instructorPredicate.test(instructor))
                System.out.println(instructor);
        });
    }

    public static boolean greaterThanTenYearsOfExperience(Instructor instructor) {
//        if(instructor.getYearsOfExperience()>10)
//            return true;
//        return false;
        return instructor.getYearsOfExperience() > 10;
    }
}
