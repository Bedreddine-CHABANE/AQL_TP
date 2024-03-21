package tp1.ConditionCoverageTest;
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
    public void testElementNotFound_LowHighEqual() {
        assertEquals(-1, BinarySearchCorrection.binarySearch(new int[]{1}, 2)); // low == high
    }

    @Test
    public void testElementNotFound_LowGreaterThanHigh() {
        assertEquals(-1, BinarySearchCorrection.binarySearch(new int[]{5}, 2)); // low > high
    }

    @Test
    public void testElementFound_LowEqualsMid() {
        assertEquals(0, BinarySearchCorrection.binarySearch(new int[]{1, 3}, 1)); // low == mid
    }

    @Test
    public void testElementFound_HighEqualsMid() {
        assertEquals(1, BinarySearchCorrection.binarySearch(new int[]{1, 3}, 3)); // high == mid
    }

    @Test
    public void testElementFound_ElementLessThanMid() {
        assertEquals(-1, BinarySearchCorrection.binarySearch(new int[]{1, 3, 5}, 2)); // element < mid
    }

    @Test
    public void testElementFound_ElementGreaterThanMid() {
        assertEquals(-1, BinarySearchCorrection.binarySearch(new int[]{1, 3, 5}, 4)); // element > mid
    }
}
