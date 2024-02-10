package com.modernJava.funcProgramming;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateExample3 {
    public static void main(String[] args) {
        IntPredicate intPredicate = i -> i > 1000;
        LongPredicate longPredicate = i -> i > 100L;
        DoublePredicate doublePredicate = i -> i > 21.2;

        System.out.println(intPredicate.test(14652));
        System.out.println(longPredicate.test(210L));
        System.out.println(doublePredicate.test(88.89));

    }
}
