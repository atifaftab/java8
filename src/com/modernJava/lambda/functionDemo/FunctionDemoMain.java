package com.modernJava.lambda.functionDemo;

public class FunctionDemoMain {
    public static void main(String[] args) {
        FunctionDemo functionDemo = () -> System.out.println("King of the Ring");
        functionDemo.show();
        FunctionDemo.getNumber();
    }
}
