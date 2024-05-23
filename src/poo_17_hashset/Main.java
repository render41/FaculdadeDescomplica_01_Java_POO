package poo_17_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbersHashSet = new HashSet<>();
        numbersHashSet.add(3);
        numbersHashSet.add(1);
        numbersHashSet.add(2);

        Iterator<Integer> numbersIterator = numbersHashSet.iterator();

        while (numbersIterator.hasNext()) {
            System.out.println(numbersIterator.next());
        }
    }
}
