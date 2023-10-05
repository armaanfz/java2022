public class Term extends Savings {
    private int termMonths;
    private double interestRate;

    public Term(String number, double funds, String clientID) {
        super(number, funds, clientID);
        this.termMonths = 6;
        this.interestRate = 2.7;
    }

    public Term(String number, double funds, String clientID, int termMonths, double interestRate) {
        super(number, funds, clientID);
        this.termMonths = termMonths;
        this.interestRate = interestRate;
    }

    public int getTermMonths() {
        return termMonths;
    }

    public void setTermMonths(int termMonths) {
        this.termMonths = termMonths;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return (this.getFunds() * interestRate * termMonths) / 1200;
    }

    public String toString() {
        return "  Term: " + getTermMonths()
                + "  Interest: " + getInterestRate()
                + super.toString();
    }
}
