public class ATMSmulation{
    public static void main(String[] args) {

        BankAccount acc = new BankAccount(1000);
        acc.withdraw(500);
        System.out.println("Balance: " + acc.getBalance());
        acc.withdraw(900); // should show error
        acc.withdraw(-78); //invalid amount
    }
}