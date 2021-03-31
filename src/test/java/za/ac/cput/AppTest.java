package za.ac.cput;

/**
 * @Author: Cole Hanekom
 * @Student Number: 217267556
 * @Date: 26/03/2021
 */

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private App calculate;
    private App calculate1;
    private App calculate2;
    private App calculate3;

    @BeforeEach
    void setUp() {
        this.calculate = new App();
        calculate1 = new App();
        calculate2 = new App();
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
        double result = calculate.square(3);
        assertEquals(9, result);
    }
}
