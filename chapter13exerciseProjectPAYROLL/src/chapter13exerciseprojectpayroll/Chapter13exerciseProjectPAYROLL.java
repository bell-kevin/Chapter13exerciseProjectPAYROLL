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
        staff.add(new Hourly("Barry", "Johnson"));
        staff.add(new Hourly("Cathy", "Davidson"));
        staff.add(new Hourly("Dan", "Peters"));
        managers.add(new Salary("Ann", "Barrett"));
        managers.add(new Salary("Frank", "Greene"));
        for (int i = 0; i < 3; i++) {
            System.out.println("How many hours for employee " + null);
        } // end for loop
    } // end main method
} // end Chapter13exerciseProjectPAYROLL class
