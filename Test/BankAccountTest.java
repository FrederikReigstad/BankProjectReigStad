import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void getAccountNumber() {
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        // Arrange
        double initialBalance = 500.00;
        double amount = 500.00;
        BankAccount account = new BankAccount(1111, initialBalance);

        // Act
        account.deposit(amount);

        // Assert
        double expectedBalance = 1000.00;
        double actualBalance = account.getBalance();

        Assertions.assertEquals(expectedBalance, actualBalance);
    }

    @DisplayName("Test invalid inputs (< 0) of deposit method")
    @Test
    public void testInvalidDeposit() {

        // Arrange
        double initialBalance = 500.00;
        double amount = -100.00;
        BankAccount account = new BankAccount(1111, initialBalance);

        // Act + assert
        Exception err = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(amount);
        });

        // Extra assert
        String expectedMessage = "Amount must be a positive number";
        String actualMessage = err.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);
    }

    @org.junit.jupiter.api.Test
    void getInterestRate() {
        // Arrange
        BankAccount account = new BankAccount(1111,1000);

        // Act
        double expectedInterestRate = 0.05;
        account.setInterestRate(expectedInterestRate);
        double actualInterestRate = account.getInterestRate();

        // Assert
        Assertions.assertEquals(expectedInterestRate, actualInterestRate);
    }

    @org.junit.jupiter.api.Test
    void deposit() {
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        // Arrange
        double initialBalance = 1000.00;
        double amount = 500.00;
        BankAccount account = new BankAccount(1111, initialBalance);

        // Act
        account.withdraw(amount);

        // Assert
        double expectedBalance = 500.00;
        double actualBalance = account.getBalance();

        Assertions.assertEquals(expectedBalance, actualBalance);

    }

    @org.junit.jupiter.api.Test
    void setInterestRate() {
    }

    @org.junit.jupiter.api.Test
    void addInterest() {
    }

    @Test
    void testWithdraw() {

    }
}