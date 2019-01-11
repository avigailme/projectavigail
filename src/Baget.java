public class Baget extends Bread {
    double length;
    int quantity=0;

    void getQuan(){
        if (quantity!=0){
            scarp();
        }
    }
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    void scarp(){
        System.out.println("Ya Baget i was scarped");
    }
    @Override
    void pack(){
        System.out.println("Baget is ecologically packed");
    }

}
