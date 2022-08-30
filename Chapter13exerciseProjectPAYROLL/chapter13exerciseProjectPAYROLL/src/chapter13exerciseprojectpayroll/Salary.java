/** ****************************************************************************
 * Salary.java
 * Kevin Bell
 *
 * This class manages salary employee software for payroll.
 **************************************************************************** */
package chapter13exerciseprojectpayroll;

public class Salary extends Employee {

    private double annualPayRate;

    public Salary(String firstName, String lastName) {
        super(firstName, lastName);
    } // end constructor method

    public Salary(String firstName, String lastName, double annualPayRate) {
        super(firstName, lastName);
        this.annualPayRate = annualPayRate;
    } // end constructor method

    public double getAnnualPayRate() {
        return this.annualPayRate;
    } // end accessor method

    void setAnnualPayRate(double annualPayRate) {
        this.annualPayRate = annualPayRate;
    } // end mutator method

    public double weeklyPay(double annualPayRate) {
        int weeksPerYear = 52;
        double weeklyPay = annualPayRate / weeksPerYear;
        return weeklyPay;
    } // end weeklyPay method
} // end Salary class
