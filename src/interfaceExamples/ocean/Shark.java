package interfaceExamples.ocean;

public class Shark extends Animal implements Swimmable {

    public Shark(int id) {
        super(id = id);
    }

    @Override
    public String toString() {
        return "Shark{" +
                "id=" + id +
                '}';
    }

    @Override
public String swim(){
    return "I swim like a shark";
};

    public String hunt(){
          return "I hunt like a shark";
    };

@Override
    public String makeASound(){
    return "I am a sha sha shark";
};

}
