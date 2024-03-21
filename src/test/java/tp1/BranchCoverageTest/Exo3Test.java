package tp1.BranchCoverageTest;
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
    public void testElementAtStart() {
        assertEquals(0, BinarySearchCorrection.binarySearch(new int[]{1, 3, 5}, 1));
    }

    @Test
    public void testElementAtEnd() {
        assertEquals(2, BinarySearchCorrection.binarySearch(new int[]{1, 3, 5}, 5));
    }

    @Test
    public void testElementInMiddle() {
        assertEquals(1, BinarySearchCorrection.binarySearch(new int[]{1, 3, 5}, 3));
    }
    @Test
    public void testSingleElementArray() {
        assertEquals(0, BinarySearchCorrection.binarySearch(new int[]{5}, 5));
    }
}
