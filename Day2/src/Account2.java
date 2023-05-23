class Account {
    private int accountNo;
    private String accountType;
    private int accountBalance;

    public void setAccountDetails(int accountNo, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void withdraw(int amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            System.out.println(amount + " has been withdrawn from your account.");
        } else {
            System.out.println("Insufficient balance in your account to withdraw " + amount + ".");
        }
    }

    public void deposit(int amount) {
        this.accountBalance += amount;
        System.out.println(amount + " has been deposited to your account.");
    }

    public void dispAccountDetails() {
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Account Balance: " + this.accountBalance);
    }
}

class Main1 {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setAccountDetails(123456, "Savings", 5000);
        acc.dispAccountDetails();
        acc.withdraw(2000);
        acc.dispAccountDetails();
        acc.deposit(500);
        acc.dispAccountDetails();
    }
}
