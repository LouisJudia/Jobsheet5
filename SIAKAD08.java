import java.util.Scanner;

public class SIAKAD08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim, kelas, nilaiHuruf = "", kualifikasi = "";
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        // Data Mahasiswa
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine()/*.charAt(0)*/;
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();

        // Nilai
        System.out.print("Masukkan nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35);

        if(nilaiAkhir >= 85) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if(nilaiAkhir >= 80) {
            nilaiHuruf = "A-";
            kualifikasi = "Lebih dari Baik";
        } else if(nilaiAkhir >= 75) {
            nilaiHuruf = "B+";
            kualifikasi = "Baik";
        } else if(nilaiAkhir >= 70) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if(nilaiAkhir >= 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if(nilaiAkhir >= 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if(nilaiAkhir >= 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.printf("Mahasiswa dengan nama %s - %s (%s) %s", nama, nim, absen, kelas);
        System.out.printf("\nNilai Akhir: %.1f | Nilai Huruf: %s | Kualifikasi: %s\n", nilaiAkhir, nilaiHuruf, kualifikasi);

        sc.close();
    }
}
