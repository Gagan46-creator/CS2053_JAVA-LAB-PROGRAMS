package edu.bank;

public class HomeLoan implements Loan {
    double rate;

    public void getInterestRate(double rate) { this.rate = rate; }

    public void calculateEMI(double amount, int years) {
        double emi = (amount * rate * years) / 100;
        System.out.println("Home Loan EMI: " + emi);
    }
}
