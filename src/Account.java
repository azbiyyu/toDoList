
public class Account implements Transactions{
    private final int accountNumber;
    private int pin;
    private double balance;
    private static int nextAccountNumber = 1001;
    public Account(double bal, int pin){
        this.balance = bal;
        this.pin = pin;
        accountNumber = getNextAccountNumber();
    }
    public boolean validatePin(int p){
        if(this.pin == p){
            return true;
        }
        System.out.println("invalid PIN");
        return false;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public static int getNextAccountNumber(){
        int accNo = nextAccountNumber;
        nextAccountNumber++;
        return accNo;
    }
    @Override
    public boolean withDraw(double debitAmt){
        if(debitAmt > balance){
            System.out.println("Saldo tidak cukup");
            return false;
        }
        balance -= debitAmt;
        System.out.println("ambil kartu dan uangmu");
        return true;
    }
    @Override
    public boolean deposit(double creditAmt){
        balance += creditAmt;
        System.out.println("deposit sukses");
        return true;
    }
    @Override
    public double getBalance(){
        return balance;
    }






}
