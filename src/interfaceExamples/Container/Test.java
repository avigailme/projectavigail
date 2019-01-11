package interfaceExamples.Container;

public class Test {
    public static void main(String[] args) {


        Swimmable swimmable = new Turtle();
        Eggable eggable = new Chicken();
        ChtoChto somethingInContainer = new ChtoChto(swimmable, eggable);
       // System.out.println(((Chicken) eggable).swim());
        //System.out.println(somethingInContainer);

        Eggable turtle = new Turtle();
        System.out.println(turtle.isSwimming);

        //System.out.println(Eggable.isSwimming);

        ChtoChto chtoChto = new ChtoChto();
       // chtoChto.getSwimmable();
        somethingInContainer.getSwimmable();
        System.out.println(somethingInContainer.getSwimmable());



    }


}
