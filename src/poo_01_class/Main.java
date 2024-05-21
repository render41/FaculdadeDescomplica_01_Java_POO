package poo_01_class;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.nameDog = "Thunder";
        dog.age = 3;
        dog.color = "Black";
        dog.weight = 23;

        dog.DetailsDog();
        dog.Walk();
        dog.Eat();
        dog.Sleep();
    }
}
