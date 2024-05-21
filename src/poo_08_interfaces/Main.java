package poo_08_interfaces;

public class Main {
    public static void main(String[] args) {
        Account account = new Savings();

        account.deposit(400);
        System.out.println(account.getBalance());

        account.withdraw(100);
        System.out.println(account.getBalance());
    }
}
