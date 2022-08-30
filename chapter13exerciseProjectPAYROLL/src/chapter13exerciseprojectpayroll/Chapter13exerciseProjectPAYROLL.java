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
        Scanner computerKeyboardInput = new Scanner(System.in);
        System.out.println("Ch 13 Payroll by Kevin Bell");
        ArrayList<Hourly> staff = new ArrayList<>();
        ArrayList<Salary> managers = new ArrayList<>();
        staff.add(new Hourly("Barry", "Johnson", 12.50));
        staff.add(new Hourly("Cathy", "Davidson", 15.00));
        staff.add(new Hourly("Dan", "Peters", 10.00));
        managers.add(new Salary("Ann", "Barrett", 52000));
        managers.add(new Salary("Frank", "Greene", 48000));
        for (Hourly emp : staff) {
            System.out.println("How many hours for employee " + emp.getFullName()+": ");   
        } // end for-each loop
    } // end main method
} // end Chapter13exerciseProjectPAYROLL class
