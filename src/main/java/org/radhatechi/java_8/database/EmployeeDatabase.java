package org.radhatechi.java_8.database;

import org.radhatechi.java_8.dto.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {

    public static List<Employee> getAllEmployees(){

        return Arrays.asList(new Employee(1001,"Radhakrishna","A",39,"Backend engineer",120000),
                new Employee(1002,"Ram","B",35,"Front end engineer",120000),
                new Employee(1003,"Sundar","C",28,"Backend engineer",120000),
                new Employee(1004,"Krishnan","A",35,"Software engineer",90000),
                new Employee(1005,"Subbarao","C",29,"Senior software engineer",160000),
                new Employee(1006,"Praveen","B",27,"Backend engineer",140000));
    }

}
