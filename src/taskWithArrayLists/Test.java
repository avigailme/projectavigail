package taskWithArrayLists;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
      LinkedList<Animal> animals = new LinkedList<>();
      //animals.pollFirst();
        System.out.println(animals.pollLast());

        for (int i = 0; i < 50 ; i++) {
            if (i%2==0){
            animals.add(new Cat(i+i));}
            else {
                animals.add(new Dog(i+ i));
            }
        }
        int catPosition = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Cat){
                ++catPosition;
                if (catPosition>0 && catPosition%5 ==0){
                animals.remove(i);
                }
            }
        }
        int dogPosition = 0;
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog){
                ++dogPosition;
                if (dogPosition>0 && dogPosition%3 ==0){
                    animals.add(i+1, new Mouse(i));
                }
            }
        }
        boolean mFound = false;
        boolean catFound = false;
        LinkedList<Animal> mouseCat = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i)instanceof Mouse){
                mFound =true;
            }
            else {
                mFound =false;
            }
            if (animals.get(i)instanceof Cat){
                catFound =true;
            }
            else {
                catFound =false;
            }
            if (mFound && catFound){
                System.out.println("xxxxxxx");
                mouseCat.add(animals.get(i-1));
                mouseCat.add(animals.get(i));
                catFound = false;
                mFound = false;
            }
        }

        for (Animal a: animals
             ) {
            System.out.println(a);

        }
        for (Animal a: animals
        ) {
            System.out.println(a);

        }




































     /*  Cat cat = new Cat("ALina", 2);
        Cat cat2 = new Cat("Malina", 10);
        Cat cat3 = new Cat("Aikyz", 3);
        ArrayList<Cat> cats = new ArrayList();

        cats.add(cat);
        cats.add(cat2);
        cats.add(cat3);
        for (int i = 0; i < 7 ; i++) {
            cats.add(new Cat("alina"+ i, i));
        }
        int position = cats.indexOf(new Cat("alina"+ 6, 6));
        System.out.println(
                position == -1 ? "Не найдено" : "Найдено по индексу  "
                +position
        );
        Cat[]arrayCats = cats.toArray(new Cat[cats.size()]);
        for (Cat c : arrayCats) {
            System.out.println(c);/*

        }
        System.out.println(cats.contains(new Cat("alina"+ 6, 11)));
        System.out.println("odna i ta je" + (new Cat("alina"+ 6, 11).
                equals(new Cat("alina"+ 6, 11))));  */

    }

}
