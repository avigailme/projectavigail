package abstractClasses;

public abstract class AbstractAnimal {

    String name;

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
    void live(){
        System.out.println(getName());
        sleep();
        eat();
    };
}
