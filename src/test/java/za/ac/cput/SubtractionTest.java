package za.ac.cput;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    private Subtraction firstInput;
    private Subtraction secondInput;
    private Subtraction answer;

    @BeforeEach
    void setUp() {
        firstInput = new Subtraction();
        secondInput = new Subtraction();
        answer = new Subtraction();

        firstInput = secondInput;
    }
    @Test
    void objectIdentity(){
        assertSame(firstInput, secondInput);
    }

    @Test
    void objectEquality(){
        assertEquals(firstInput, secondInput);
    }

    @Test
    void fail(){
        fail();
        firstInput = answer;
    }

    @Disabled
    @Test
    void objectIdentity2(){
        assertSame(firstInput, secondInput);
    }

    @Test
    @Timeout(5)
    void TimeoutCheck() {
        for(int i=0; i<5; i++) {
            System.out.println(i);
        }
        }

    @AfterEach
    void tearDown() {
    }
}