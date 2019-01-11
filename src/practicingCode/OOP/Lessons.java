package practicingCode.OOP;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lessons {
    LocalDate dateOfaLesson;
    Students presentStudents;
    Courses courses;
    boolean homeWorkWas;
    boolean examTookPlace;

    public Lessons(LocalDate dateOfaLesson, Students presentStudents, Courses courses, boolean homeWorkWas, boolean examTookPlace, LocalDateTime timeOfStart) {
        this.dateOfaLesson = dateOfaLesson;
        this.presentStudents = presentStudents;
        this.courses = courses;
        this.homeWorkWas = homeWorkWas;
        this.examTookPlace = examTookPlace;
        this.timeOfStart = timeOfStart;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "dateOfaLesson=" + dateOfaLesson +
                ", presentStudents=" + presentStudents +
                ", courses=" + courses +
                ", homeWorkWas=" + homeWorkWas +
                ", examTookPlace=" + examTookPlace +
                ", timeOfStart=" + timeOfStart +
                '}';
    }

    LocalDateTime timeOfStart;

    public LocalDate getDateOfaLesson() {
        return dateOfaLesson;
    }

    public void setDateOfaLesson(LocalDate dateOfaLesson) {
        this.dateOfaLesson = dateOfaLesson;
    }

    public Students getPresentStudents() {
        return presentStudents;
    }

    public void setPresentStudents(Students presentStudents) {
        this.presentStudents = presentStudents;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }

    public boolean isHomeWorkWas() {
        return homeWorkWas;
    }

    public void setHomeWorkWas(boolean homeWorkWas) {
        this.homeWorkWas = homeWorkWas;
    }

    public boolean isExamTookPlace() {
        return examTookPlace;
    }

    public void setExamTookPlace(boolean examTookPlace) {
        this.examTookPlace = examTookPlace;
    }

    public LocalDateTime getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(LocalDateTime timeOfStart) {
        this.timeOfStart = timeOfStart;
    }
}
