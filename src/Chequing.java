public class Chequing extends Account {

    private  static String accountType = "Chequing";

    public Chequing(double initialDeposit) {
        super();
        if (initialDeposit > 1000) {
            this.setInterest(5);
        }else
            this.setInterest(2);
    }
    @Override
    public String toString(){
        return "Account type: " + accountType +
                "Account Number : \n" + getAccountNumber()
                + "Interest Rate: \n" + this.getInterest() +
                "Balance: $" + this.getBalance();
    }
}
