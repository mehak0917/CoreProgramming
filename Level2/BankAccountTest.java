package Constructors.Level2;

class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int num, String holder, double bal) {
        accountNumber = num;
        accountHolder = holder;
        balance = bal;
    }

    // Public methods for balance
    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) balance -= amt;
        else System.out.println("Insufficient funds!");
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int num, String holder, double bal) {
        super(num, holder, bal);
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Alice", 5000);
        sa.display();
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.display();
    }
}

