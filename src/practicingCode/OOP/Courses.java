package practicingCode.OOP;

import java.time.LocalDate;

public class Courses {
    String nameOfLes;
    int idOfLesson;
    LocalDate dateOfCreation;

    public String  toString(){
        return "This Class is the " + this.nameOfLes;
    }

    public Courses(String nameOfLes, LocalDate localDate) {
        this.nameOfLes = nameOfLes;
        this.dateOfCreation = localDate;
    }

    public String getNameOfLes() {
        return nameOfLes;
    }

    public void setNameOfLes(String nameOfLes) {
        this.nameOfLes = nameOfLes;
    }

    public int getIdOfLesson() {
        return idOfLesson;
    }

    public void setIdOfLesson(int idOfLesson) {
        this.idOfLesson = idOfLesson;
    }

    public LocalDate getLocalDate() {
        return dateOfCreation;
    }

    public void setLocalDate(LocalDate localDate) {
        this.dateOfCreation = localDate;
    }
}
