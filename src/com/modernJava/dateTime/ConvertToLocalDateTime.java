package com.modernJava.dateTime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

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
    }
}
