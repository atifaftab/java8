package com.modernJava.dateTime;

import java.time.ZoneId;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .forEach(System.out::println);
    }
}
