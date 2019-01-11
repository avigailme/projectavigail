package Zadanie;

public class Child extends Parent {
    public int val;


    public static String test() {
        return "ya sin";
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(Child.test());
    }
}
