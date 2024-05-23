package poo_14_methodtostring;

public class Main {
    public static void main(String[] args) {
        String firstString = "Java";
        String secondString = "C#";
        String thirdString = new String("Python");

        System.out.println(firstString.toUpperCase());
        System.out.println(secondString.toLowerCase());
        System.out.println(thirdString.length());
        System.out.println(firstString.charAt(3));
        System.out.println(thirdString.equals(firstString));
    }
}
