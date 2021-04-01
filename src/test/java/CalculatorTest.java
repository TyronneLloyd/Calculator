import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.Calculator;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/*
215138848
Grant Hendricks
28 March 2021
 */

class CalculatorTest {

    Calculator sum1 = new Calculator(5,6);

    public int a;
    public int b;

    @BeforeEach
    void setup(){
        a=5;
        b=6;
    }

    @Test
    void testEquality(){
        assertEquals(a,sum1.getA());
    }

    @Test
    void testIdentity(){
        assertSame(b,sum1.getB());
    }

    @Test
    void failed(){
        fail("Checking if test fails");
    }

    @Test
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void timeouts(){
        System.out.println("Test takes 15 seconds to complete.");
    }


    @Test
    @Disabled
    void disabling(){
        sum1.toString();
    }

}