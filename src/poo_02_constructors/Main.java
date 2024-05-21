package poo_02_constructors;

public class Main {
    public static void main(String[] args) {
        Books books = new Books("Thunder, the Dog", "I don't know");

        System.out.println(books.getTitle());
        System.out.println(books.getAuthor());
    }
}
