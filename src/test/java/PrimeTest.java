import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Prime;
public class PrimeTest {
    @Test
    public void numbersLessThan2AreNotPrime(){
        Prime p = new Prime();
        Assertions.assertFalse(p.isPrime(1));
    }
    @Test
    public void primeNumbersWhichTheirRootSquareIsLessThan2(){
        Prime p = new Prime();
        Assertions.assertTrue(p.isPrime(2));
        Assertions.assertTrue(p.isPrime(3));
    }
    @Test
    public void primeNumbersWhichTheirRootSquareIsMoreThan2(){
        Prime p = new Prime();
        Assertions.assertTrue(p.isPrime(7));
        Assertions.assertTrue(p.isPrime(5));
    }
    @Test
    public void notPrimeNumbersWhichTheirRootSquareIsMoreThan2(){
        Prime p = new Prime();
        Assertions.assertFalse(p.isPrime(10));
        Assertions.assertFalse(p.isPrime(15));
    }
}
