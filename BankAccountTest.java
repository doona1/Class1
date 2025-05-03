// Abstract class representing a generic bank account
abstract class BankAccount {
    protected double balance;

    // Constructor to set initial balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // Abstract methods (no body)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Concrete method
    public void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Concrete class that extends BankAccount
class SavingsAccount extends BankAccount {

    // Constructor
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Implement deposit
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Implement withdraw
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
}

// Main class to test the account
public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000);  // Initial balance

        account.showBalance();        // Show initial balance
        account.deposit(500);         // Deposit money
        account.withdraw(200);        // Withdraw money
        account.showBalance();        // Show updated balance
    }
}
