package src.model;

public class CheckingAccount extends BankAccount {
    public double transactionLimit;

    public CheckingAccount(double transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public CheckingAccount(String accountNumber, String accountHolderName, double balance, String accountType, double transactionLimit) {
        super(accountNumber, accountHolderName, balance, accountType);
        this.transactionLimit = transactionLimit;
    }

    public void display (String message) {
        System.out.println(message);
    }

    @Override
    public void withdraw (double amount) {
        double tienGoc = getBalance();
        if (getBalance() < minLimit) {
            display("So Tien Nho Hon Han Muc Cho Phep. ");
        } else if (getBalance() < amount) {
            display("So Du Trong Tai Khoan Khong Du. ");
        } else {
            tienGoc -= amount;
            display("Rut Tien Thanh Cong. So Du Hien Tai: " + tienGoc);
            setBalance(tienGoc);
        }
    }
}
