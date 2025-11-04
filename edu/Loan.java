package edu.bank;

public interface Loan {
    void getInterestRate(double rate);
    void calculateEMI(double amount, int years);
}
