import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.BankAccount;
public class BankAccountTest {
    @Test
    public void depositANegativeAmount(){
        BankAccount bankAccount = new BankAccount(0,0.1);
        Assertions.assertThrows(IllegalArgumentException.class,()->bankAccount.deposit(-10000));
    }
    @Test
    public void depositAPositiveAmount(){
        BankAccount bankAccount = new BankAccount(0,0.1);
        Assertions.assertEquals(0,bankAccount.getBalance());
        bankAccount.deposit(10000);
        Assertions.assertEquals(10000,bankAccount.getBalance());
    }
    @Test
    public void withdrawANegativeAmount(){
        BankAccount bankAccount = new BankAccount(5000,0.1);
        Assertions.assertThrows(IllegalArgumentException.class,()->bankAccount.withdraw(-1000));
    }
    @Test
    public void withdrawAPositiveAmountWhichSuperiorToBalance(){
        BankAccount bankAccount = new BankAccount(5000,0.1);
        Assertions.assertThrows(IllegalStateException.class,()->bankAccount.withdraw(6000));
    }
    @Test
    public void withdrawAPositiveAmountWhichInferiorOrEqualToBalance(){
        BankAccount bankAccount = new BankAccount(5000,0.1);
        bankAccount.withdraw(1000);
        Assertions.assertEquals(4000,bankAccount.getBalance());
        bankAccount.withdraw(4000);
        Assertions.assertEquals(0,bankAccount.getBalance());
    }
    @Test
    public void transferToANullAccount(){
        BankAccount bankAccount1 = new BankAccount(5000,0.1);
        BankAccount bankAccount2 = null;
        Assertions.assertThrows(NullPointerException.class,()->bankAccount1.transfer(1000,bankAccount2));
    }
    @Test
    public void transferAnAmountSuperiorToBalanceToANonNullAccount(){
        BankAccount bankAccount1 = new BankAccount(5000,0.1);
        BankAccount bankAccount2 = new BankAccount(0,0);
        Assertions.assertThrows(IllegalStateException.class,()->bankAccount1.transfer(6000,bankAccount2));
        //Assertions.assertEquals(3000,bankAccount1.getBalance());
        //Assertions.assertEquals(2000,bankAccount2.getBalance());
    }
    @Test
    public void transferAnAmountInferiorOrEqualToBalanceToANonNullAccount(){
        BankAccount bankAccount1 = new BankAccount(5000,0.1);
        BankAccount bankAccount2 = new BankAccount(0,0);
        bankAccount1.transfer(2000,bankAccount2);
        Assertions.assertEquals(3000,bankAccount1.getBalance());
        Assertions.assertEquals(2000,bankAccount2.getBalance());
    }
    @Test
    public void addInterestTest(){
        BankAccount bankAccount1 = new BankAccount(10000,0.1);
        bankAccount1.addInterest();
        Assertions.assertEquals(11000,bankAccount1.getBalance());
    }
    @Test
    public void getBalanceTest(){
        BankAccount bankAccount1 = new BankAccount(10000,0.1);
        Assertions.assertEquals(10000,bankAccount1.getBalance());
    }
}
