package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesMultipleP() {
        IntList lst = IntList.of(17, 11, 17);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("289 -> 121 -> 289", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesZero() {
        IntList lst = IntList.of(0);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("0", lst.toString());
        assertFalse(changed);
    }

    @Test
    public void testSquarePrimesNoPrimes() {
        IntList lst = IntList.of(300, 400, 500);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("300 -> 400 -> 500", lst.toString());
        assertFalse(changed);
    }

    @Test
    public void testSquarePrimesNegative() {
        IntList lst = IntList.of(-2, -4, -5);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("-2 -> -4 -> -5", lst.toString());
        assertFalse(changed);
    }

    @Test
    public void testSquarePrimesOneSize() {
        IntList lst = IntList.of(4);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4", lst.toString());
        assertFalse(changed);
    }

}
