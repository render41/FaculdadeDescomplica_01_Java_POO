package poo_15_iteratorandcomparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        numbers.add(3);

        System.out.println("ArrayList Integer Type: " + numbers);

        Iterator<Integer> iterator = numbers.iterator();
        int number = iterator.next();

        System.out.println(number + "\n");

        while (iterator.hasNext()) {
            iterator.forEachRemaining((value) -> {
                System.out.print(value + ", ");
            });
        }


    }
}
