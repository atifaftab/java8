package com.modernJava.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample1 {
    public static void main(String[] args) {
        //Group list of name by their length
        List<String> name = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev");
        Map<Integer, List<String>> mapLengthName = name.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("mapLengthName = " + mapLengthName);
    }
}
