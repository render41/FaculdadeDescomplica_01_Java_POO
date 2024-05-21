package poo_06_composition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Wish wish = new Wish();
        int codeWish = 5;

        while (codeWish != 0) {
            System.out.println("Start wish");
            System.out.println("0 - Close Wish | 1 - New Wish | 2 - Show Wish");

            System.out.println("\n");
            codeWish = scanner.nextInt();

            if (codeWish == 1) {
                System.out.println("Make your wish:");
                wish.wishItem(scanner.next());
            } else if (codeWish == 2) {
                System.out.println("Show your Wish:");
                wish.showWish();
            }
        }
    }
}
