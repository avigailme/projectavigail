package domashka;

public class Brambi extends Horses {
    int StrengthOfOneKick;

    public int getStrengthOfOneKick() {
        return StrengthOfOneKick;
    }

    public void setStrengthOfOneKick(int strengthOfOneKick) {
        StrengthOfOneKick = strengthOfOneKick;
    }

    @Override
    void eat() {
        if (typeOfFood != "Zhir") {
            System.out.println("Mozhno est', jivem i kaifuem");
        }
    }


    void runs() {
        {
            System.out.println("Brambi runs, can u imagine? bruhh");
        }
    }

     void fights(){
        if (StrengthOfOneKick==100){
        System.out.println("BRAMBIII fights, can u imagine? ");
    }}

}

