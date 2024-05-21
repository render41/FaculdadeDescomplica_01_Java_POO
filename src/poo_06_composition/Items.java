package poo_06_composition;

import java.util.ArrayList;
import java.util.List;

public class Items {
    private List<String> itemsFood = new ArrayList<String>();

    public void addItems(String item) {
        itemsFood.add(item);
    }

    public void showItems() {
        for (int i = 0; i < itemsFood.size(); i++) {
            System.out.println((i + 1) + " - " + itemsFood.get(i));
        }
    }
}
