package za.ac.cput;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: Cole Hanekom
 * @Student Number: 217267556
 * @Date: 26/03/2021
 */

public class CalculateTest {

    private Calculate calculate;

    public  CalculateTest(){

    }

    @BeforeClass
    public static void setUpClass(){

    }

    @Before
    public void setUp(){
        this.calculate = new Calculate();
    }

    //    failing test
    @Test
    public void testMultiplication(){
        int result = calculate.multiplication(1,8);
        assertEquals(8, result);
    }

}
