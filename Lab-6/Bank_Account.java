class BankAccount {
    // Attributes
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }

    // Method to get account details
    public void getAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Bank_Account {
    public static void main(String[] args) {
        // Create an array to store bank accounts
        BankAccount[] accounts = new BankAccount[3];

        // Initialize the bank accounts
        accounts[0] = new BankAccount("123456", "Alice", 1000.0);
        accounts[1] = new BankAccount("234567", "Bob", 2000.0);
        accounts[2] = new BankAccount("345678", "Charlie", 3000.0);

        // Perform some operations
        accounts[0].deposit(500.0);
        accounts[1].withdraw(300.0);
        accounts[2].deposit(1000.0);
        accounts[2].withdraw(500.0);

        // Print account details
        for (BankAccount account : accounts) {
            account.getAccountDetails();
            System.out.println();
        }
    }
}
