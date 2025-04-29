package GU_OOPs;

public class J04Bank {
    public static void main(String[] args) {
        // Create a Bank Account object
        BankAccount account = new BankAccount();

        // Accessing methods of BankAccount class
        account.deposit(1000);
        account.withdraw(500);
        account.displayAccountDetails();

        // Accessing account balance using getter method (which is public)
        System.out.println("Account Balance: " + account.getBalance());
    }
}

class BankAccount {
    private double balance;

    // Constructor
    public BankAccount() {
        this.balance = 0.0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Balance: " + balance);
    }

    // Getter method for balance (public)
    public double getBalance() {
        return balance;
    }
}
