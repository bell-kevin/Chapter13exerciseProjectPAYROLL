/** ****************************************************************************
 * Driver.java
 * Kevin Bell
 *
 * This driver program calculates employee payroll.
 **************************************************************************** */
package chapter13exerciseprojectpayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter13exerciseProjectPAYROLL {

    public static void main(String[] args) {
        double hours = 0;
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Ch 13 Payroll by Kevin Bell \n");
        ArrayList<Hourly> staff = new ArrayList<>();
        ArrayList<Salary> managers = new ArrayList<>();
        staff.add(new Hourly("Barry", "Johnson", 12.50));
        staff.add(new Hourly("Cathy", "Davidson", 15.00));
        staff.add(new Hourly("Dan", "Peters", 10.00));
        managers.add(new Salary("Ann", "Barrett", 52000));
        managers.add(new Salary("Frank", "Greene", 48000));
        for (Hourly hourly : staff) {
            System.out.print("How many hours for employee "
                    + hourly.getFullName() + ": ");
            hours = computerKeyboardInput.nextDouble();
            hourly.setHours(hours);
        } // end for-each loop
        System.out.println("");
        System.out.println("Payroll Results \n");
        for (Salary salary : managers) {
            System.out.printf("Manager %19s: \t$%1.2f\n",
                    salary.getFullName().toUpperCase(),
                    salary.weeklyPay(salary.getAnnualPayRate()));
        } // end for-each loop
        for (Hourly hourly : staff) {
            System.out.printf("Employee %18s: \t$%1.2f  \t%.2f hours, "
                    + "\t$%1.2f/hr\n",
                    hourly.getFullName().toUpperCase(),
                    hourly.grossPay(hourly.getHours(), hourly.payRate),
                    hourly.hours, hourly.payRate);
        } // end for-each loop
    } // end main method
} // end Chapter13exerciseProjectPAYROLL class
