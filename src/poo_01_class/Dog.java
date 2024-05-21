package poo_01_class;

public class Dog {
    String nameDog;
    String color;
    int age;
    double weight;

    public void DetailsDog() {
        System.out.println("Name: " + nameDog);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }

    public void Walk() {
        System.out.println("Walking...");
    }

    public void Eat() {
        System.out.println("Eating...");
    }

    public void Bark() {
        System.out.println("Barking...");
    }

    public void Sleep() {
        System.out.println("Sleeping...");
    }

    public void CatchBone() {
        System.out.println("Catching...");
    }
}
