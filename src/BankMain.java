public class BankMain {

    public static void main(String[] args) {
        BankAccount b = new BankAccount(0);
        try{
            b.deposit(500);
            b.withdraw(100);
            System.out.println(b.getBalance());

        }
        catch(NegativeAmountException e){
            System.out.println(e);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e);
        }
        try{
            b.withdraw(-50);
            b.withdraw(1000);
        }

        catch(InsufficientFundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
