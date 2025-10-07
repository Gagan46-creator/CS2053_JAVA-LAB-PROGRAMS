abstract class Account {
    String accountHolder;
    double balance;

   
    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    abstract void calculateInterest();


    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}


class SavingsAccount extends Account {
    double interestRate = 0.05; // 5% interest

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Savings Account Interest Added: ₹" + interest);
    }
}


class CurrentAccount extends Account {
    double overdraftLimit = 5000;

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account has no interest. Overdraft limit: ₹" + overdraftLimit);
    }
}


public class BankDemo {
    public static void main(String[] args) {

        
        Account acc1 = new SavingsAccount("Gagan", 10000);
        Account acc2 = new CurrentAccount("Ravi", 20000);

        System.out.println("--- Savings Account Details ---");
        acc1.displayBalance();
        acc1.calculateInterest();
        acc1.displayBalance();

        System.out.println("\n--- Current Account Details ---");
        acc2.displayBalance();
        acc2.calculateInterest(); // Calls CurrentAccount version
        acc2.displayBalance();
    }
}
