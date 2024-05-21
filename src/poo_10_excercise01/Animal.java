package poo_10_excercise01;

public class Animal implements Habits {
    private String nameAnimal;
    private int ageAnimal;

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public void setAgeAnimal(int ageAnimal) {
        this.ageAnimal = ageAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public int getAgeAnimal() {
        return ageAnimal;
    }

    @Override
    public void Eat(String nameFood) {
        System.out.println(nameAnimal + " is eating: " +  nameFood + ".");
    }

    @Override
    public void Sleep() {
        System.out.println(nameAnimal + " is sleeping.");
    }
}
