package tugas;

public class MainTugas {

    public static void main(String[] args) {

        String[] mataKuliah = {
            "Pemrograman Berorientasi Objek",
            "Basis Data",
            "Struktur Data"
        };

        System.out.println("== Daftar Mata Kuliah ==");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }

        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Faris", "231001001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231001002", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Siti", "231001003", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Rina", "231001004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001005", 45));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai: " + kelas.hitungRataRata());
        System.out.println("Jumlah mahasiswa lulus: " + kelas.jumlahLulus());

        System.out.println();

        kelas.tambahMahasiswa(new Mahasiswa("Dewi", "231001006", 78));

        System.out.println("Setelah menambahkan mahasiswa baru:");
        System.out.println("Jumlah data terbaru: " + kelas.jumlahData());
    }
}