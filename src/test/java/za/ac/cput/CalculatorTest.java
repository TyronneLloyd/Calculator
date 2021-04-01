package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator(1, 2);

    @BeforeEach
    void setUp() {
    }

    @Test
    void objectEquality() {
        assertEquals(1, c.getFirstNumber());
    }

    @Test
    void objectIdentity() {
        assertSame(2, c.getSecondNumber());
    }
    @Test
    void failed(){
        fail("Failed on purpose");
        while (true)
            System.out.println("If executes, fail() did not work");

    }
    @Test
    @Disabled
    void disable(){
        c.setFirstNumber(1);
        c.setSecondNumber(2);
    }

    @Test
    @org.junit.jupiter.api.Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void timeOut() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("If reaches this block Timeout test failed");
    }
}
