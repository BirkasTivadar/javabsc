package statements;

public class Investment {

    private final double cost = 0.3;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public double close(int days) {
        double result = active ? (fund + this.getYield(days)) * (1 - cost / 100) : 0;
        active = false;
        return result;
    }

    public double getYield(int days) {
        return fund * (interestRate / 100.0) * (days / 365.0);
    }

    public int getFund() {
        return fund;
    }

    public int getInterestRate() {
        return interestRate;
    }
}
