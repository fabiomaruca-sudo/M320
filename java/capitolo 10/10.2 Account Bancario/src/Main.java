//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Client cli1 = new Client("Giorgio Belli", new Account("120", 5000.15));

        cli1.addFunds(100);
        System.out.println(cli1.getAccount().getBalance());

        cli1.withdrawFunds(2000);
        System.out.println(cli1.getAccount().getBalance());

        cli1.withdrawFunds(9000);
        System.out.println(cli1.getAccount().getBalance());
    }
}