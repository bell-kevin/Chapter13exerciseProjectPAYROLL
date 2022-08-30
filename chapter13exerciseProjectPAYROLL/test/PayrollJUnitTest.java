
/** ****************************************************************************
 * PayrollJUnitTest.java
 * Kevin Bell
 *
 * This is the unit testing class.
 **************************************************************************** */
import org.junit.Test;
import static org.junit.Assert.*;

public class PayrollJUnitTest {

    public PayrollJUnitTest() {
    }

    @Test
    public void weeklyPay1() {
        System.out.println("weeklyPayTest1");
        double annualPayRate = 52000;
        double weeksPerYear = 52;
        double expectedResult = 1000;
        double result = (annualPayRate / weeksPerYear);
        double delta = 0;
        assertEquals(expectedResult, result, delta);
    } // end weeklyPay1 test method

    @Test
    public void weeklyPay2() {
        System.out.println("weeklyPayTest2");
        double annualPayRate = 52052;
        double weeksPerYear = 52;
        double expectedResult = 1001;
        double result = (annualPayRate / weeksPerYear);
        double delta = 0;
        assertEquals(expectedResult, result, delta);
    } // end weeklyPay2 test method

    @Test
    public void weeklyPay3() {
        System.out.println("weeklyPayTest3");
        double annualPayRate = 52104;
        double weeksPerYear = 52;
        double expectedResult = 1002;
        double result = (annualPayRate / weeksPerYear);
        double delta = 0;
        assertEquals(expectedResult, result, delta);
    } // end weeklyPay3 test method

    @Test
    public void weeklyPay4() {
        System.out.println("weeklyPayTest4");
        double annualPayRate = 52156;
        double weeksPerYear = 52;
        double expectedResult = 1003;
        double result = (annualPayRate / weeksPerYear);
        double delta = 0;
        assertEquals(expectedResult, result, delta);
    } // end weeklyPay4 test method

    @Test
    public void weeklyPay5() {
        System.out.println("weeklyPayTest5");
        double annualPayRate = 52208;
        double weeksPerYear = 52;
        double expectedResult = 1004;
        double result = (annualPayRate / weeksPerYear);
        double delta = 0;
        assertEquals(expectedResult, result, delta);
    } // end weeklyPay5 test method
} // end unit testing class
