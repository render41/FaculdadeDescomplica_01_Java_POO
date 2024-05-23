package poo_11_polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Polymorphism\n");

        Square square = new Square();
        Circle circle = new Circle();

        square.draw();
        circle.draw();
    }
}
