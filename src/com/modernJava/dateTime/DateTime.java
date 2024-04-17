package com.modernJava.dateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        //old api
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
        System.out.println(dateFormat.format(date));

        dateFormat = new SimpleDateFormat("HH-mm-ss");
        System.out.println(dateFormat.format(date));

        System.out.println(Calendar.getInstance().getTime());

        //new
        //local
//        DateTime dateTime =
    }
}
