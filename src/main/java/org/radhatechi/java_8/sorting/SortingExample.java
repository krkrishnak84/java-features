package org.radhatechi.java_8.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortingExample {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("RAM","KRISHNA","SUBBU","SURESH");

        Stream<String> stringStream = Stream.of("G", "C", "F", "H", "A","B","C","A","A");
        //stringStream.forEach(System.out::println);

        List<String> filteredList = stringStream.filter(str -> str.equals("A"))
                .map(String::toLowerCase)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filteredList);




    }

}
