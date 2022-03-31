package com.kerroneopp2;

public class CommissionEmployee extends Employee {
    protected double grossSales;
    protected double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double rate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = sales;
        this.commissionRate = rate;
    }

    public CommissionEmployee() {
        this.grossSales = 0.0;
        this.commissionRate = 0.0;
    }

    @Override
    public double getPaymentAmount() {
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCommission Payment Amount:" + " $" + getPaymentAmount();
    }
}