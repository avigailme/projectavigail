package hashCodeTasks;

import equalsTasks.Multiple;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Cat> results = new HashSet();
      //  Cat cat = new Cat("1");
        results.add(new Cat(1,"1"));
        results.add(new Cat(1,"2"));
        results.add(new Cat(1,"3"));

        System.out.println(results.size());

        results.add(new Cat(1,"1"));
        results.add(new Cat(2,"2"));
        System.out.println(results.size());
       // System.out.println(cat.hashCode());
        for (Cat c : results) {
            System.out.println(c.hashCode());
        }
    }


}
