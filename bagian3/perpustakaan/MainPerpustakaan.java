package bagian3.perpustakaan;

public class MainPerpustakaan {

    public static void main(String[] args) {

        // Membuat objek pengelola
        Perpustakaan perpus = new Perpustakaan();

        // Membuat objek Buku lalu memasukkannya ke koleksi
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata"));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya"));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi"));

        // Menampilkan seluruh koleksi buku
        perpus.tampilkanKoleksi();

        System.out.println();

        // Meminjam buku
        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia"); // mencoba meminjam untuk kedua kali

        System.out.println();

        // Menampilkan koleksi setelah proses peminjaman
        perpus.tampilkanKoleksi();

        // Menampilkan jumlah buku yang masih tersedia
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }
}