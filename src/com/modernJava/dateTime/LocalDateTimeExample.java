package com.modernJava.dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        System.out.println("----Local date Time----");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime1);

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().plusHours(4);
        Duration duration = Duration.between(localTime, localTime1);
        System.out.println("duration: " + duration.toMinutes());
    }
}
