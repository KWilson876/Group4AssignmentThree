package com.kerroneopp2;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee() {
        this.wage = 0.0;
        this.hours = 0.0;
    }

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return super.toString() + "\nHourly Payment Amount:" + " $" + getPaymentAmount();
    }
}