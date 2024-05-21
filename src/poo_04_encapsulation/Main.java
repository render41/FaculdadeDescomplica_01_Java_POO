package poo_04_encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setNamePerson("Render");
        person.setAgePerson(27);

        System.out.println(person.getNamePerson());
        System.out.println(person.getAgePerson());
    }
}
