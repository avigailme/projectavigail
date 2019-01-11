package interfaceExamples.Container;

public class ChtoChto {
    Swimmable swimmable;
    Eggable eggable;

    public ChtoChto() {

    }

    public ChtoChto(Swimmable swimmable, Eggable eggable) {
        this.swimmable = swimmable;
        this.eggable = eggable;
    }

    public Swimmable getSwimmable(){
        return this.swimmable;
    }



}
