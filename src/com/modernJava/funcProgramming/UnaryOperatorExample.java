package com.modernJava.funcProgramming;

import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = i -> i * 10;
        Function<Integer, Integer> function = i -> i * 10;
        //in unary we do not have to provide return type because argument type is the return type but in Function
        //we have to provide return type . So when return type is same as argument type use UnaryOperator.
        DoubleUnaryOperator doubleUnaryOperator = i -> i * 10L;
        LongUnaryOperator longUnaryOperator = i -> i * 100;

        System.out.println(unaryOperator.apply(10));
        System.out.println(function.apply(10));
        System.out.println(doubleUnaryOperator.applyAsDouble(10L));
        System.out.println(longUnaryOperator.applyAsLong(1000000000));
    }
}
