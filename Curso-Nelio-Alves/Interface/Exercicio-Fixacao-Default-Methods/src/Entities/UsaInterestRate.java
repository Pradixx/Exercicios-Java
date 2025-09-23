package Entities;

public class UsaInterestRate implements InterestRate{
    private double interestRate;

    public UsaInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
