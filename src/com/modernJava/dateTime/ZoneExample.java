package com.modernJava.dateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class ZoneExample {
    public static void main(String[] args) {
        ZoneId.getAvailableZoneIds().stream()
                .forEach(System.out::println);

        System.out.println();
        System.out.println("Indian: " + LocalDateTime.now(ZoneId.of("Indian/Maldives")));
        System.out.println();
        System.out.println("---------");
        System.out.println("Malaysia time");
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kuala_Lumpur")));

        System.out.println();
        System.out.println("---------");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(LocalDateTime.now(ZoneId.of("America/New_York")));
        System.out.println(localDateTime.atOffset(ZoneOffset.ofHours(-12)));
    }
}
