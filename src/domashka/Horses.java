package domashka;

public class Horses {
    int height;
    int weight;
    int age;
    String typeOfFood;
    String poroda;
    String typeOfSport;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }

    public void setTypeOfSport(String typeOfSport) {
        this.typeOfSport = typeOfSport;
    }

    @Override
    public String toString(){
        return "  My weight is" + this.weight+
                "My height is   " + this.height+
                "   Ma age is " + this.age+
                ".  MY pedigree is " + this.poroda+
                ". my  typeOfSport is" + this.typeOfSport;
    }

    void eat(){
        System.out.println("Horse eats something");
    }
    void runs(){
        System.out.println("Horse runs, can u imagine? bruhh>");
    }

}






