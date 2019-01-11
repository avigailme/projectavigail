package finalpackage;

public class TestClass extends Dog {
    final FinalBoy finalBoy = new FinalBoy();

    public static void main(String[] args) {
        Dog Bulterier = new Dog();

        TestClass tk = new TestClass();
        tk.finalBoy.value=200;
    }
}

class FinalBoy{
    int value;
}

