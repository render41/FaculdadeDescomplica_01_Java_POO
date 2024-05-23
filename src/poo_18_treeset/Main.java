package poo_18_treeset;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> fruitsTreeSet = new TreeSet<>();

        fruitsTreeSet.add("apple");
        fruitsTreeSet.add("orange");
        fruitsTreeSet.add("banana");
        fruitsTreeSet.add("pear");
        fruitsTreeSet.add("grape");
        fruitsTreeSet.add("pineapple");


        System.out.println("All elements:");
        System.out.println(fruitsTreeSet);
        System.out.println("\n");

        fruitsTreeSet.remove(fruitsTreeSet.first());
        System.out.println("Removed first element:");
        System.out.println(fruitsTreeSet);
        System.out.println("\n");

        fruitsTreeSet.remove(fruitsTreeSet.last());
        System.out.println("Removed last element:");
        System.out.println(fruitsTreeSet);
        System.out.println("\n");

        System.out.println(fruitsTreeSet.isEmpty());
        System.out.println("\n");

        ArrayList<Integer> listInteger = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            listInteger.add(i, i + 1);
        }
        System.out.println(listInteger);
        System.out.println(listInteger.get(4));
    }
}
