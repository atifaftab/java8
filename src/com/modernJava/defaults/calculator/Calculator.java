package com.modernJava.defaults.calculator;

@FunctionalInterface
public interface Calculator {
    int sum(int num1, int num2);

    //we can not write 2nd abstract method as this is Functional interface
//    int divide(int num1, int num2);

    default int subtract(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }
}
