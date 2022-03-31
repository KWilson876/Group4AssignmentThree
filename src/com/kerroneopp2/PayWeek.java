package com.kerroneopp2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PayWeek {

    private String weekEnding;
    private ArrayList<Payable> payments;

    public PayWeek(String weekEnding) {

        this.weekEnding = weekEnding;
        payments = new ArrayList<>();
    }

    public void addPayment(Payable p) {
        payments.add(p);
    }

    @Override

    public String toString() {
        Date date = new Date ();

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = formatter.format(date);

        StringBuilder sb = new StringBuilder();
        sb.append("\nPayments For The Week Ending " + strDate + ": \n");

        for (Payable p : payments) {
            sb.append(p + "\n");
        }

        return sb.toString();
    }

}