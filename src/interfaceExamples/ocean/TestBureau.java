package interfaceExamples.ocean;

public class TestBureau {
    public static void main(String[] args) {
        ExchangeBureau exchangeBureau = new ExchangeBureau();
        //exchangeBureau.convert("USD",200);
        System.out.println(exchangeBureau.convert("USD", 100));
    }

}
