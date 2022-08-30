/** ****************************************************************************
 * Driver.java
 * Kevin Bell
 *
 * This driver program calculates employee payroll.
 **************************************************************************** */
package chapter13exerciseprojectpayroll;

import java.util.ArrayList;

public class Chapter13exerciseProjectPAYROLL {

    public static void main(String[] args) {
        System.out.println("Ch 13 Payroll by Kevin Bell");
        ArrayList<Hourly> staff = new ArrayList<>();
        ArrayList<Salary> managers = new ArrayList<>();
        staff.add(new Hourly("Barry", "Johnson"));
        staff.add(new Hourly("Cathy", "Davidson"));
        staff.add(new Hourly("Dan", "Peters"));
        managers.add(new Salary("Ann", "Barrett"));
        managers.add(new Salary("Frank", "Greene"));
    } // end main method
} // end Chapter13exerciseProjectPAYROLL class
