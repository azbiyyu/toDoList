public interface Transactions{
    boolean withDraw(double creditAmt);
    boolean deposit(double debitAmt);
    double getBalance();
}