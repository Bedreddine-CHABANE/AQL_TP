import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.CountLetters;
public class CountLettersTest {
    @Test
    public void countTest(){
        CountLetters countLetters = new CountLetters();
        int result = countLetters.count("cat");
        Assertions.assertEquals(0,result);
    }
    @Test
    public void countNumberOfWordsEndWithXORS(){
        CountLetters countLetters = new CountLetters();
        int result1 = countLetters.count("reseaux");
        int result2 = countLetters.count("cats");
        Assertions.assertEquals(1,result1);
        Assertions.assertEquals(1,result2);
    }
    @Test
    public void countNumberOfWordsEndWithRORS(){
        CountLetters countLetters = new CountLetters();
        int result1 = countLetters.count("cats,dogs,bird");
        int result2 = countLetters.count("cats dogs birds");
        Assertions.assertEquals(2,result1);
        Assertions.assertEquals(3,result2);
    }
}
