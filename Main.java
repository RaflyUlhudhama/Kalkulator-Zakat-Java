import java.util.Scanner;

public class Main {
    private static final double HARGA_BERAS = 12000.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("Selamat datang di Program Zakat");

        do {
            System.out.println("1. Fitrah");
            System.out.println("2. Mal");
            System.out.println("3. Pertanian");
            System.out.println("0. Keluar");
            System.out.print("Pilih jenis zakat : ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah orang: ");
                    double jumlahOrang = scanner.nextDouble();
                    ZakatFitrah zakatFitrah = new ZakatFitrah(jumlahOrang);
                    double zakatFitrahKg = zakatFitrah.calculateZakat();
                    System.out.println("Total Zakat Fitrah: " + zakatFitrahKg + " kg, atau Rp " + (zakatFitrahKg * HARGA_BERAS));
                    break;
                case 2:
                    System.out.print("Masukkan jumlah harta: ");
                    double jumlahHarta = scanner.nextDouble();
                    ZakatMal zakatMal = new ZakatMal(jumlahHarta);
                    double zakatMalRp = zakatMal.calculateZakat();
                    if (zakatMalRp > 0) {
                        System.out.println("Total Zakat Mal: Rp " + zakatMalRp);
                    } else {
                        System.out.println("Jumlah harta belum memenuhi syarat nisab untuk zakat mal.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan hasil panen (Kg): ");
                    double hasilPanen = scanner.nextDouble();
                    System.out.print("Apakah menggunakan irigasi? (y/n): ");
                    char irigasiInput = scanner.next().charAt(0);
                    boolean isIrigasi = (irigasiInput == 'y' || irigasiInput == 'Y');
                    
                    ZakatPertanian zakatPertanian = new ZakatPertanian(hasilPanen, isIrigasi);
                    double zakatPertanianKg = zakatPertanian.calculateZakat();

                    if (zakatPertanianKg > 0) {
                        double zakatPertanianRp = zakatPertanianKg * HARGA_BERAS;
                        System.out.println("Total Zakat Pertanian: " + zakatPertanianKg + " kg, atau Rp " + zakatPertanianRp);
                    } else {
                        System.out.println("Jumlah hasil panen belum memenuhi syarat nisab untuk zakat pertanian.");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan Program Zakat.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
