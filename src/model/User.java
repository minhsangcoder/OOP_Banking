package src.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userID;
    private String name;
    private String email;
    private String phoneNumber;
    private List<BankAccount> accounts = new ArrayList<>();

    public List<BankAccount> getAccount() {
        return accounts;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getUserID() {
        return userID;
    }

    public User(String userID, String name, String email, String phoneNumber) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accounts = new ArrayList<>();
    }

    public void addAccount (BankAccount account) {
        this.accounts.add(account);
    }

    public void display (String message) {
        System.out.println(message);
    }

    public void removeAccount(String accountNumber) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber)) {
                this.accounts.remove(bankAccount);
                return;
            }
        }
        display("Khong Tim Thay Tai Khoan Trung Lap.");
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            display("Khong Ton Tai Bat Cu Tai Khoan Nao.");
        }
        for (BankAccount bankAccount : accounts) {
            bankAccount.getAccountInfo();
        }
    }

    public void getUserInfo() {
        display("Ma Dinh Danh: " + getUserID() + "\n" +
                "Ten Nguoi Dung: " + getName() + "\n" +
                "Email Nguoi Dung: " + getEmail() + "\n" +
                "So Dien Thoai: " + getPhoneNumber() + "\n");
    }



}
