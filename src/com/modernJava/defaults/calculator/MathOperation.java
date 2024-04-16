package com.modernJava.defaults.calculator;

public class MathOperation implements Calculator {
    public static void main(String[] args) {
        Calculator calculator = (i, j) -> i + j;
        System.out.println(calculator.sum(4, 2));
        System.out.println(new MathOperation().subtract(4, 2));
        System.out.println(Calculator.multiply(4, 2));
    }
    @Override
    public int sum(int num1, int num2) {
        return num2 + 2 + num1;
    }
}
