package creating.classes;

public class Bank {
    private int accountNumber;
    private String accountName;
    private double balance;

    public Bank(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
public void addMoney (double amount) {
    this.balance += amount;
}
        public void drawMoney(double amount){
            if( this.balance>amount){
                this.balance-= amount;
            }
            else {
                System.out.println("Your balance is not enough");
            }
    }
public void changeAccountName (String newName){
        this.accountName = newName;
}

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
