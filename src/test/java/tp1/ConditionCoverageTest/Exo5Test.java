package tp1.ConditionCoverageTest;

import org.example.tp1.RomanNumeral;
import org.example.tp1.RomanNumeralCorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testLoopNotExecuted() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralCorrection.toRoman(0)); // Loop not executed due to exception
    }

    @Test
    public void testLoopExecutesOnce() {
        assertEquals("I", RomanNumeralCorrection.toRoman(1)); // Loop executes once
    }

    @Test
    public void testLoopExecutesMultipleTimes() {
        assertEquals("XII", RomanNumeralCorrection.toRoman(12)); // Loop executes multiple times
    }
    @Test
    public void testNumberWithLargestSymbol() {
        assertEquals("M", RomanNumeralCorrection.toRoman(1000));
    }

    @Test
    public void testNumberWithCombinedSymbols() {
        assertEquals("MMXIV", RomanNumeralCorrection.toRoman(2014));
    }
}