package poo_07_abstractclass;

public class Main {
    public static void main(String[] args) {
        Bank person = new PersonInBank();
        person.depositMoney(200);
        person.withdrawMoney(100);
    }
}
