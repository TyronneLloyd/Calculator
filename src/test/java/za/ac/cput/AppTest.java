package za.ac.cput;
/**
 * @Author: Tyronne Lloyd Hendricks
 * @Student Number: 215141210
 * @Date: 25/03/2021
 * @Description: Junit Testing
 */


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private App firstNumber;
    private App secondNumber;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        firstNumber = new App();
        secondNumber = new App();
    }
    @Test //Object Equality Test
    @Timeout()
    public void objectEqualityTest(){
        assertEquals(firstNumber,secondNumber);
    }
    @Test//Object Identity Test
    public void objectIdentityTest(){
        assertNotSame(firstNumber,secondNumber);

    }
    //Timeout Test
    @org.junit.jupiter.api.Test
    void getA() {
        fail("Chose getA() to fail deliberately");
    }

    @org.junit.jupiter.api.Test
    void setA() {

    }

    @org.junit.jupiter.api.Test
    void getB() {
    }

    @org.junit.jupiter.api.Test
    void setB() {
    }

    @org.junit.jupiter.api.Test

    @Disabled("Disabled ToString to demonstrate disabling test")//Disabling Test
    void testToString() {

    }

}