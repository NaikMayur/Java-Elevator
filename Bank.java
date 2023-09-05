package Bank;

public class Bank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficent balance.");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;

    }

    public String getAccountHoldername() {
        return accountHolderName;
    }

    public static void main(String[] args) {
        Bank account1 = new Bank("234521", "Mayur");
        String accountNumber = account1.getAccountNumber();
        String accountHolderName = account1.getAccountHoldername();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        account1.deposit(500000);
        account1.withdraw(5000);
        double balance = account1.checkBalance();
        System.out.println("Account Balance: " + balance);
    }
}
