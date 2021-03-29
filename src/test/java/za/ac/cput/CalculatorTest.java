package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator c = new Calculator(1, 2);
    int val =1;

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
    void fail(){
        fail();
        c.setFirstNumber(1);
        c.setSecondNumber(2);

    }
    @Test
    @Disabled
    void disable(){
        while (true)
            System.out.println("If executes, disabled failed");
    }

    @Test
    //@Timeout(value = 1, unit = TimeUnit.SECONDS)
    void timeOut(){

    }
}
