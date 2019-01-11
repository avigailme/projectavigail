package interfaceExamples.ocean;

public class ExchangeBureau implements Convertable {
    int USD = 68;
    int EUR = 80;
    int RUB = 2;
    @Override
    public double convert(String currency, int amount) {
        if (currency == "USD") {
            amount = amount * USD;
            return  amount;
        }
       else if (currency == "EUR") {
            amount = amount * EUR;
            return amount;
        }
        else {
            amount = amount * RUB;
            return amount;
        }

    }
}
