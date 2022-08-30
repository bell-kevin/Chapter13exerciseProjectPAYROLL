/** ****************************************************************************
 * Hourly.java
 * Kevin Bell
 *
 * This class manages hourly employee software for payroll.
 **************************************************************************** */
package chapter13exerciseprojectpayroll;

public class Hourly extends Employee {

    double payRate, hours, overTimeHours, overTimePayRate;
    private String firstName;
    private String lastName;

    public Hourly(String firstName, String lastName) {
        super(firstName, lastName);
    } // end constructor method

    public Hourly(String firstName, String lastName, double payRate) {
        super(firstName, lastName);
        this.payRate = payRate;
    } // end constructor method

    public double getPayRate() {
        return this.payRate;
    } // end accessor method

    public double getHours() {
        return this.hours;
    } // end accessor method

    void setPayRate(double payRate) {
        this.payRate = payRate;
    } // end mutator method

    void setHours(double hours) {
        this.hours = hours;
    } // end mutator method 

    public double grossPay(double hours, double payRate) {
        if (hours > 40) {
            overTimePayRate = payRate * 1.5;
        } // end if condition
        double grossPay = (hours * payRate) + (overTimeHours * overTimePayRate);
        return grossPay;
    } // end grossPay method
} // end class
