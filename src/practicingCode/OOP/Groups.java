package practicingCode.OOP;

import java.time.LocalDate;

public class Groups {
    int arrayOfStudents [] ;
    int durationOfaCourse;
    LocalDate dateOfGroup;
    Courses courses;
    int numOfstudents;

    public String toString(){
        return "This group is the group of a " + this.courses +
                ". there are " + numOfstudents+" students in this group";
    }

    public int countNumStud(Object[] arrayOfStudents){
        int numOfstudents = 0;
        for (Object NS: arrayOfStudents) {
            if (NS!=null){
                numOfstudents++;
            }
        }
        return numOfstudents;
    }


    public int[] getArrayOfStudents() {
        return arrayOfStudents;
    }

    public void setArrayOfStudents(int[] arrayOfStudents) {
        this.arrayOfStudents = arrayOfStudents;
    }

    public int getDurationOfaCourse() {
        return durationOfaCourse;
    }

    public void setDurationOfaCourse(int durationOfaCourse) {
        this.durationOfaCourse = durationOfaCourse;
    }

    public LocalDate getDateOfGroup() {
        return dateOfGroup;
    }

    public void setDateOfGroup(LocalDate dateOfGroup) {
        this.dateOfGroup = dateOfGroup;
    }

    public Courses getCourses() {
        return courses;
    }

    public void setCourses(Courses courses) {
        this.courses = courses;
    }
}
