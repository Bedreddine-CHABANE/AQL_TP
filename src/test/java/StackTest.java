import org.example.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Stack;
public class StackTest {
    @Test
    public void doesElementSuccessfulyPushed(){
        Stack stack = new Stack();
        int sizeBeforePushing = stack.size();
        stack.push(7);
        int sizeAfterPushing = stack.size();
        boolean result = sizeBeforePushing != sizeAfterPushing;
        Assertions.assertTrue(result);
    }

    @Test
    public void doesElementNotSuccessfulyPushed(){
        Stack stack = new Stack();
        int sizeBeforePushing = stack.size();
        stack.push(7);
        int sizeAfterPushing = stack.size();
        boolean result = sizeBeforePushing != sizeAfterPushing;
        Assertions.assertFalse(result);
    }
}
