package tugas;

import java.util.ArrayList;

public class KelasKuliah {

    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public double hitungRataRata() {
        double total = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            total += m.getNilai();
        }

        return total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int jumlah = 0;

        for (Mahasiswa m : daftarMahasiswa) {
            if (m.lulus()) {
                jumlah++;
            }
        }

        return jumlah;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Nilai Mahasiswa ==");

        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMahasiswa.get(i).info());
        }
    }

    public int jumlahData() {
        return daftarMahasiswa.size();
    }
}