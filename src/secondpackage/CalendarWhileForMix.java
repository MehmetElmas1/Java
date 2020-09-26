package secondpackage;

public class CalendarWhileForMix {
    public static void main(String[] args) {
        int month=1;
        while(month<13) {
            for(int day =1; day<=30; day++){
                System.out.println(month + "/" + day +"/" +"2020");
            }
        }
            month++;

    }
}
