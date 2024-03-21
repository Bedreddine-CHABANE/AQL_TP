package tp1.ConditionCoverageTest;
import org.example.tp1.FizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(-1)); // n <= 1
    }

    @Test
    public void testZero() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzz.fizzBuzz(0)); // n <= 1
    }

    @Test
    public void testFizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3)); // n % 15 == 0 (false), n % 3 == 0 (true)
    }

    @Test
    public void testBuzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5)); // n % 15 == 0 (false), n % 3 == 0 (false), n % 5 == 0 (true)
    }

    @Test
    public void testFizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15)); // n % 15 == 0 (true)
    }

    @Test
    public void testOtherNumber_NotDivisibleBy3or5() {
        assertEquals("7", FizzBuzz.fizzBuzz(7)); // n % 15 == 0 (false), n % 3 == 0 (false), n % 5 == 0 (false)
    }
}
