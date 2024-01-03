package org.example.time;

import java.util.Calendar;

public class CompareCalendarExample {

    public static void main(String[] args) {

        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020, 2, 20, 10, 30, 45);
        Calendar cal2 = Calendar.getInstance();
        cal2.set(2020, 12, 18, 14, 22, 30);

        // after() method
        if(cal1.after(cal2)) {
            System.out.println(cal1 + " is after " + cal2);
        }

        // before() method
        if(cal1.before(cal2)) {
            System.out.println(cal1 + " is before " + cal2);
        }

        // equals() method
        if(cal1.equals(cal2)) {
            System.out.println(cal1 + " is equal to " + cal2);
        }

        // compareTo() method
        int diff = cal1.compareTo(cal2);
        if(diff > 0) {
            System.out.println(cal1 + " is greater than " + cal2);
        } else if (diff < 0) {
            System.out.println(cal1 + " is less than " + cal2);
        } else {
            System.out.println(cal1 + " is equal to " + cal2);
        }

    }
}
