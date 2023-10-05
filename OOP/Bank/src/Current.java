import java.lang.Math;

public class Current extends Account {
    private double penaltyFee;
    private double overdraftFee = 300;

    public Current(String number, double funds) {
        super(number, funds);
        this.penaltyFee = penaltyFee;
    }

    public double getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdraw(double money)
    {
        if((this.getFunds() - money) > 0)
        {
            this.setFunds(this.getFunds() - money);
        }
        else
        {
            this.setPenaltyFee(Math.abs(this.getFunds() - money) + this.getOverdraftFee());
            this.setFunds(0);
        }
    }

    public double calculateInterest() {
        return 0;
    }

    public boolean equals(Current account) {
        return (this.getNumber() == account.getNumber());
    }

    public String toString() {
        return super.toString()
                + "  Penalty fee: " + String.format("$%,.2f", getPenaltyFee());
    }
}
