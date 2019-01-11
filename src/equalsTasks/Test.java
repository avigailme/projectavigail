package equalsTasks;
import java.util.ArrayList;

public class Test {
    ArrayList<Multiple> results = new ArrayList<>();
    public static void main(String[] args) {
            Test main = new Test();
            main.addMultiples(new Multiple(10, 10));
            main.addMultiples(new Multiple(9, 8));
            main.addMultiples(new Multiple(20,5));
            System.out.println(main.results.size());
        }

        public void addMultiples(Multiple m) {
            boolean found = results.contains(m);
            if (found) {
                System.out.println(m.A+" "+m.B+" Уже есть ");
            } else {
                results.add(m);
            }
        }
    }

