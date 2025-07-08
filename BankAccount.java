package Practice.BankingSystem;

public class BankAccount {
    private int accountNo;
    private String name;
    private double balance;
    private double fdAmount;

    public BankAccount(int accountNo, String name) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = 0;
        this.fdAmount = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance - fdAmount) {
            balance -= amount;
        }
    }

    public void createFD(double amount) {
        if (amount > 0 && amount <= balance - fdAmount) {
            fdAmount += amount;
        }
    }

    public double getAvailableBalance() {
        return balance - fdAmount;
    }

    public int getAccountNo(){

        return accountNo;
    }

    public String getName() {
        return name;
    }
}

