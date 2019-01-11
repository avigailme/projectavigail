package interfaceExamples.ocean;

public class Turtle extends Animal implements  Swimmable {

    public Turtle(int id) {
        super(id= id);
    }
    @Override
    public String toString() {
        return "Turtle{" +
                "id=" + id +
                '}';
    }

    int layAnEgg(int a ){

        return a;
    };

    @Override
    public String swim(){
        return "I swim like a turtle";
    };

    @Override
    public String makeASound(){
        return "I don't make a sound really, bcs i am a turtle";
    };

}
