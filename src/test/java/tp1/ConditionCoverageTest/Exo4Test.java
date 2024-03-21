package tp1.ConditionCoverageTest;

import org.example.tp1.QuadraticEquation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Exo4Test {
    @Test
    public void testAequalsZero() {
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(0, 1, 1));
    }

    @Test
    public void testDeltaNegative() {
        assertNull(QuadraticEquation.solve(1, 1, 3));
    }

    @Test
    public void testDeltaZero() {
        assertArrayEquals(new double[]{-1}, QuadraticEquation.solve(1, 2, 1));
    }

    @Test
    public void testDeltaPositive() {
        assertArrayEquals(new double[]{-2 + Math.sqrt(3), -2 - Math.sqrt(3)}, QuadraticEquation.solve(1, 4, 1));
    }
}
