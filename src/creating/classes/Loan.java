package creating.classes;

public class Loan {
    private double interestRate;
    private int numberOfpayment;
    private double loanAmount;

    public Loan(double interestRate, int numberOfpayment, double loanAmount) {
        this.interestRate = interestRate;
        this.numberOfpayment = numberOfpayment;
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getNumberOfpayment() {
        return numberOfpayment;
    }

    public void setNumberOfpayment(int numberOfpayment) {
        this.numberOfpayment = numberOfpayment;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
public double calculateMonthyPayment(){
        double monthly = this.loanAmount*this.interestRate/this.numberOfpayment;
        return monthly;
}

public double calculateTotalLoan(){
      double total = this.loanAmount*this.interestRate;
      return total;
}

    @Override
    public String toString() {
        return "Loan{" +
                "interestRate=" + interestRate +
                ", numberOfpayment=" + numberOfpayment +
                ", loanAmount=" + loanAmount +
                '}';
    }
}
