package com.knoldus.Question7;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter method to access the account balance
    public double getBalance() {
        return balance;
    }

    // Setter method to set the account balance
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount(10000);
        System.out.println("Initial Balance is: " +bankAccount.getBalance());
        bankAccount.setBalance(20000);
        System.out.println("New Balance is: " +bankAccount.getBalance());
    }

}
