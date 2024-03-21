package tp1.LineCoverageTest;
import org.example.tp1.RomanNumeral;
import org.example.tp1.RomanNumeralCorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {
    @Test
    public void testOutOfRange_BelowMinimum() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralCorrection.toRoman(0));
    }

    @Test
    public void testOutOfRange_AboveMaximum() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralCorrection.toRoman(4000));
    }

    @Test
    public void testSimpleNumber() {
        assertEquals("I", RomanNumeralCorrection.toRoman(1));
    }

    @Test
    public void testNumberWithMultipleSymbols() {
        assertEquals("XII", RomanNumeralCorrection.toRoman(12));
    }

}
