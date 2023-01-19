package com.example.demo.javapractice;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee1 {

    private int id;
    private String name;

    public Employee1() {
    }

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Employee1 employee1 = new Employee1(101, "parul");
        Employee1 employee2 = new Employee1(101, "parul");

        System.out.println("is hashcode() same : " + (employee1.hashCode() == employee2.hashCode()));//t
        System.out.println("is equals() same : " + (employee1.equals(employee2)));//t


        Set<Employee1> employees=new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println(employees.size());
        System.out.println(employees);

    }
}
