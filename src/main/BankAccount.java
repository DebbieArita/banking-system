package main;

public class BankAccount {
    //two properties|methods: balance and minimumBalance
    private double balance;
    private double minimumBalance;

    //create a public constructor
    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    //create getters and setters... (alt+insert)
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(double minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    //two additional methods, withdraw and deposit... to utilize my balance methods....
    public void withdraw(double amount) {
        if (balance - amount > minimumBalance) {
            balance -= amount;
        } else {
            throw new RuntimeException();
        }
    }

    public void deposit(double amount){
        balance += amount;
    }


}
