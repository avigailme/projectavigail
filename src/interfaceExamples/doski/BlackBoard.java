package interfaceExamples.doski;

public class BlackBoard extends Doski{
    @Override
    public String erase(){
        this.color = "black";
        return "Now it's a blackBoard";
    }

    @Override
    public String writeWithMel(){
        this.color = "black";
        return "nothing";
    }

    @Override

    public String writewithPencil(){
        this.color = "black";
        return "Now you can write in here with pencil cause i am a black board";
    }
}