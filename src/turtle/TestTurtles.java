package turtle;

public class TestTurtles {

    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        turtle.swim();
        System.out.println(turtle.swim());

        Swimmable swimmableTurtle = new Turtle();
        AllInOne allInOneTutrle = new Turtle();
        Turtle turtle1 = new Turtle();
        //  turtle.swim();
        System.out.println(turtle.swim());
        System.out.println(allInOneTutrle.makeAnEgg());
        System.out.println(((Turtle) swimmableTurtle).haveAShell());

    }
}
