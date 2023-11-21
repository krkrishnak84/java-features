package org.radhatechi.java_8.dto;

public class Employee {

    private long empId;
    private String empName;
    private String grade;
    private int age;
    private String designation;
    private double salary;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(long empId, String empName, String grade, int age, String designation, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.grade = grade;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }
}
