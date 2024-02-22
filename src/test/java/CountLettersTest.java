import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.CountLetters;
public class CountLettersTest {
    @Test
    public void lastWordDoesNotMatch(){
        CountLetters countLetters = new CountLetters();
        int result1 = countLetters.count("cats!dog");
        int result2 = countLetters.count("bird");
        Assertions.assertEquals(1,result1);
        Assertions.assertEquals(0,result2);
    }
    @Test
    public void multipleMatchingWords(){
        CountLetters countLetters = new CountLetters();
        int result1 = countLetters.count("cats,dogs");
        int result2 = countLetters.count("cats dogs birds");
        Assertions.assertEquals(2,result1);
        Assertions.assertEquals(3,result2);
    }
}
