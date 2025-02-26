package com.company;

// 📌 Class responsible for Salary-related logic
public class SalaryService {
    public double calculateBonus(Employee employee) {
        return employee.getSalary() * 0.1;
    }
}
