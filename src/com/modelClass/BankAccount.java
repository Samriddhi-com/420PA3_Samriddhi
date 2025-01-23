package com.modelClass;

public class BankAccount {
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, double initialBalance)
    {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance+=amount;
            System.out.println("Deposited: $"+amount);
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public boolean witdraw(double amount){
        if (amount >0 && amount <= balance){
            balance-=amount;
            System.out.println("Withdraw: $" + amount);
            return true;
        }
        else{
            System.out.println("Withdrawl failed");
            return false;
        }
    }
    public  double getBalance(){
        return balance;
    }

}
