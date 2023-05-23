class Customer {
    private int customerId;
    private String customerName;
    private String address;

    Customer(int customerId, String customerName, String address) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
    }
    public void display(){
        System.out.println("Customer id is "+customerId+" name is "+customerName+" address is "+address);
    }
}

class AccountA{
    private int accountId;
    private String accountType;
     private Customer customer;
    private int accountBalance;
    AccountA( int accountId, String accountType, Customer customer, int accountBalance){
        this.accountId = accountId;
        this.accountType = accountType;
        this.customer = customer;
        this.accountBalance = accountBalance;
    }
    public void display(){
        System.out.println("Account Id is "+accountId+" type is"+accountType+" and account balance is :"+accountBalance);
        this.customer.display();
    }
}

class Ankush{
    public static void main(String[] args) {
        Customer customer = new Customer(12,"Ankushan","Noida");
        AccountA account=new AccountA(123,"Savings",customer,2035);
        account.display();
    }
}