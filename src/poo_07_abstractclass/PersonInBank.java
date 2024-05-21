package poo_07_abstractclass;

public class PersonInBank extends Bank {

    @Override
    void withdrawMoney(int amount) {
        System.out.println("Withdrawing " + amount + " from bank");
    }

    @Override
    void depositMoney(int amount) {
        System.out.println("Depositing " + amount + " from bank");
    }
}
