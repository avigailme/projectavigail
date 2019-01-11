package interfaceExamples.doski;

public class WhiteBoard extends Doski{

    //String color = "white";


    @Override
    public String erase(){
        this.color = "white";
        return "Now it's a whiteboard";
    }

    @Override
    public String writeWithMel(){
        this.color = "white";
        return "Now you can write in her with mel cause i am a white board";
    }

    @Override

    public String writewithPencil(){
        return "nothing";
    }
}
