package org.example.time;

import java.time.Instant;

public class CurrentEpochTimestampExample {

    public static void main(String[] args) {
        long currentTimestamp  = System.currentTimeMillis();
        System.out.println("Current epoch timestamp in millis: " + currentTimestamp);

        int sum = 0;
        for(int i = 1; i< 10000; i++){
            sum = sum + i;
        }

        long epochMilli = Instant.now().toEpochMilli();
        System.out.println("Current epoch timestamp in millis: " + epochMilli);

        long diff = epochMilli - currentTimestamp;
        System.out.println("Difference epoch timestamp in millis:, sum  " + diff );


    }
}
