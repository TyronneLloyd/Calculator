package za.ac.cput;
/**
 * @Author: Rick Allen Herbert
 * @Student Number: 219014337
 * @Date: 28/03/2021
 * @Description: Testing of the Animal Class
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    private Animal animal1;
    private Animal animal2;
    private Animal animal3;
    private Animal animal4;

    @BeforeEach
    void setUp() {
        animal1 = new Animal("dog", 3,"Benny","German Shepherd");
        animal2 = new Animal("cat", 1, "Kitty", "Persian cat");
        animal3 = new Animal("dog", 7, "Nina", "Siberian Husky");
        animal4 = animal1;
    }

    @Test
    void testEquality() {
        assertEquals(animal1, animal4);

    }
    @Test
    void testIdentity() {
        assertSame(animal1.getType(), animal3.getType());

    }
    @Test
    void failingTest() {
        fail("Test failed");

        }
    @Timeout(value = 20, unit = TimeUnit.MILLISECONDS)
    @Test
    void timeouts() {
        assertEquals(animal1, animal4);
    }

    @Disabled
    @Test
    void disablingTest() {
        assertNotEquals(animal1.getAge(), animal2.getAge());
        System.out.println("Disabled By Rick Herbert");
    }
}