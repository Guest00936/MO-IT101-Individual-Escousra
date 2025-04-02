/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphpayrollsystem;

public class PayrollCalculator {
    public double calculateGrossPay(Employee emp) {
        return emp.getHoursWorked() * emp.getHourlyRate();
    }

    public double calculateNetPay(Employee emp) {
        double grossPay = calculateGrossPay(emp);
        return grossPay * 0.9; // 10% tax deduction
    }
}

