public class BankAccount {
    private Double balance;
    // Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
    }

    // Withdraw method
    public void withdraw(double amt) {

        if (amt <= 0) {
            System.out.println("Invalid amount!");
        }
        else if (amt > balance) {
            System.out.println("Insufficient balance!");
        }
        else {
            balance -= amt;
            System.out.println("Withdrawal successful.");
        }
    }
}

