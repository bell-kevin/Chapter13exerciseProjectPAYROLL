/** ****************************************************************************
 * Driver.java
 * Kevin Bell
 *
 * This is the base/super class for an Employee.
 **************************************************************************** */
package chapter13exerciseprojectpayroll;

class Employee {

    public String firstName = "kevin", lastName = "bell";

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    } // end constructor

    public String getFirstName() {
        return this.firstName;
    } // end accessor method

    public String getLastName() {
        return this.lastName;
    } // end accessor method

    public String getFullName() {
        String fullName = firstName.concat(" " + lastName);
        System.out.println(fullName);
        return firstName.concat(lastName);
    } // end accessor method

    void setFirstName(String firstName) {
        this.firstName = firstName;
    } // end mutator method

    void setlastName(String lastName) {
        this.lastName = lastName;
    } // end mutator method

} //end class
