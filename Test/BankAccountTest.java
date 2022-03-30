import org.junit.jupiter.api.Assertions;

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

    public void testInvalidDeposit() {

        // Arrange
        double initialBalance = 500.00;
        double interestRate = -0.21;
        BankAccount account = new BankAccount(1111, initialBalance);

        // Act + assert
        Exception err = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(interestRate);
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
    }

    @org.junit.jupiter.api.Test
    void setInterestRate() {
    }

    @org.junit.jupiter.api.Test
    void addInterest() {
    }
}