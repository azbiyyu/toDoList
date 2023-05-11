
public class ATM {
    public ATM() {
        System.out.println("Masukkan pin : ");
    }

    public void menu() {
        System.out.println("\n1. Tarik Tunai ");
        System.out.println("\n2. Deposit ");
        System.out.println("\n3. Informasi Saldo");
        System.out.println("\n4. Exit");
    }

    public void withDrawMenu() {
        System.out.println("masukkan jumlah yang mau di tarik");
    }

    public void depositMenu() {
        System.out.println("masukkan Jumlah untuk deposit");
    }

    public void balanceMenu(double balance) {
        System.out.printf("balance adalah %.2f ", balance);
    }

    public void invalidMessageMenu() {
        System.out.println("Invalid option, coba lagi");
    }

    public void exitMenu() {
        System.out.println("Terimakasih sudah menggunakan BANK");
    }
}
