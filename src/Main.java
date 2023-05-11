import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * System.out.println("ATM System...");
         * System.out.println("===============");
         * Account acc1 = new Account(5000,1234);
         * System.out.println(acc1.getBalance());
         * acc1.deposit(700);
         * System.out.println(acc1.getBalance());
         * acc1.withDraw(1000);
         * System.out.println(acc1.getBalance());
         */
        int pinNum;
        int userOption = 0;
        Account acc1 = new Account(5000, 1234);
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        pinNum = sc.nextInt();
        if (acc1.validatePin(pinNum)) {
            // System.out.println("sukses");
            do {
                atm.menu();
                userOption = sc.nextInt();
                switch (userOption) {
                    case 1:
                        atm.withDrawMenu();
                        double withDrawAmount = sc.nextDouble();
                        acc1.withDraw(withDrawAmount);
                        break;
                    case 2:
                        atm.depositMenu();
                        double depositAmount = sc.nextDouble();
                        acc1.deposit(depositAmount);
                        break;
                    case 3:
                        atm.balanceMenu(acc1.getBalance());
                        break;
                    case 4:
                        atm.exitMenu();
                        break;

                    default:
                        atm.invalidMessageMenu();
                        break;
                }
            } while (userOption != 4);
            sc.close();  
        }
    }
}
