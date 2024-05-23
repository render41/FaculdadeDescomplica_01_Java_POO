package poo_12_overloading;

public class Draw {
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
    }

    public void show(char symbol) {
        for (int i = 0; i < 10; i++) {
            System.out.println(symbol);
        }
    }

    public void show(char symbol, int numberSymbols) {
        for (int i = 0; i < numberSymbols; i++) {
            System.out.println(symbol);
        }
    }
}
