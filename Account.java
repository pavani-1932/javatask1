package javaassignment3;

public class Account {
    // Data members
    private int accountNumber;
    private double balance;

    // No-argument constructor
    public Account() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    // Parameterized constructor
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
    }

    // Main method to test the Account class
    public static void main(String[] args) {
        // Using no-argument constructor
        Account acc1 = new Account();
        acc1.checkBalance();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.checkBalance();

        System.out.println();

        // Using parameterized constructor
        Account acc2 = new Account(12345, 1000.0);
        acc2.checkBalance();
        acc2.deposit(300);
        acc2.withdraw(500);
        acc2.checkBalance();
    }
}