public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if(amount<0){
            String str = "Cannot deposit or withdraw a negative amount";
            throw new NegativeAmountException(str);
        }
        balance+=amount;
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if(amount<0){
            String str = "Cannot deposit or withdraw a negative amount";
            throw new NegativeAmountException(str);
        }
        if(amount>balance){
            throw new InsufficientFundsException("Not enough balance!");
        }
        balance-=amount;
    }

    public double getBalance(){return  balance;}

}
