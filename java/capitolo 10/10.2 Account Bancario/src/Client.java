
public class Client {
    private String name;
    private Account account;

    public Client(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return this.account;
    }

    public void addFunds (double ammount) {
        account.deposit(ammount);
    }

    public void withdrawFunds(double amount) {
        account.withdraw(amount);
    }
}
