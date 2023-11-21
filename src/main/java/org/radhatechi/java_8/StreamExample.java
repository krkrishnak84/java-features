package org.radhatechi.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {


    public static void main(String[] args) {
        List<String> list = Arrays.asList("radha","krishna","bindu","mohit");

        boolean radha = list.stream().anyMatch(str -> str.equals("radha"));
        System.out.println(radha);

        Set<String> setElements = list.stream().filter(str -> str.equals("radha"))
                .collect(Collectors.toSet());

        System.out.println(setElements);

        List<String> filteredData = list.stream().filter(str -> str.length() > 5)
                .map(String::toUpperCase)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(filteredData);





    }


}
