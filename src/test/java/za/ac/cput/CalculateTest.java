package za.ac.cput;

/**
 * @Author: Cole Hanekom
 * @Student Number: 217267556
 * @Date: 26/03/2021
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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

    //  Failing Test
    @Test
    public void testMultiplication(){
        int result = calculate.multiplication(1,8);
        assertEquals(8, result);
    }

    // Object Identity
    @Test
    void testIdentity(){
        assertSame(calculate1,calculate3);
    }

    //Object Equality
    @Test
    void testEquality(){
        assertEquals(calculate1,calculate3);
    }
}