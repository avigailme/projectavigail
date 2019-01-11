
package domashka;

public class ArabHorse extends Horses {
    int speedOfHorse;
    @Override
    void eat() {
        if (typeOfFood != "Morkovka") {
            System.out.println("Lavash Zhasaldy");
        }
    }

    public int getSpeedOfHorse() {
        return speedOfHorse;
    }

    public void setSpeedOfHorse(int speedOfHorse) {
        this.speedOfHorse = speedOfHorse;
    }

    @Override
    void runs() {
        if (speedOfHorse >= 5) {
            System.out.println("ArAbbb  Horse runs, can u imagine? ");
        }
    }


    void titup(){
        System.out.println("!!!ARAB HORSE!!! titups, can u imagine? bruhh");
    }
}
