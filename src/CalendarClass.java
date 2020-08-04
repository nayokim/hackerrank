import java.util.Calendar;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("the  current date is " + calendar.getTime());
        calendar.add(Calendar.DATE, -15);
        System.out.println("the date 15 days ago was: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4);
        System.out.println("the date in  4 months: "+ calendar.getTime());
        calendar.add(Calendar.YEAR, 2);
        System.out.println("the date in 2 years: " + calendar.getTime());
    }
}
