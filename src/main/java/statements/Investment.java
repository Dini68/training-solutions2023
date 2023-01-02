package statements;

public class Investment {

    private final double cost;
    private final int fund;
    private final int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        this.cost = 0.3;
        this.active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return days / 365.0 * fund * interestRate / 100;
    }

    public double close(int days) {
        double fullAmount;
        fullAmount = active ? (fund + getYield(days)) * (1 - cost / 100) : 0;
        active = false;
        return fullAmount;
    }

}
