package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.za.ac.cput.Calculator.Fraction;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class FractionTest
    {
        Fraction f = new Fraction(12.0,10.0);

        @BeforeEach

        @Test
       void objectEquality()
        {
            assertEquals(12.0,f.getNumerator());

          }
        @Test
        void objectIdentity()
        {
      assertNotSame(10.0,f.getDenominator());
        }
        @Test
        void failed(){
            fail("Failed on purpose");
            while (true)
                System.out.println("If executes, it did not work");

        }
        @Test
        @Disabled
        void disable(){
            f.setNumerator(12);

        }
        @Test
        @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
        void timeOut() throws InterruptedException {
            Thread.sleep(200);
            System.out.println("Time is out of test");
        }

    }

