package bagian2.arraylist;

import java.util.ArrayList;

public class Soal2 {
    public static void main(String[] args) {

        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(15);
        angka.add(8);
        angka.add(27);
        angka.add(12);
        angka.add(20);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
    }
}