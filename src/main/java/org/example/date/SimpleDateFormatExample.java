package org.example.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("E, MMM dd yyyy, hh:mm:ss a");
        String dateStr = "2020-12-31 10:30:30";
        String dateStr1 = "Fri, Jul 31 2020, 10:30:45 PM";
        try {
            Date date = dateFormat.parse(dateStr);
            Date date1 = dateFormat1.parse(dateStr1);
            System.out.println("Format String to date:: "+ date);
            System.out.println("Format String to date:: "+ date1);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
