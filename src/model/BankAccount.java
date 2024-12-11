package src.model;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public BankAccount() {}

    public BankAccount(String accountNumber, String accountHolderName, double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    final double minLimit = 5000;

    public void display (String message) {
        System.out.println(message);
    }

    public void deposit (double amount) {
        if (amount > minLimit) {
            this.balance += amount;
            display("Gui Tien Thanh Cong. So Du Hien Tai: " + this.balance);
        } else {
            display("Giao Dich Khong Thanh Cong. So Tien Gui Phai Lon Hon 5000");
        }
    }

    public void withdraw (double amount) {
        if (amount > minLimit) {
            if (amount <= this.balance) {
                this.balance -= amount;
                display("Rut Tien Thanh Cong. So Du Hien Tai: " + this.balance);
            } else {
                display("So Du Trong Tai Khoan Khong Du. Khong The Thuc Hien Giao Dich");
            }
        } else {
            display("Rut Tien That Bai. So Tien Rut Phai Lon Hon 5000");
        }
    }

    public double checkBalance () {
        return this.balance;
    }

    public void getAccountInfo () {
        display("So Tai Khoan: " + this.accountNumber + "\n" +
                "Chu Tai Khoan: " + this.accountHolderName + "\n" +
                "So Du: " + this.balance + "\n" +
                "Loai Tai Khoan: " + this.accountType + "\n");
    }
}
