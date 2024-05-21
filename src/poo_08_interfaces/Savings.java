package poo_08_interfaces;


public class Savings implements Account {

    private double balance;

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

}
