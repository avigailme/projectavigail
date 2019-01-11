package interfaceExamples.ocean;

public class Duck extends Animal implements Swimmable {


    public Duck(int id) {
        super(id = id);
    }

    @Override
    public String toString() {
        return "Duck{" +
                "id=" + id +
                '}';
    }
    @Override
    public String swim(){
        return "I duck like a duck";
    };

    @Override
    public String makeASound(){
        return "Dak Dak DAk";
    };

}
