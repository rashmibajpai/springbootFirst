package com.example.demo;

public class Employee {

    private int empId;
    private String name;
    private double salary;
    private String dept;
    private int age;

    public Employee(int empId, String name, double salary, String dept, int age) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
