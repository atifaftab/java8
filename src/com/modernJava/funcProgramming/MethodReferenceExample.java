package com.modernJava.funcProgramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> predicate = i -> i.isOnlineCourse()==true;
        Predicate<Instructor> predicate1 = Instructor::isOnlineCourse;

        Function<Integer, Double> function = i -> Math.sqrt(i);
        Function<Integer, Double> function1 = Math::sqrt;
        Function<String, String> function2 = s-> s.toLowerCase();
        Function<String, String> function3 = String::toLowerCase;
    }
}
