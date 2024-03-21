package tp1.LineCoverageTest;

import org.example.tp1.Anagram;
import org.example.tp1.AnagramCorrection;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void testNullStrings() {
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram(null, null));
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram("test", null));
        assertThrows(NullPointerException.class, () -> AnagramCorrection.isAnagram(null, "test"));
    }

    @Test
    public void testDifferenetLengthString() {
        assertFalse(AnagramCorrection.isAnagram("test", "settt"));
    }

    @Test
    public void testSimpleAnagrams() {
        assertTrue(AnagramCorrection.isAnagram("racecar", "carrace"));
        assertTrue(AnagramCorrection.isAnagram("listen", "silent"));
        assertTrue(AnagramCorrection.isAnagram("God", "Dog"));
    }

    @Test
    public void testNonAnagrams() {
        assertFalse(AnagramCorrection.isAnagram("hello", "world"));
        assertFalse(AnagramCorrection.isAnagram("Java", "Python"));
        assertFalse(AnagramCorrection.isAnagram("apple", "banana"));
    }

    @Test
    public void testWhitespace() {
        assertTrue(AnagramCorrection.isAnagram("A man a plan a canal Panama", "A canal Panama a man a plan"));
        assertTrue(AnagramCorrection.isAnagram("      ", "  "));
    }

}