package interfaceExamples.Container;

public  interface Swimmable {

    default String swim(){

        return "something";
    }
}
