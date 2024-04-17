package com.modernJava.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.*;

public class DateModifyExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        System.out.println(localDate.plusDays(5));
        System.out.println(localDate.plusMonths(3));
        System.out.println(localDate.plusYears(100));
        System.out.println(localDate.minusDays(4));
        System.out.println(localDate.minusMonths(4));
        System.out.println(localDate.minusYears(4));
        System.out.println(localDate.withYear(2001));
        //chrono field
        System.out.println(localDate.with(ChronoField.YEAR, 2024));

        //temporal adjuster
        System.out.println(localDate.with(TemporalAdjusters.lastDayOfMonth()));


        LocalTime localTime = LocalTime.now();
        System.out.println(LocalTime.of(10, 34, 23, 434343));
        System.out.println("-------");
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println("-------");
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());

        System.out.println(localTime.get(ChronoField.SECOND_OF_MINUTE));


        System.out.println();
        System.out.println("----MODIFYING----");
        //modifying
        System.out.println(localTime.plusHours(16));
        System.out.println(localTime.plusMinutes(45));
        System.out.println(localTime.minusMinutes(32));
        System.out.println(localTime.minusSeconds(543));
        System.out.println("----MODIFYING----1");

        System.out.println(localTime.minus(2, ChronoUnit.HOURS));
        System.out.println(localTime.with(LocalTime.MIDNIGHT));

        System.out.println("----MODIFYING----2");
        LocalTime localTimes = LocalTime.now();
        System.out.println(localTimes);
        System.out.println(localTimes.with(ChronoField.HOUR_OF_DAY, 3));

        System.out.println("----Local date Time----");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());

        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(localDateTime1);

        //Duration
    }
}
