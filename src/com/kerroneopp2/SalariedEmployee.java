package com.kerroneopp2;

public class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee() {
        this.weeklySalary = 0.0;
    }

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSalaried Payment Amount:" + " $" + getPaymentAmount();
    }
}