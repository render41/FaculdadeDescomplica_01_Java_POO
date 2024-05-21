package poo_06_composition;

public class Wish {
    private Items items;

    public Wish() {
        items = new Items();
    }

    public void wishItem(String itemName) {
        items.addItems(itemName);
    }

    public void showWish() {
        items.showItems();
    }
}
