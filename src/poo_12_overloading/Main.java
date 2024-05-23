package poo_12_overloading;

public class Main {
    public static void main(String[] args) {
        Draw draw = new Draw();

        draw.show();
        draw.show('@');
        draw.show('@', 5);
    }
}
