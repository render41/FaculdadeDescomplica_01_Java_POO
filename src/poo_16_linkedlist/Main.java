package poo_16_linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> animalList = new LinkedList<>();

        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Horse");

        System.out.println("Show list of animals: ");
        for (String animal : animalList) {
            System.out.println(animal);
        }
        System.out.println("\n");

        animalList.addFirst("Cow");
        animalList.addLast("Pig");

        System.out.println("Add first and last: ");
        for (String animal : animalList) {
            System.out.println(animal);
        }
        System.out.println("\n");

        animalList.removeFirst();
        System.out.println("Remove First: ");
        for (String animal : animalList) {
            System.out.println(animal);
        }
        System.out.println("\n");

        System.out.println("First element is: " + animalList.getFirst());
        System.out.println("Last element is: " + animalList.getLast());
        System.out.println("\n");

        animalList.offer("DogHot");
        System.out.println(animalList.poll());
        System.out.println("\n");

        animalList.push("Horse");
        System.out.println(animalList.pop());

        System.out.println(animalList);
    }
}
