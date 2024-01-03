package org.example.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateParseExample {

    public static void main(String[] args) {

        // Parse a String in ISO Date format (yyyy-MM-dd) to LocalDate
        String dateStr = "2020-02-28";
        LocalDate date1 = LocalDate.parse(dateStr);
        System.out.println("Local Date : "+ date1);

        // Parse a String in a custom date format to LocalDate using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date2= LocalDate.parse("28-02-2020", dateTimeFormatter);
        System.out.println(date2);

        // Parse a String in a custom date-time format to LocalDate using DateTimeFormatter
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("E, MMM dd yyyy, hh:mm:ss a");
        LocalDate date3 = LocalDate.parse("Fri, Feb 14 2020, 10:20:50 PM",dateTimeFormatter1);
        System.out.println(date3);

    }
}
