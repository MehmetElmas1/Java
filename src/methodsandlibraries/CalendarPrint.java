package methodsandlibraries;

public class CalendarPrint {
    public static void printCalendar(int year) {
        for(int i=1; i<13; i++){
            System.out.println("Month " +i);
        for(int j=1; j<31; j++) {
            System.out.println(i + "/" + j + "/" + year);
        }
            System.out.println("   ");
        }
    }
}
