package tp1.BranchCoverageTest;
import org.example.tp1.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1));
    }

    @Test
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0));
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void testOtherNumber_NotDivisibleBy3or5() {
        assertEquals("7", FizzBuzz.fizzBuzz(7));
    }

    @Test
    public void testOtherNumber_DivisibleBy3() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void testOtherNumber_DivisibleBy5() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }
}
