package abstractClasses;

public abstract class Felidae extends Animals {

    int numOfClaws;
    int lengthOfTail;

    public int getNumOfClaws() {
        return numOfClaws;
    }

    public Felidae(){

    }

     abstract void mewMew();
     abstract void murMur();
     abstract void clawImprovement();
    void greeting() {
        System.out.println("ha ha ");
        mewMew();
        murMur();
        clawImprovement();
    }


    @Override
    public void makeNoise() {
        System.out.println("Mew mew");
    }

    @Override
    public void run() {
        System.out.println("tip tops");
    }

    public void setNumOfClaws(int numOfClaws) {
        this.numOfClaws = numOfClaws;
    }

    public int getLengthOfTail() {
        return lengthOfTail;
    }

    public void setLengthOfTail(int lengthOfTail) {
        this.lengthOfTail = lengthOfTail;
    }

    public int getLengthOfMustashe() {
        return lengthOfMustashe;
    }

    public void setLengthOfMustashe(int lengthOfMustashe) {
        this.lengthOfMustashe = lengthOfMustashe;
    }

    int lengthOfMustashe;
}
