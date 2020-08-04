import java.util.Calendar;

public class CalendarClass2 {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance();
        System.out.println("At present calendar year: " + calender.get(Calendar.YEAR));
        System.out.println("At present calendar day: " + calender.get(Calendar.DATE));
        System.out.println("todays date: " + calender.getTime());
    }

}
