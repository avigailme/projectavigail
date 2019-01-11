package interfaceExamples.doski;

public abstract class Doski implements InterfaceForBoards {
  public  String color;

    public String erase(){
     return "somethihng + +  ";
    }

    public Doski(){

    }
    public Doski(String color) {
        this.color = color;

    }

    public void proverka(String color){
        if (color=="white"){
            writeWithMel();
        }
        else {
            writewithPencil();
        }
    }
}
