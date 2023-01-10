package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpOperation {

    // sort emp by their name


    /*Employee emp1 = new Employee(101,"Mega",3500000,IT,35);
    Employee emp2 = new Employee(102,"Shiva",4500000,IT,42);
    Employee emp3 = new Employee(103,"MGA",6500000,IT,45);
    Employee emp4 = new Employee(104,"kumar",1500000,IT,15);

    list.add(emp1);*/


    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(106,"gh",400,"",19));
        list.add(new Employee(101, "Mega", 500, "IT", 35));
        list.add(new Employee(102, "Shiva", 600, "IT", 35));
        list.add( new Employee(103, "kumar", 100, "QA", 35));
        list.add(new Employee(104, "Shyam", 200, "DEPT", 35));

        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(emp->System.out.println(emp.getSalary()));

    }
}
