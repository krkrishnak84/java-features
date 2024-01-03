package org.example.date;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeParseExample {
    public static void main(String[] args) {

        // Parse a String in ISO DateTime format to ZonedDateTime
        ZonedDateTime dateTime1 = ZonedDateTime.parse("2020-01-31T10:15:30+01:00[Europe/Paris]");
        System.out.println(dateTime1);

        // Parse a String in a custom date time format to ZonedDateTime using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMM dd yyyy, HH:mm (VV)");
        ZonedDateTime dateTime2 = ZonedDateTime.parse("Jan 03 2024, 10:30 (America/Los_Angeles)", dateTimeFormatter);
        System.out.println(dateTime2);
    }
}
