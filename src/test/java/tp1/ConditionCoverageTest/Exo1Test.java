package tp1.ConditionCoverageTest;

import org.example.tp1.Palindrome;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Exo1Test {

    @Test
    public void testNullString() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }

    @Test
    public void testEmptyString() {
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    public void testSingleCharacterString() {
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    public void testSimplePalindrome() {
        assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testPalindromeWithSpaces() {
        assertTrue(Palindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testPalindromeWithSpecialCharacters() {
        assertTrue(Palindrome.isPalindrome("A Toyota! a toyota"));
    }

    @Test
    public void testPalindromeWithNumbers() {
        assertTrue(Palindrome.isPalindrome("12321"));
    }

    @Test
    public void testCaseSensitivity() {
        assertFalse(Palindrome.isPalindrome("Racecar"));
    }
}
