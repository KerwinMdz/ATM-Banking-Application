public class Account {

    double balance;
    double interest;
    int accountNumber;
    private static int numOfAccounts = 1000;

    public Account() {
        this.accountNumber = ++numOfAccounts;
    }
    //Methods for withdraw and deposit
    public void withdraw(double amount) {
         if (amount + 5 > balance){
             System.out.println("Sorry! Insufficient funds");
             return;
         }
             balance -= amount + 5;
        System.out.println("You have withdrawn " + amount + " dollars and incurred a fee of $5");
        System.out.println("Your current balance is $" + balance);

    }
    public void deposit(double amount) {
        if (amount < 0){
            System.out.println("Sorry! Enter amount again");
                    return;
        }
        amount += amount * interest;
        balance += amount;
        System.out.println("You deposited " + amount + " dollars with an interest of " + interest + "%");
        System.out.println("Your current balance is $" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    //Setters
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }

}
