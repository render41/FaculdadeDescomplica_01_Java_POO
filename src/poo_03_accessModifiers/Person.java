package poo_03_accessModifiers;

public class Person {
    private String namePerson;
    public int age;
    protected String gender;
    double weight;
    double height;

    public void calculateIMC(double weight, double height) {
        this.weight = weight;
        this.height = height;

        double IMC = weight / height * height;
        System.out.println("IMC: " + IMC);
    }
}
