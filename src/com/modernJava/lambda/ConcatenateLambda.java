package com.modernJava.lambda;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface concatenateInterface = (a, b) -> a + " " + b;
        ConcatenateInterface concatenateInterfaceByMethodReference = String::concat;
        System.out.print(concatenateInterface.concat("Mohammad", "Atif "));
        System.out.println(concatenateInterfaceByMethodReference.concat("Af", "tab"));

        ConcatenateInterface concatenateInterface1 = String::concat;
        System.out.println(concatenateInterface1.concat("I am ", "28"));
    }
}
