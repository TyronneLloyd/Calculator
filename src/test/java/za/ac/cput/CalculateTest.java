package za.ac.cput;

/**
 * @Author: Cole Hanekom
 * @Student Number: 217267556
 * @Date: 26/03/2021
 */

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {

    private Calculate calculate;
    private Calculate calculate1;
    private Calculate calculate2;
    private Calculate calculate3;

    @BeforeEach
    void setUp() {
        this.calculate = new Calculate();
        calculate1 = new Calculate();
        calculate2 = new Calculate();
        calculate3 =  calculate1;
    }

    @Test
    public void testSquare(){
        double result = calculate.square(2);
        assertEquals(4, result);
    }

    // Failing Test
    @Test
    public void testFail(){
        double result = calculate.square(2);
        assertEquals(4, result);
        fail("This test should fail");
    }

    // Object Identity
    @Test
    void testIdentity(){
        assertSame(calculate1,calculate3);
    }

    // Object Equality
    @Test
    void testEquality(){
        assertEquals(calculate1,calculate3);
    }

    // Timeouts
    @Test
    @Timeout(6)
    public void testTimeout() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Test passed within the time");
    }

    // Disabling Test
    @Test
    @Disabled("Disabled to demonstrate disabling test")
    public void testDisabled(){
        System.out.println("This should be disabled to demonstrate disabling test");
    }
}