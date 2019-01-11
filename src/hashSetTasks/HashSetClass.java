package hashSetTasks;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {


    public static void main(String[] args) {
        Set <String> stringss = new HashSet<String>();
        stringss.add("1");
        stringss.add("2");
        stringss.add("3");

        for(Iterator<String> it = stringss.iterator(); it.hasNext();){
            String s = it.next();
            if (s.equals("")){
                System.out.println("i found");
            }
        };





    }
}
