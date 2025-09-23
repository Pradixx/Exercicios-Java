package Entities;

public class BrazilInterestRate implements InterestRate {
    private double interestRate;

    public BrazilInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
