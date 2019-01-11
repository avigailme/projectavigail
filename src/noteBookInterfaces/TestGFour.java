package noteBookInterfaces;

public class TestGFour {
    public static void main(String[] args) {
        Computers computers = new Computers(100000, ModelOfComp.DELL);
        Computers computers1 = new Computers(20000, ModelOfComp.ASUS);
        System.out.println(computers.modelOfComp);
        System.out.println(computers1.modelOfComp);

        for ( ModelOfComp m : ModelOfComp.values()
             ) {
            System.out.println(m.ordinal()+" " + m);

        }
    }
}
