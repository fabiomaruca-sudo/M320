
public class Account {
    private double balance;
    private String accountNumber;

    public Account(String accountNumber, double balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("prelievo accettato");
        } else  {
            System.out.println("prelievo respinto");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

}
