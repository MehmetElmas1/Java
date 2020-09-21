package methodsandlibraries;

public class CarLoan {
    public static void main(String[] args) {
        System.out.println(calculateCarInsurance(4000,8));

    }

    public static double calculateCarInsurance(int totalCarPrice, int monthNumber){
        double result= 100000;
        int montly =500;
        result =(totalCarPrice/monthNumber) *9- monthNumber;
        return result;

    }
}
