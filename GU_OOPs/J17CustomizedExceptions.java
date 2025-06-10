package GU_OOPs;

// Step 1: Create a custom exception by extending Exception class
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Step 2: Create a Bank class with a withdraw method
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            // Throwing custom exception
            throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
}

// Step 3: Main class to test the custom exception
public class J17CustomizedExceptions {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.00);

        try {
            // Attempt to withdraw more than the available balance
            account.withdraw(6000.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            // Valid withdrawal
            account.withdraw(2000.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
