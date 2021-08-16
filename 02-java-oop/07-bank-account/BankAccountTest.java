public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount frank=new BankAccount("1543795245");
        frank.deposit(300, "checking");
        frank.deposit(250, "saving");
        frank.getCheckingBalance();
        frank.withdrow(260, "saving");
        frank.getSavingBalance();

        frank.getTotal();

    }
}
