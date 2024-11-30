package com.modernJava.lambda.functionDemo;

@FunctionalInterface
public interface FunctionDemo {

    public void show();

    default void getName() {
        System.out.println("Atif");
    }

    static void getNumber() {
        System.out.println(1);
    }
}
