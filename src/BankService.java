package src;

public class BankService {

    public void display (String message) {
        System.out.println(message);
    }

    final double minLimit = 5000;

    public void deposit (BankAccount account, double amount) {
        if (amount <= minLimit) {
            display("Gui Tien That Bai. So Tien Gui Phai Lon Hon 5000.");
            return;
        }
            double tienGui = account.getBalance() + amount;
            account.setBalance(tienGui);
            display("Gui Tien Thanh Cong.");
        }

    public void withdraw(BankAccount account, double amount) {
        if (amount <= minLimit) {
            display("Rut Tien That Bai. So Tien Rut Phai Lon Hon 5000.");
            return;
        } else if (amount > account.getBalance()) {
            display("So Du Trong Tai Khoan Khong Du.");
        }
        double tienRut = account.getBalance() - amount;
        account.setBalance(tienRut);
        display("Rut Tien Thanh Cong.");
    }

    public void transfer(BankAccount sourceAccount, BankAccount targetAccount, double amount) {
        if (amount < minLimit) {
            display("Giao Dich That Bai. So Tien Chuyen Phai Lon Hon 5000.");
            return;
        } else if (amount > sourceAccount.getBalance()) {
            display("Giao Dich That Bai. So Du Trong Tai Khoan Nguon Khong Du.");
            return;
        }
        double tkNguon = sourceAccount.getBalance() - amount;
        double tkNhan = targetAccount.getBalance() + amount;
        sourceAccount.setBalance(tkNguon);
        targetAccount.setBalance(tkNhan);
        display("Giao Dich Thanh Cong.");
    }

    public double checkBalance(BankAccount account) {
        return account.getBalance();
    }

}


