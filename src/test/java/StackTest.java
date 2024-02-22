import org.example.Stack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    Stack stack;
    @BeforeEach
    void setUp(){
        stack = new Stack();
    }
    @Test
    public void pushingAnElementWithoutExpandingArray(){
        int sizeBeforePushing = stack.size();
        stack.push(7);
        int sizeAfterPushing = stack.size();
        boolean result = sizeBeforePushing != sizeAfterPushing;
        Assertions.assertTrue(result);
        Assertions.assertEquals(stack.peek(),7);
    }

    @Test
    public void pushingAnElementWithExpandingArray(){
        for (int i = 1;i<=10;i++){
            stack.push(i);
        }
        Assertions.assertEquals(10,stack.size());
        stack.push(20);
        Assertions.assertEquals(11,stack.size());
        Assertions.assertEquals(20,stack.peek());
    }
    @Test
    public void popingAnElementFromANonEmptyStack(){
        stack.push(5);
        Assertions.assertEquals(1,stack.size());
        int result = stack.pop();
        Assertions.assertEquals(0,stack.size());
        Assertions.assertEquals(5,result);
    }
    @Test
    public void popingAnElementFromAnEmptyStack(){
        Assertions.assertThrows(IllegalStateException.class,()->stack.pop());
    }

    @Test
    public void peekingAnElementFromANonEmptyStack(){
        stack.push(5);
        Assertions.assertEquals(1,stack.size());
        int result = stack.peek();
        Assertions.assertEquals(5,result);
    }
    @Test
    public void peekingAnElementFromAnEmptyStack(){
        Assertions.assertThrows(IllegalStateException.class,()->stack.peek());
    }
    @Test
    public void isEmptyToANonEmptyStack(){
        stack.push(6);
        Assertions.assertFalse(stack.isEmpty());
    }
    @Test
    public void isEmptyToAnEmptyStack(){
        Assertions.assertTrue(stack.isEmpty());
    }
    @Test
    public void sizeIncrementByAddingAnElement(){
        stack.push(9);
        Assertions.assertEquals(1,stack.size());
    }
    @Test
    public void sizeDecrementByRemovingAnElement(){
        stack.push(9);
        stack.push(16);
        stack.push(13);
        int result = stack.pop();
        Assertions.assertEquals(2,stack.size());
    }

    //we don't need to test the method expandArray() because it's a private function.
}
