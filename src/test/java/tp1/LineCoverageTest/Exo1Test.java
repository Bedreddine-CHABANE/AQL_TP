package tp1.LineCoverageTest;

import org.example.tp1.Palindrome;
import static org.junit.jupiter.api.Assertions.*;

import org.example.tp1.PalindromeCorrection;
import org.junit.jupiter.api.Test;


public class Exo1Test {
    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> PalindromeCorrection.isPalindrome(null));
    }

    @Test
    public void testEmptyString() {
        assertTrue(PalindromeCorrection.isPalindrome(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(PalindromeCorrection.isPalindrome("a"));
    }

    @Test
    public void testSimplePalindrome() {
        assertTrue(PalindromeCorrection.isPalindrome("racecar"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(PalindromeCorrection.isPalindrome("hello"));
    }

}
