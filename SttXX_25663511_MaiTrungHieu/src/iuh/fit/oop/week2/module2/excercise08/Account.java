package iuh.fit.oop.week2.module2.excercise08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
    private String name;
    private double balance;
    private final double RATE = 0.035;

    public Account() {
        this(999999, "chưa xác định", 50000);
    }

    public Account(long accountNumber, String name) {
        this(accountNumber, name, 50000);
    }

    public Account(long accountNumber, String name, double balance) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            this.accountNumber = 999999;
        }

        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "chưa xác định";
        }

        if (balance >= 50000) {
            this.balance = balance;
        } else {
            this.balance = 50000;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount, double fee) {
        if (amount > 0 && (amount + fee) <= this.balance) {
            this.balance -= (amount + fee);
            return true;
        }
        return false;
    }

    public void addInterest() {
        this.balance = this.balance + (this.balance * RATE);
    }

    public boolean transfer(Account acc2, double amount) {
        if (this.withdraw(amount, 0)) {
            acc2.deposit(amount);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        String formattedBalance = formatter.format(balance);

        return String.format("%-15d %-25s %20s", accountNumber, name, formattedBalance);
    }
}
