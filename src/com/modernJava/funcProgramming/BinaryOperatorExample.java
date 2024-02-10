package com.modernJava.funcProgramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {

//        BinaryOperator<Integer> binaryOperator = (a,b) -> a+b;
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(10, 5));

//        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        Comparator<Integer> comparator = Integer::compareTo;
        BinaryOperator<Integer> binaryOperator1 = BinaryOperator.maxBy(comparator);
        System.out.println(binaryOperator1.apply(5, 10));
        BinaryOperator<Integer> binaryOperator2 = BinaryOperator.minBy(comparator);
        System.out.println(binaryOperator2.apply(5, 10));

        IntBinaryOperator intBinaryOperator = (a, b) -> a * b;
        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a * b;
        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;

        System.out.println(intBinaryOperator.applyAsInt(2, 2));
        System.out.println(doubleBinaryOperator.applyAsDouble(10000000, 100000));
        System.out.println(longBinaryOperator.applyAsLong(10L, 12L));
    }
}
