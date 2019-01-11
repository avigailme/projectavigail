package noteBookInterfaces;

public class TestDays {
    public static void main(String[] args) {
        String inpDay = "Monday";
        WeekDays weekDays = WeekDays.valueOf(inpDay);

        switch (weekDays){
            case Monday:
            case Wednesday:
            case Friday:
                System.out.println("I am studying on  " + weekDays); break;
                default:
                    System.out.println(" i am free at" + weekDays); break;

        }

    }
}
