package creating.classes;

public class LoansTest {
    public static void main(String[] args) {

        Loan myLoan = new Loan(1.18, 60,20000);
        System.out.println(myLoan.calculateMonthyPayment());
        System.out.println(myLoan.calculateTotalLoan());
        CarLoan myCarLoan = new CarLoan(1.14, 48,35000, 1.2,800);

    }
}
