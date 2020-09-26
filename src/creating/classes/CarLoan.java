package creating.classes;

public class CarLoan extends Loan{
    private double APR;
    private int creditScore;

    public CarLoan(double interestRate, int numberOfpayment, double loanAmount, double APR, int creditScore){
        super(interestRate, numberOfpayment,loanAmount);
        this.APR =APR;
        this.creditScore = creditScore;
    }

    public double getAPR() {
        return APR;
    }

    public void setAPR(double APR) {
        this.APR = APR;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public double calculateMonthlyPayment(){
        double monthly;
        monthly = super.getLoanAmount()*this.APR/super.getNumberOfpayment()-this.creditScore;
        return monthly;
    }


    @Override
    public String toString() {
        return "CarLoan{" +
                "APR=" + APR +
                ", creditScore=" + creditScore +
                '}';
    }
}
