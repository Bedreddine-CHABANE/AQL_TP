package tp1.ConditionCoverageTest;

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
    public void testEmptyString() {
        assertTrue(AnagramCorrection.isAnagram("", ""));
        assertFalse(AnagramCorrection.isAnagram("test", ""));
        assertFalse(AnagramCorrection.isAnagram("", "test"));
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
    public void testCaseSensitivity() {
        assertTrue(AnagramCorrection.isAnagram("racecar", "Racecar"));
        assertTrue(AnagramCorrection.isAnagram("listen", "Silent"));
        assertTrue(AnagramCorrection.isAnagram("God", "dog"));
    }

    @Test
    public void testWhitespace() {
        assertTrue(AnagramCorrection.isAnagram("A man a plan a canal Panama", "A canal Panama a man  a plan"));
        assertTrue(AnagramCorrection.isAnagram("      ", "  "));
    }

    @Test
    public void testEdgeCases() {
        assertTrue(AnagramCorrection.isAnagram("a", "a"));
        assertTrue(AnagramCorrection.isAnagram("aaaaaaaaa", "aaaaaaaaa"));
        assertFalse(AnagramCorrection.isAnagram("aaaaaaaaa", "aaaaaaaaab"));
    }
}
