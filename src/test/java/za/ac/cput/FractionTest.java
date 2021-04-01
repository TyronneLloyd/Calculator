package za.ac.cput;
/**
 * @Author:Asiphiwe Hanjiwe 218336675
 * This program test fraction which was its calculation was performed in Fraction java class.
 * 31 March 2021
 * Applications Development Practice 3
 */
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
       void testEquality()
        {
            assertEquals(12.0,f.getNumerator());

          }
        @Test
        void testIdentity()
        {
      assertNotSame(10.0,f.getDenominator());
        }
        @Test
        void testFail(){
            fail("Failed on purpose");
            while (true);
        }
        @Test
        @Disabled
        void disable(){
            f.setNumerator(12);
        }

        @Test
        @Timeout(value = 100,unit = TimeUnit.MILLISECONDS)
        void timeOut() throws InterruptedException
        {
             Thread.sleep(100);
            System.out.println("Time up for test");
        }

    }

