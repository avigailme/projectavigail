package practicingCode.OOP;

import java.time.LocalDate;

public class Students extends Person{

    boolean isFemale;
    String  name;
    String  surName;
    LocalDate localDate;
    String citizenship;

    public String toString(){
        return "I am student my name is"+ this.name+
                " _ and surname is " + this.surName+
                "i was born in  " +  this.citizenship;
     }

    public Students(String name, String surName, String citizenship) {
        this.name = name;
        this.surName = surName;
        this.citizenship = citizenship;
    }

    public Students(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }


}
