package org.example.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CompareZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime date1 = ZonedDateTime.of(
                LocalDateTime.of(2020,1,31,10,30,45),
                ZoneId.of("America/New_York"));

        ZonedDateTime date2 = ZonedDateTime.of(
                LocalDateTime.of(2020,1,31,10,30,45),
                ZoneId.of("Europe/Paris"));


        // isAfter() method
        if(date1.isAfter(date2)){
            System.out.println(date1 + " is after "+ date2);
        }

        // isBefore() method
        if(date1.isBefore(date2)){
            System.out.println(date1 + " is before "+ date2);
        }

        // isEqual() method
        if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to "+ date2);
        }

        // compareTo() method
        int diff = date1.compareTo(date2);
        if(diff > 0 ){
            System.out.println(date1+ " is greater than "+ date2);
        }else if(diff < 0){
            System.out.println(date1+ " is less than "+ date2);
        }else{
            System.out.println(date1+ " is equal to "+ date2);
        }

    }
}
