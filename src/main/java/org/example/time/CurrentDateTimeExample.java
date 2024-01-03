package org.example.time;

import java.time.*;

public class CurrentDateTimeExample {
    public static void main(String[] args) {

        // Current Date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date & time: " + currentDateTime);

        // Current Date and Time in a given Time zone
        ZonedDateTime currentNewYorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println(currentNewYorkDateTime);


    }
}
