public class Bread {
    double weight;
    double price;
    String ProducerCompany;
    String nameOfBread;

    public Bread(){
        if (weight==0||price==0){
            System.out.println("Ne zadany ves ili cena");
        }
    }

    public String getProducerCompany() {
        return ProducerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        ProducerCompany = producerCompany;
    }

    public String getNameOfBread() {
        return nameOfBread;
    }

    public void setNameOfBread(String nameOfBread) {
        this.nameOfBread = nameOfBread;
    }

    @Override
    public String toString(){
        return "Ma weight " + this.weight+
                ". MY price " + this.price+
                ". ProducerCompany " + this.ProducerCompany;
    }


    void bake(){
        System.out.println("Bread is ready");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducerCompnay() {
        return ProducerCompany;
    }

    public void setProducerCompnay(String producerCompnay) {
        this.ProducerCompany = producerCompnay;
    }

    void pack(){
        System.out.println("Bread is packed");
    }
}
