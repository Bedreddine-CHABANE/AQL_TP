package tp1.LineCoverageTest;
import org.example.tp1.BinarySearch;
import org.example.tp1.BinarySearchCorrection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo3Test {
    @Test
    public void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearchCorrection.binarySearch(null, 5));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(-1, BinarySearchCorrection.binarySearch(new int[0], 5));
    }

    @Test
    public void testElementNotFound() {
        assertEquals(-1, BinarySearchCorrection.binarySearch(new int[]{1, 3, 5}, 4));
    }

    @Test
    public void testElementExists() {
        assertEquals(2, BinarySearchCorrection.binarySearch(new int[]{1, 3, 5}, 5));
    }

}
