package za.ac.cput;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

import static org.junit.Assert.*;

/**
 * author : Asiphiwe Hanjiwe 218336675
 * Unit test for simple App.
 */
public class AppTest {
    private App customer1;
    private App customer2;
    private App customer3;


    @Before
    public void setupTest() {
        customer1 = new App();
        customer2 = new App();
        customer3 = customer1;
    }

    @Test
    public void testIdentity() {
        assertSame(customer1, customer3);
    }

    @Test
    public void testEquality() {
        assertEquals(customer3, customer1);
    }

    @Test
    public void testFail() {
        fail("This is my fail test");
    }

    @Test(timeout=100)
    public void testTimeout() {
        while (true);

    }

    @Test
    @Disabled("Disabled until CustomerService is up!")
    public void testCustomerServiceGet() {
        assertEquals(3, 2 + 1);
    }


}
