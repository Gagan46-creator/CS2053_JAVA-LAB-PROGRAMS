class LowBalance extends Exception {
    public LowBalance(String msg) {
        super(msg);
    }
}

class BankAccount {
    String accNo;
    double balance;

    BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void withdraw(double amount) throws LowBalance {
        if (amount > balance)
            throw new LowBalance("Available: " + balance);
        balance -= amount;
        System.out.println("Remaining Balance: " + balance);
    }
}

public class Lab6 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("A101", 5000);

        try {
            acc.withdraw(2000);  
            acc.withdraw(4000);  
        } catch (LowBalance e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction Completed");
        }
    }
}