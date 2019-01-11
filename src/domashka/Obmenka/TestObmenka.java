package domashka.Obmenka;

public class TestObmenka {
    public static void main(String[] args) {
        Money money = new Money(10000,true);
        Nalichnye nalichnye = new Nalichnye();
        BezNalichnie bezNalichnie = new BezNalichnie();
       // double lol = bezNalichnie.ObmenDollar(10000, true);
        double lollol= nalichnye.obmenDollar(100000, true);
       // double lollol1= nalichnye.ObmenDollar(200000000, false);
        //double lollol1kk= nalichnye.ObmenDollar(1020, true);
        System.out.println(lollol);
       // System.out.println(lollol1);
        //System.out.println(lollol1kk);
        //System.out.println(lol);

    }
}
