
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.BlackJack;
public class BlackJackTest {
    @Test
    public void leftShouldWinUnder21() {
        BlackJack bj = new BlackJack();
        int left = 15;
        int right = 12;
        int result = bj.play(left,right);
        Assertions.assertEquals(left, result);
    }
    @Test
    public void rightShouldWinUnder21() {
        BlackJack bj = new BlackJack();
        int left = 11;
        int right = 18;
        int result = bj.play(left,right);
        Assertions.assertEquals(right, result);
    }
    @Test
    public void leftShouldWinUpper21() {
        BlackJack bj = new BlackJack();
        int left = 15;
        int right = 25;
        int result = bj.play(left,right);
        Assertions.assertEquals(left, result);
    }
    @Test
    public void rightShouldWinUpper21() {
        BlackJack bj = new BlackJack();
        int left = 27;
        int right = 7;
        int result = bj.play(left,right);
        Assertions.assertEquals(right, result);
    }
    @Test
    public void bothUpper21() {
        BlackJack bj = new BlackJack();
        int left = 27;
        int right = 25;
        int result = bj.play(left,right);
        Assertions.assertEquals(0, result);
    }
}
