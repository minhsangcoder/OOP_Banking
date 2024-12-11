package src.responsive;

import src.model.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public Bank() {

    }

    public Bank(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(BankAccount newAccount) {
        accounts.add(newAccount);
    }

    public void display(String message) {
        System.out.println(message);
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                return bankAccount;
            }
        }
        display("Khong Co Tai Khoan Trung Khop.");
        return null;
    }

    public void removeAccount(String accountNumber) {
        for (BankAccount bankAccount : accounts) {
            if (accountNumber == bankAccount.getAccountNumber()) {
                this.accounts.remove(bankAccount);
                return;
            }
        }
        display("Khong Tim Thay Tai Khoan De Xoa.");
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            display("Khong Ton Tai Tai Khoan.");
        }
        for (BankAccount bankAccount : accounts) {
            bankAccount.getAccountInfo();
        }
    }
}


