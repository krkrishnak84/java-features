package org.radhatechi.java_8.sorting;

import org.radhatechi.java_8.database.CustomerDatabase;
import org.radhatechi.java_8.dto.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupByExample {

    public static void main(String[] args) {

        List<Customer> allCustomers =
                CustomerDatabase.getAllCustomers();

        //group by customer id
        Map<Long, List<Customer>> groupByCustomerId =
                allCustomers.stream()
                .collect(groupingBy(Customer::getCustomerId));

        System.out.println(groupByCustomerId);

        groupByCustomerId.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey()));

        groupByCustomerId.entrySet().stream()
                .forEach(entry -> System.out.println(Arrays.toString(entry.getValue().toArray())));



    }
}
