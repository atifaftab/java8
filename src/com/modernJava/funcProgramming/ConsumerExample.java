package com.modernJava.funcProgramming;

import java.util.function.Consumer;

public class ConsumerExample {
    //    It will consume one argument and return nothing, have one method accept(),
//    package : java.util.function.Consumer
//    Consumer<String> it will accept String type
    public static void main(String[] args) {

        Consumer<String> consumer = x -> System.out.println(x + " value of x:  " + x);
        consumer.accept("Hello Mr programmer ? How's your life ? ");

        Consumer<Integer> consumerInt = i -> System.out.println(i);
        consumerInt.accept(10);
    }
}
