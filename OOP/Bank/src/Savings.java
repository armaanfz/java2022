public class Savings extends Account {
    private String clientID;
    public static final double INTEREST = 0.05;

    public Savings(String number, double funds, String clientID) {
        super(number, funds);
        this.clientID = clientID;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public double calculateInterest() {
        return this.getFunds() * INTEREST;
    }

    public boolean equals(Savings account) {
        return (this.getClientID() == account.clientID)&&(this.getNumber()== account.getNumber());
    }

    public String toString() {
        return "Client ID: " + getClientID()
                + super.toString();
    }

}
