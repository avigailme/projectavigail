package taskWithArrayLists;

public class Dog extends Animal {

    public Dog(Integer age) {
        super(age);
    }

    @Override
    public String toString() {
        return "Doggie{" +
                "age=" + age +
                '}';
    }
}
