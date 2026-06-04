package bagian3.perpustakaanSoal;

import bagian3.perpustakaanSoal.Buku;

public class MainPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Sang Pemimpi", "Andrea Hirata", 2006));

        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");
        perpus.pinjamBuku("Bumi Manusia");

        System.out.println();

        perpus.kembalikanBuku("Bumi Manusia");
        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println();

        perpus.tampilkanKoleksi();

        System.out.println();
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());

        System.out.println();

        perpus.cariPenulis("Andrea Hirata");
    }
}