package src;

public class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public SavingAccount(String accountNumber, String accountHolderName, double balance, String accountType, double interestRate) {
        super(accountNumber, accountHolderName, balance, accountType);
        this.interestRate = interestRate;
    }

    public double caculateInterest (double interestRate) {
        return getBalance()*interestRate/100;
    }
}
