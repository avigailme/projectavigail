package abstractClasses;

public abstract class Animals {
    int weight;
    int age;
    String color;
    String name;

    public Animals() {

    }

    public Animals(int weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void makeNoise();

    abstract void eat();

    abstract void run();

    abstract void sleep();

    void live() {
        System.out.println(getName());
        sleep();
        eat();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void makeaSound() {
        System.out.println(" i make a sound like______");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
