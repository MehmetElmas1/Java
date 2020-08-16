package methodsandlibraries;

public class InternetBill {
    public static void main(String[] args) {
        System.out.println(decideInternetBill(150));

    }

    public static String decideInternetBill (int speed) {
        String decision;
        if(speed>100) {
            decision = " Good Speed";
        }
        else if (speed > 300) {
            decision = "Super Speed";
        }
        else {
            decision = "Not Applicaple (N/A)";
        }
        return decision;
    }
}
