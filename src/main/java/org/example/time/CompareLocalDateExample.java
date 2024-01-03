package org.example.time;

import java.time.LocalDate;

public class CompareLocalDateExample {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.now();
        LocalDate date2=  LocalDate.of(2024,5,3);

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
