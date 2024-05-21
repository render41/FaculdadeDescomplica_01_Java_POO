package poo_09_exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("type a number: ");
            int a = sc.nextInt();

            System.out.println("type another number: ");
            int b = sc.nextInt();

            System.out.println(a + b);
        } catch (Exception e) {
            System.out.println("Error, value needs a number.");
        }
    }
}
