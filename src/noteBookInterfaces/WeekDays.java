package noteBookInterfaces;

public enum WeekDays {
    Monday("ПН"),
    Tuesday("ВТ"),
    Wednesday("СР"),
    Thursday("ЧТ"),
    Friday("ПТ"),
    Saturday("СБ"),
    Sunday("ВС");

    private String title;
    WeekDays(String title){
        this.title = title;
    }

    @Override
   public String toString(){
        return title;
    }
}
