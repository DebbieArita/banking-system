package test;

import main.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Assertions.*;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

//Display name helps to optimize test reports
//Assertions are used to check a certain condition; if an assertion fails the test fails.
@DisplayName("Test BankAccount class")
public class BankAccountTest {

    @Test
    @DisplayName("Withdraw 400 successfully")
    public void testWithdraw(){
        BankAccount bankAccount = new BankAccount(500, -1000);
        bankAccount.withdraw(400);
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    @DisplayName("Deposit 200 successfully")
    public void testDeposit(){
        BankAccount bankAccount = new BankAccount(400, 0);
        bankAccount.deposit(200);
        assertEquals(600, bankAccount.getBalance());
    }
}
