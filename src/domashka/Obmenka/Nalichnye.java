package domashka.Obmenka;

import java.util.Random;

public class Nalichnye extends Money {

double usdVeroyat;
double usdVeroyat2;
    @Override
    double obmenDollar(int som, boolean prodazha) {
        if (prodazha==true){
            usd = 70;
            double ran=((int)(Math.random()*8));
            usdVeroyat= usd*(((int)(Math.random()*8)) / 100)+usd;
            System.out.println(ran);
        }
        else {
            usd = 69;
            usdVeroyat2= usd - usd*((0+(int)(Math.random()*8)) * 100);
            System.out.println(usdVeroyat2);
        }

        return som/usd;
    }

    @Override
    double obmenEuro(int som, boolean prodazha) {
        if (prodazha==true){
            eur= eur*((int)Math.random()*8) / 100+eur;
        }
        else {
            eur= eur - eur*((int)Math.random()*8) * 100;
        }

        return som / eur;
    }
}
