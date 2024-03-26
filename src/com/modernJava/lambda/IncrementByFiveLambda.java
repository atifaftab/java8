package com.modernJava.lambda;

public class IncrementByFiveLambda {
    public static void main(String[] args) {
        IncrementByFiveInterface incrementByFiveInterface = a -> a + 5;
        System.out.println(incrementByFiveInterface.incrementByFive(10));

        IncrementByFiveInterface incrementByFiveInterface1 = a -> a+5;
        System.out.println(incrementByFiveInterface1.incrementByFive(2));
    }

}
