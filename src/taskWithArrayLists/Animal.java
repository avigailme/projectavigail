package taskWithArrayLists;

public abstract class Animal {
    Integer age;

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }

    public Animal(Integer age) {
        this.age = age;

    }
}
