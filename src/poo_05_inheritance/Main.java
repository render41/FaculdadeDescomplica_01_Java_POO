package poo_05_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.nameAnimal = "Brutus";
        animal.ageAnimal = 10;

        Dog dog = new Dog();
        dog.nameAnimal = "Bob";
        dog.ageAnimal = 6;
        System.out.println(animal.nameAnimal);
        System.out.println(dog.nameAnimal);
    }
}
