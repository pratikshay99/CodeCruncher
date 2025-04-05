package Beginner.advanced.OOPS;

public class EncapsulationEg {
    private double balance; // Private variable (data hiding)

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }

}
/*
-Data hiding using access modifiers
Encapsulation = Wrapping data & methods together + restricting direct access.
Prevents direct modification, ensures security
 */