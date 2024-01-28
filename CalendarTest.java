import java.util.GregorianCalendar;
public class CalendarTest {
    public static void main(String[] args) {
        // Create a GregorianCalendar instance for the current date
        GregorianCalendar calendar = new GregorianCalendar();
        // Obtain and display the current year, month, and day
        int currentYear = calendar.get(GregorianCalendar.YEAR);
        int currentMonth = calendar.get(GregorianCalendar.MONTH) + 1;
        // Adding 1 since months are zero-based
        int currentDay = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Current Date:");
        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + currentMonth);
        System.out.println("Day: " + currentDay);
    }
}
