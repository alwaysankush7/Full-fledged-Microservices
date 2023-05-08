package com.bank;

public class CheckingAccount extends BankAccount{
    private double dailyWithdrawLimit;
    public CheckingAccount(String customerName, String userId, String userPassword) {
        super(customerName, userId, userPassword);
        this.dailyWithdrawLimit =300.0;
    }

    public double getDailyWithdrawLimit() {
        return dailyWithdrawLimit;
    }

    public void setDailyWithdrawLimit(double dailyWithdrawLimit) {
        this.dailyWithdrawLimit = dailyWithdrawLimit;
    }
}
