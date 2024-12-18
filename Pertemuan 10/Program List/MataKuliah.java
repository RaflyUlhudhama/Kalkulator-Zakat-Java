package list;

import java.util.ArrayList;
import java.util.List;

public class MataKuliah {
    private List<String> daftarMataKuliah;

    public MataKuliah() {
        daftarMataKuliah = new ArrayList<>();
    }

    public void tambahMataKuliah(String mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public String cariMataKuliah(String nama) {
        for (String mataKuliah : daftarMataKuliah) {
            if (mataKuliah.equalsIgnoreCase(nama)) {
                return mataKuliah;
            }
        }
        return null; // Jika tidak ditemukan
    }

    public int hitungJumlahMataKuliah() {
        return daftarMataKuliah.size();
    }

    public List<String> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
}
