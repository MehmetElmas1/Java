package methodsandlibraries;

public class MortgageLoan{
    public static void main(String[] args) {
        System.out.println(decidePayment(150));

    }
    public static String decidePayment (int speed) {
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
