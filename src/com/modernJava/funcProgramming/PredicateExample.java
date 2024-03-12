package com.modernJava.funcProgramming;

import java.util.function.Predicate;

public class PredicateExample {
    //It will accept only one argument and return ony boolean
//    it ave one method  test()
//        package : java.util.function.Predicate;
    public static void main(String[] args) {

        //if number>10 return tre or false
        Predicate<Integer> predicate = i -> i > 10;
        System.out.println(predicate.test(14));
        System.out.println(predicate.test(5));

        System.out.println("---------------");

        //i>10 && number is even number (i%2==0)
        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        System.out.println(predicate.and(predicate1).test(16));

        System.out.println("---------------");

        //i>10 || number is even number (i%2==0)
        System.out.println(predicate.or(predicate1).test(14));

        System.out.println("---------------");

        //i>10 && number is odd (i%2!=0)
        System.out.println(predicate.and(predicate1.negate()).test(12));

        System.out.println("---------------");


        Predicate<Integer> predicate2 = i -> i > 5;
        Predicate<Integer> predicate3 = i -> i < 8;
        System.out.println(predicate2.and(predicate3).and(predicate1.negate()).test(7));
    }
}
