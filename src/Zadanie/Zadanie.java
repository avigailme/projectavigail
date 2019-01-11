package Zadanie;

public class Zadanie {
    private double weight;
    private int age;
    private String name;
    private static int numOfCreationOfDogs = 0;

    public Zadanie(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        numOfCreationOfDogs++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumOfCreationOfDogs() {
        return numOfCreationOfDogs;
    }

    public static void setNumOfCreationOfDogs(int numOfCreationOfDogs) {
        Zadanie.numOfCreationOfDogs = numOfCreationOfDogs;
    }
}
