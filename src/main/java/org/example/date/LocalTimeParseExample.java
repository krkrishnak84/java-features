package org.example.date;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeParseExample {

    public static void main(String[] args) {

        // Parse a String in ISO Time format (HH:mm:ss) to LocalDate
        LocalTime time1 = LocalTime.parse("12:30:45");
        System.out.println(time1);

        // Parse a String in a custom date format to LocalTime using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalTime time2 = LocalTime.parse("28/02/2020 16:45:30",dateTimeFormatter);
        System.out.println(time2);
    }
}
