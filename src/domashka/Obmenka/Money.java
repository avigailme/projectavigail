package domashka.Obmenka;

public class Money {
    double usd;
    double eur;
    double som;
    String Sostoyanie;
    double summa;

    public Money(){

    }

    public Money(double som, boolean prodazha) {
        this.som = som;
        this.prodazha = prodazha;
    }

    public double getSom() {
        return som;
    }

    public void setSom(double som) {
        this.som = som;
    }

    public String getSostoyanie() {
        return Sostoyanie;
    }

    public void setSostoyanie(String sostoyanie) {
        Sostoyanie = sostoyanie;
    }

    public double getSumma() {
        return summa;
    }

    public void setSumma(double summa) {
        this.summa = summa;
    }

    public boolean isProdazha() {
        return prodazha;
    }

    public void setProdazha(boolean prodazha) {
        this.prodazha = prodazha;
    }

    boolean prodazha;

    double  obmenDollar(int som, boolean prodazha){
        if (prodazha==true){
            usd=70;
        }
        else {
            usd=69;
        }

        return  som/usd;
    }
    double obmenEuro(int som, boolean prodazha){
        if (prodazha==true){
            usd=80;
        }
        else {
            usd=79;
        }
        return  som/eur;
    }


}
