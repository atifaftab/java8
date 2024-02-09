package com.modernJava.funcProgramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = x -> System.out.println(x + " value of x:  " + x);
        consumer.accept("Hello Mr programmer ? How's your life ? ");
    }
}
