package list;

import java.util.Scanner; // Add this import statement

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MataKuliah mataKuliah = new MataKuliah();
        int pilihan;

        do {
            System.out.println("============================");
            System.out.println("Menu:");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Tampilkan Mata Kuliah");
            System.out.println("3. Hitung Jumlah Mata Kuliah");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer4
            

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String mataKuliahBaru = scanner.nextLine();
                    mataKuliah.tambahMataKuliah(mataKuliahBaru);
                    System.out.println("Mata kuliah ditambahkan.");
                    break;
                case 2:
                    System.out.println("Daftar Mata Kuliah:");
                    for (String mk : mataKuliah.getDaftarMataKuliah()) {
                        System.out.println(mk);
                    }
                    break;
                case 3:
                    System.out.println("Jumlah mata kuliah: " + mataKuliah.hitungJumlahMataKuliah());
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang dicari: ");
                    String cari = scanner.nextLine();
                    String hasilCari = mataKuliah.cariMataKuliah(cari);
                    if (hasilCari != null) {
                        System.out.println("Mata kuliah ditemukan: " + hasilCari);
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
        scanner.close();
    }
}