package interfaceExamples.ocean;

public class Test {
    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.swimmables = new Swimmable[12];
        Swimmable [] turtles = new Turtle[10];
        Swimmable [] ducks = new Duck[10];
        Swimmable [] sharks = new Shark[10];
        int duckId = 0;
        int sharkId = 0;
        int turtleId = 0;

        int idOfObjects = 0;
        for (int i = 0; i < 13; i++) {
            if (i <= 4) {
                ocean.swimmables[i] = new Duck(idOfObjects++);
            } else if
            (i > 4 && i <= 8) {
                ocean.swimmables[i] = new Turtle(idOfObjects++);
            } else if (i <= 9 && i < 12) {
                ocean.swimmables[i] = new Shark(idOfObjects++);

            }
        }
        idOfObjects++;


        for (int i = 0; i < 12; i++) {

            if (ocean.swimmables != null) {
                if (ocean.swimmables[i] instanceof Duck) {

                    System.out.println(((Duck) ocean.swimmables[i]).makeASound());
                } else if (ocean.swimmables[i] instanceof Turtle) {
                    System.out.println(((Turtle) ocean.swimmables[i]).layAnEgg(idOfObjects++));
                } else if (ocean.swimmables[i] instanceof Shark) {
                    System.out.println(((Shark) ocean.swimmables[i]).hunt());
                }
            }
            if (ocean.swimmables[i] instanceof Duck){
                ducks[duckId]=ocean.swimmables[i];
            }
            else if (ocean.swimmables[i] instanceof Shark){
                ducks[sharkId]=ocean.swimmables[i];
            }
           else if (ocean.swimmables[i] instanceof Turtle){
                ducks[turtleId]=ocean.swimmables[i];
            }
        }

        System.out.println(ocean.swimmables[9].makeASound());
    }

}
