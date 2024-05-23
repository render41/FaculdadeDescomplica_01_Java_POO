package poo_19_projectLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> languagesProgramming = new ArrayList<>();
        languagesProgramming.add("Java");
        languagesProgramming.add("C#");
        languagesProgramming.add("Python");
        languagesProgramming.add("C++");
        languagesProgramming.add("JavaScript");
        languagesProgramming.add("C");

        for (String languages : languagesProgramming) {
            System.out.println(languages);
        }
        System.out.println("\n");

        HashSet<String> languagesProgrammingSet = new HashSet<>(languagesProgramming);
        System.out.println("Using HashSet: " + languagesProgrammingSet);
        System.out.println("\n");

        TreeSet<String> languagesProgrammingTreeSet = new TreeSet<>(languagesProgramming);
        System.out.println("Using TreeSet: " + languagesProgrammingTreeSet);

    }
}
