package com.modernJava.lambda;

public class HelloWorldLambda {
    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> "Hey world";
        System.out.println(helloWorldInterface.sayHelloWorld());

        HelloWorldInterface helloWorldInterface1 = () -> "yo! what's up?";
        System.out.println(helloWorldInterface1.sayHelloWorld());
    }
}

//traditional way of implementing an interface
/*
class HelloWorldTraditional implements com.modernJava.lambda.HelloWorldInterface{

    @Override
    public String sayHelloWorld() {
        return "Hello everyone";
    }

    public static void main(String[] args) {
        HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
        System.out.println(helloWorldTraditional.sayHelloWorld());
    }
}*/
