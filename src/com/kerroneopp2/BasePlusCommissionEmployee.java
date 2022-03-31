package com.kerroneopp2;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee() {
        this.baseSalary = 0;
    }

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double rate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, sales, rate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return baseSalary + (commissionRate * grossSales);
    }
}