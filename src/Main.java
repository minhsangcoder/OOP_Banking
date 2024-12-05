package src;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("111", "Olivia", 50000, "Saving");
        BankAccount account2 = new BankAccount("222", "Jack", 500, "Saving");
        BankAccount account3 = new BankAccount("333", "Oggy", 5000, "Saving");
        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        BankService bankService = new BankService();

        bankService.deposit(account1, 5000);
        bankService.withdraw(account2, 5000);
        bankService.transfer(account1, account3, 5000);
        bankService.checkBalance(account2);
        bank.listAccounts();

    }
}