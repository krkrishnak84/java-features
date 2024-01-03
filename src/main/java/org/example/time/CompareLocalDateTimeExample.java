package org.example.time;

import java.time.LocalDateTime;

public class CompareLocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.of(2024,1,3,8,55,45);

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
