import java.util.Scanner;

public class PemilihanHariDenganIf08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka antara 1 hingga 7: ");
        int day = scanner.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        
        scanner.close();
    }
}
