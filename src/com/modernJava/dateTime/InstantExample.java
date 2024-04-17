package com.modernJava.dateTime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.getNano());
        Instant instant1 = Instant.now().plusSeconds(10000);
        Duration duration = Duration.between(instant, instant1);
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(localDateTime);
    }
}
