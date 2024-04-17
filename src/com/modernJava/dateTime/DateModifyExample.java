package com.modernJava.dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalAmount;

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
    }
}
