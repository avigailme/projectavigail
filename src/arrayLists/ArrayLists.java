package arrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList();
        ArrayList<Integer> secondAL = new ArrayList();
        boolean found = true;
       myAL.add(10);
        myAL.add(0,20);
        myAL.add(30);
        myAL.set(1,40);
        myAL.indexOf(40);
        myAL.remove(Integer.valueOf(20));

        System.out.println(myAL.get(0));
        System.out.println(myAL.get(1));
        System.out.println(myAL.contains(40));

        /*for (int i = 0; i < 10000; i++) {
            if ((i)%Math.sqrt(i)==0){
               myAL.add(i);
               found = true;
            }
            if (i%2==0&&i%3==0){
                //myAL.add(i);
                secondAL.add(myAL.indexOf(i));

            }}

           for (Integer j : secondAL) {
                System.out.print(j+", ");
            }*/




            }

    }




