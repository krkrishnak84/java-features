package org.example.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeParseExample {
    public static void main(String[] args) {

        // Parse a String in ISO DateTime format (yyyy-MM-ddTHH:mm:ss) to LocalDateTime
        LocalDateTime dateTime1 = LocalDateTime.parse("2020-01-31T10:30:45");
        System.out.println(dateTime1);

        // Parse a String in a custom date format to LocalDate using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMM dd yyyy, HH:mm");
        LocalDateTime dateTime2= LocalDateTime.parse("Jul 31 2020, 10:30",dateTimeFormatter1);
        System.out.println(dateTime2);

        // Parse a String in a custom DateTime format to LocalDateTime using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm:ss a");
        LocalDateTime dateTime3 = LocalDateTime.parse("Wed, Jan 03 2024, 10:30:45 PM", dateTimeFormatter2);
        System.out.println(dateTime3);



    }
}
