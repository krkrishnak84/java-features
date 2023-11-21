package org.radhatechi.java_8.database;

import org.radhatechi.java_8.dto.Address;
import org.radhatechi.java_8.dto.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerDatabase {

    public static List<Customer> getAllCustomers(){

        Address address = new Address("Cypress manor", "Dr",208, "Tampa","USA");

        return Arrays.asList(new Customer(2001, "Radhakrishna",address,"test@gmail.com",609-297-1234),
                new Customer(2003, "Bindu",address,"test1@gmail.com",609-297-3456),
                new Customer(2004, "Tejasvi",address,"test2@gmail.com",609-297-4567),
                new Customer(2005, "Mohit",address,"test3@gmail.com",609-297-7895));

    }



}
