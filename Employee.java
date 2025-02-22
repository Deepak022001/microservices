package com.wipro.java.microservices.solid;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateBonus() {
        return salary * 0.1;
    }

    public void saveToDatabase() {
        System.out.println("Saving employee " + name + " to database...");
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
