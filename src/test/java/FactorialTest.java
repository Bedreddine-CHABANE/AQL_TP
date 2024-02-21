import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Factorial;
public class FactorialTest {
    @Test
    public void negativeNumbersCantBeFactored(){
        Factorial f = new Factorial();
        Assertions.assertThrows(IllegalArgumentException.class,()->f.factorial(-1));
    }
    @Test
    public void positiveNumbersCanBeFactored(){
        Factorial f = new Factorial();
        Assertions.assertEquals(1,f.factorial(0));
        Assertions.assertEquals(6,f.factorial(3));
    }
}
