import java.util.Scanner;

public class Kafe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        System.out.print("Pilih menu: \n - kopi\n - coklat\n - teh\nMasukkan menu: ");
        menu = input.nextLine();
        System.out.print("Masukkan ukuran cup: ");
        ukuranCup = input.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = input.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            default:
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga *= 1.25;
                break;
            case 'L':
                totalHarga *= 1.4;
                break;
            default:
                System.out.println("=====================================");
                System.out.println("Size yang anda pilih tidak tersedia");
                System.out.println("=====================================");
                input.close();
                return;
        }

        double diskon = keanggotaan ? 0.1 : 0;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.printf("Item pembelian %s %s dengan ukuran cup %s, jumlah %s\n", menu, ukuranCup, jumlah, menu);
        System.out.printf("\nNominal bayar: %s", nominalBayar);

        input.close();
    }
}
