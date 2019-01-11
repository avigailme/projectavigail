package hashCodeTasks;
import java.util.HashSet;

public class TestHashCodeOne {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();{
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i <=100 ; i++) {
                    integers.add(i);
                }
            }
            int summa = 0;
            for (Integer i: integers
                 ) {
                System.out.println(i);
                summa += i;
                System.out.println(summa);

            }
        }
    }
}
