package BankManagementSystem;

public class Account {
    private String firstName;
    private String lastName;
    private int accountId;
    private double balance;
    private int passcode;

    public Account() {
    }

    public Account(String firstName, String lastName, int accountId, double balance, int passcode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountId = accountId;
        this.balance = balance;
        this.passcode = passcode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPasscode() {
        return passcode;
    }

    public void setPasscode(int passcode) {
        this.passcode = passcode;
    }
}
