package AbstractClassesOdezhda;

public  abstract  class Shoes extends AbstractClassesOdezhda {
    @Override
    public void make(){
        System.out.println("I make this shit like______ ");
    }

    @Override
    public void deliver(){
        System.out.println("I deliver this shit like______ ");
    }

    @Override
    public void packing(){
        System.out.println("I pack this shit like______  ");
    }

    abstract void taka();
    abstract void shnurki();
    abstract void yazichok();
}
