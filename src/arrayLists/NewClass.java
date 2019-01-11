package arrayLists;

import errorThrow.cats.NewCat;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewClass {

    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList();
        Integer[]ints = myAL.toArray(new Integer[myAL.size()]);
        List<Integer> list = Arrays.asList(ints);

        for (int i = 0; i < 100; i++) {
            if ((i) % 2 != 0) {
                myAL.add(0, i);
            } else myAL.add(i);
        }
       /* for (int i = 0; i < 100; i++) {
            if ((i) % 2 != 0) {
                myAL.remove(i);
            }

        }*/

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}



