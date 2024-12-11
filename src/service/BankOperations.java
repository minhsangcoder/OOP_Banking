package src.service;

import src.model.BankAccount;

public interface BankOperations {
    void deposit(BankAccount account, double amount);
    void withdraw(BankAccount account, double amount);
    void transfer(BankAccount source, BankAccount target, double amount);

}
