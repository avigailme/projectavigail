package taskWithArrayLists;

public class Cat extends Animal {
    public Cat(Integer age) {
        super(age);
    }
    @Override
    public String toString() {
        return "Catty{" +
                "age=" + age +
                '}';
    }
    /*String name;
    Integer age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Cat)){
            return false;
        }
        if (this.age.equals(((Cat) obj).age) ){
            return  true;
        }
        return false;
    }
}
