package interfaceExamples.ocean;

public abstract class Animal implements  Swimmable {
    int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
