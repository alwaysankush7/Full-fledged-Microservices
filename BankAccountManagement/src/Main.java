import com.bank.CheckingAccount;
import com.bank.exception.CustomerAccountNotFoundException;
import com.bank.exception.InsufficientFundsException;
import com.bank.exception.InvalidPasswordFormatException;
import com.bank.exception.NegativeDollarAmountException;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<CheckingAccount> accounts = new ArrayList<CheckingAccount>();

    public static void main(String[] args) {

        int choice = 0;
        while (choice != 6) {
            System.out.println("Main Menu\n");
            System.out.println("1 – Create An Account");
            System.out.println("2 – Delete An Account");
            System.out.println("3 – Make An Account Deposit");
            System.out.println("4 – Make An Account Withdrawal");
            System.out.println("5 – Check An Account Balance");
            System.out.println("6 – Exit");
            System.out.print("\nEnter Choice: ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        createAccount();
                        break;
                    case 2:
                        deleteAccount();
                        break;
                    case 3:
                        makeDeposit();
                        break;
                    case 4:
                        makeWithdrawal();
                        break;
                    case 5:
                        checkBalance();
                        break;
                    case 6:
                        System.out.println("\nExiting the program...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("\nError: Please enter a valid choice (1 thru 6).\n");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("\nError: Please enter in format of  number.\n");
            }

        }
    }

    private static void createAccount() {
        System.out.println("Create an account :");
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Enter userID : ");
        String userId = scanner.nextLine();
        System.out.println("Enter password :");
        String password = scanner.nextLine();
        try {
            if (!isValidPassword(password)) {
                throw new InvalidPasswordFormatException("Error: Password must be at least 8 characters long and contain at least one asterisk (*)");
            }
            CheckingAccount account = new CheckingAccount(name, userId, password);
            accounts.add(account);
            System.out.println("Account created successfully ");
        } catch (InvalidPasswordFormatException e) {
            e.getMessage();
        }

    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters long.");
            return false;
        }

        if (!password.contains("*")) {
            System.out.println("Error: Password must contain at least one asterisk (*).");
            return false;
        }
        return true;
    }


    private static void deleteAccount() {
        System.out.print("\nEnter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        boolean accountFound = false;

        for (CheckingAccount account : accounts) {
            if (account.getUserId().equals(userId) && account.getUserPassword().equals(password)) {
                accounts.remove(account);
                accountFound = true;
                System.out.println("\nAccount Deleted Successfully!\n");
                break;
            }
        }

        try {
            if (!accountFound) {
                throw new CustomerAccountNotFoundException("\nError: Account not found. Please enter valid User ID and Password.\n");
            }
        } catch (CustomerAccountNotFoundException c) {
            // System.out.println(c.getMessage());
            c.printStackTrace();
        }
    }

    private static void makeDeposit() {
        System.out.print("Enter user id: ");
        String userId = scanner.nextLine();
        System.out.print("Enter user password: ");
        String userPassword = scanner.nextLine();

        // search for the customer's account
        CheckingAccount customerAccount = null;
        for (CheckingAccount account : accounts) {
            if (account.getUserId().equals(userId) && account.getUserPassword().equals(userPassword)) {
                customerAccount = account;
                break;
            }
        }
        try {
            if (customerAccount == null) {
                // customer's account not found
                throw new CustomerAccountNotFoundException("Error: Customer account not found.\n");
            }
            System.out.print("Enter Deposit Amount: $");
            double amount = Double.parseDouble(scanner.nextLine());


            if (amount <= 0) {
                throw new NegativeDollarAmountException("Error: Deposit amount must be a positive amount.\n");
            }

            for (CheckingAccount account : accounts) {
                if (account.getUserId().equals(userId) && account.getUserPassword().equals(userPassword)) {
                    account.deposit(amount);
                    System.out.println("\nDeposit Successful!\n");
                    return;
                }
            }
        } catch (NegativeDollarAmountException n) {
            System.out.print(n.getMessage());
        } catch (CustomerAccountNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    private static void makeWithdrawal() {
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        CheckingAccount account = null;

        for (CheckingAccount a : accounts) {
            if (a.getUserId().equals(userId) && a.getUserPassword().equals(password)) {
                account = a;
                break;
            }
        }
        try {
            if (account == null) {
                // customer's account not found
                throw new CustomerAccountNotFoundException("Error: Customer account not found.\n");
            }

            System.out.print("Enter Dollar Amount: $");
            double amount = scanner.nextDouble();
            if (amount <= 0) {
                throw new NegativeDollarAmountException("Error: Dollar amount must be a positive value!");
            }

            if (amount > account.getAccountBalance()) {
                throw new InsufficientFundsException("Error: Insufficient funds!");
            }
            account.setAccountBalance(account.getAccountBalance() - amount);
            System.out.println("Withdrawal Successful!");

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NegativeDollarAmountException e) {
            System.out.println(e.getMessage());
        } catch (CustomerAccountNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkBalance() {
        System.out.print("Enter user id: ");
        String userId = scanner.nextLine();
        System.out.print("Enter user password: ");
        String password = scanner.nextLine();

        // Search for account
        CheckingAccount account = null;
        for (CheckingAccount a : accounts) {
            if (a.getUserId().equals(userId) && a.getUserPassword().equals(password)) {
                account = a;
                break;
            }
        }
        try {
            if (account == null) {
                // customer's account not found
                throw new CustomerAccountNotFoundException("Error: Customer account not found.\n");
            }
        } catch (CustomerAccountNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Print account details
        System.out.println("Name: " + account.getCustomerName());
        System.out.println("Account number : " + account.getUserId());
        System.out.println("Account Balance: $" + account.getAccountBalance());

        // Check if account is a checking account
        if (account instanceof CheckingAccount) {
            CheckingAccount checkingAccount = (CheckingAccount) account;
            System.out.println("Account Type: Checking");
            System.out.println("Daily Withdrawal Amount: $" + checkingAccount.getDailyWithdrawLimit());
        }
    }

}