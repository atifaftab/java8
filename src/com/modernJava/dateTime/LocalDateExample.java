package com.modernJava.dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //using day of the year
        localDate = LocalDate.ofYearDay(1996, 60);
        System.out.println(localDate);

        localDate = LocalDate.of(2010, 04, 20);
        System.out.println(localDate);

        //get
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.print(localDate.getMonth() + ": ");
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());
        System.out.println(localDate.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
        System.out.println(localDate.get(ChronoField.DAY_OF_WEEK));
    }
}
