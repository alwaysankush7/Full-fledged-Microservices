package com.account.test;

import com.account.Account;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args)  throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Account ID: ");
        int acctId = scanner.nextInt();
        System.out.print("Enter  your Account Type: ");
        String acctType = scanner.next();
        System.out.print("Enter your  Account Balance: ");
        int acctBalance = scanner.nextInt();

        Account acct = new Account(acctId, acctType, acctBalance);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = scanner.nextInt();
                    acct.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = scanner.nextInt();
                    acct.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Current balance: " + acct.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you to visiting us::))");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }


    }
}
