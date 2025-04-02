/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorphpayrollsystem;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 40, 500);
        PayrollCalculator calculator = new PayrollCalculator();

        double grossPay = calculator.calculateGrossPay(emp);
        double netPay = calculator.calculateNetPay(emp);

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Gross Pay: PHP " + grossPay);
        System.out.println("Net Pay (after 10% tax): PHP " + netPay);
    }
}
