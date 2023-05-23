package com.account;

public class Account {
    private int accountId;
    private String accountType;
    private int accountBalance;

   public Account(int accountId, String accountType, int accountBalance){
        this.accountId = accountId;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    public void deposit(int amount){
        this.accountBalance+=amount;
        System.out.println("Amount deposited successfully :"+amount);
    }
    public void withdraw(int amount){
        if(amount <= accountBalance){
            accountBalance -= amount;
            System.out.println("You have withdrawn the amount :"+amount);
        }else{
            System.out.println("Insufficient amount ");
        }
    }
    public int getBalance(){
        return accountBalance;
    }

    public void display(){
        System.out.println(" AccountId is " + accountId+" and AccountType is " + accountType+" with account balance "+accountBalance);
    }
}
