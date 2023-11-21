package org.radhatechi.java_8.sorting;

import org.radhatechi.java_8.database.EmployeeDatabase;
import org.radhatechi.java_8.dto.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortExample {

    public static void main(String[] args) {

        List<Employee> allEmployees =
                EmployeeDatabase.getAllEmployees();

        double sumOfGradeAEmpSalaries = allEmployees.stream()
                .filter(employee -> employee.getGrade().equals("A"))
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println(sumOfGradeAEmpSalaries);

        Double sumOfAllEmployees = allEmployees.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);

        System.out.println(sumOfAllEmployees);

        boolean backendEngineer = allEmployees.stream()
                .anyMatch(employee -> employee.getDesignation().equals("Backend engineer"));

        System.out.println(backendEngineer);

        boolean employee = allEmployees.stream()
                .findAny().isPresent();

        System.out.println(employee);


//        List<Employee> sortedEmployeelist = allEmployees.stream()
//                .sorted(Comparator.comparing(Comparator.comparingDouble(Employee::getSalary)))
//                .collect(Collectors.toList());

       // System.out.println(sortedEmployeelist);


    }
}