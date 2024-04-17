package com.modernJava.dateTime;

import java.time.*;
import java.util.Date;
import java.util.Locale;

public class ConvertToLocalDateTime {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println("date: " + date);
        //date to LocalDateTime step by step
        Instant instant = date.toInstant();
        System.out.println("Instant: " + instant);
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println("Zoned Date Time: " + zonedDateTime);
        LocalDateTime localDateTime = zonedDateTime.toLocalDateTime();
        System.out.println("Local date time: " + localDateTime);

        //date to LocalDateTime oneLiner
        LocalDateTime localDateTime1 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(localDateTime1);

        System.out.println("------- SQL Date -------");
        //sql date
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        System.out.println(sqlDate);
//        LocalDate localDate = sqlDate.toLocalDate();
//        System.out.println(localDate);
        System.out.println(sqlDate.toLocalDate());
    }
}
