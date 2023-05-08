package com.bank;

public class BankAccount {
    private String customerName;
    private int accountId;
    private static int numberOfAccounts =0;
    private String userId;
    private String userPassword;
    private double accountBalance;
    public BankAccount(String customerName, String userId, String userPassword){
        this.customerName = customerName;
        this.userId = userId;
        this.userPassword = userPassword;
        this.accountId=++numberOfAccounts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public static void decrementNumberOfAccounts() {
        numberOfAccounts--;
    }
    public void deposit(double balance){
        accountBalance += balance;
    }
}
