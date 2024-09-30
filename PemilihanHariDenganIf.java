import java.util.Scanner;

public class PemilihanHari08 {
    public static void main(String[] args) {
        // Membuat scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan bilangan bulat
        System.out.print("Masukkan angka antara 1 hingga 7: ");
        int hari = scanner.nextInt();

        // Menggunakan if-else untuk menentukan hari
        if (hari >= 1 && hari <= 5) {
            System.out.println("Weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        // Menutup scanner
        scanner.close();
    }
}
