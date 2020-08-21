package methodsandlibraries;

public class MortgageLoanLeft {
    public static void main(String[] args) {
        System.out.println(calculateMorgageloan(400,15));

    }

    public static int calculateMorgageloan (int montlyPayment, int mountNumber) {
        int totalAmount= 35000;

        int restPayment = totalAmount - montlyPayment*mountNumber;
        return restPayment;
    }
}
