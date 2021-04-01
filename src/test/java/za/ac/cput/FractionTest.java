package za.ac.cput;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.za.ac.cput.Calculator.Fraction;

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
        void timeOut()
        {
           while (true)
            System.out.println("Time is out of test");
        }

    }

