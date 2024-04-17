package com.modernJava.dateTime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        //using day of the year
        localDate = LocalDate.ofYearDay(1996, 60);
        System.out.println(localDate);
    }
}
