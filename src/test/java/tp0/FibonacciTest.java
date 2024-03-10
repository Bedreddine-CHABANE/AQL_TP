package tp0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.tp0.Fibonacci;
public class FibonacciTest {
    @Test
    public void negativeNumberShouldThrowAnException(){
        Fibonacci f = new Fibonacci();
        Assertions.assertThrows(IllegalArgumentException.class,()->f.fibonacci(-3));
    }
    @Test
    public void fibonacci0ShouldReturn0(){
        Fibonacci f = new Fibonacci();
        Assertions.assertEquals(0,f.fibonacci(0));
    }
    @Test
    public void fibonacci1ShouldReturn1(){
        Fibonacci f = new Fibonacci();
        Assertions.assertEquals(1,f.fibonacci(1));
    }
    @Test
    public void fibonacciShouldReturnFibonacciFunction(){
        Fibonacci f = new Fibonacci();
        Assertions.assertEquals(3,f.fibonacci(4));
    }
}
