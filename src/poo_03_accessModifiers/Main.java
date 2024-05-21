package poo_03_accessModifiers;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.calculateIMC(76.3, 1.78);

        person.gender = "Man";
        System.out.println(person.gender);
    }
}
