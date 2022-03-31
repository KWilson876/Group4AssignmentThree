//Group Members: Kerrone Wilson - 1817001549 | Tukeisha Brown - 1300067096 | Erroldo McCarthy - 2017001806

package com.kerroneopp2;

import java.io.File;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new CommissionEmployee("Erroldo","McCarthy", "2017001806", 4999.99, 0.5));
        employees.add(new BasePlusCommissionEmployee("Tukeisha","Brown", "1300067096", 900.00, 0.9, 3758.67));
        employees.add(new SalariedEmployee("Kerrone","Wilson", "1817001549", 2457.87));
        employees.add(new HourlyEmployee("Kae","Smith", "000111222", 14.82, 40));

        Invoice iA = new Invoice("INV_001", 10, 255.50);
        Invoice iB = new Invoice("INV_002", 9, 428.00);

        PayWeek thisweek = new PayWeek(" ");
        thisweek.addPayment(iA);
        thisweek.addPayment(iB);

        for (Employee e : employees) {
            thisweek.addPayment(e);
        }

        try {
            FileWriter fw = new FileWriter(new File("paystub.txt"));
            fw.write(thisweek.toString());
            fw.flush();
            fw.close();
        }catch (Exception e) {

            System.out.println(e.getMessage());
        }

        System.out.println(thisweek);
    }

}