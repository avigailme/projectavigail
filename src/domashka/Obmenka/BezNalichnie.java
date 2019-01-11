package domashka.Obmenka;

public class BezNalichnie extends Money {

    @Override
    double obmenDollar(int som, boolean prodazha) {

        if (prodazha==true){
            usd= 71.4;
        }
        else {
            usd = 68.6;
        }
        return som/usd;
    }

    @Override
    double obmenEuro(int som, boolean prodazha) {
     if (prodazha==true){
        usd= 81.6;
    }
        else {
        usd = 77.42;
    }

        return som/eur;
    }
}
