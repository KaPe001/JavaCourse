package OOP;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("56789", 2.50, "Default fullName", "Default address", "Default phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Constructor with parameters called");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){
        if(funds > 0){
            this.balance += funds;
            System.out.println("Your current balance is: " + balance);
        }
    }
    public void withdrawFunds(double funds){
        if(funds > balance){
            System.out.println("You cannot withdraw money. Balance is not sufficient.");
        }else {
            //double balanceAfterWithdraw = balance - funds;
            this.balance -= funds;
            //System.out.println("Your balance after the withdrawal is: " + balanceAfterWithdraw);
            System.out.println("Your balance after the withdraw is: " + balance);
        }
    }
}
