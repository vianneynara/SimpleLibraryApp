package backend;

import java.util.LinkedList;

public class Perpustakaan {

    private String nama;
    private LinkedList<Item> list;

    public Perpustakaan(String nama) {
        this.nama = nama;
    }

    private boolean inputCD(String id, String judul, String penerbit, String tahunTerbit, String ISBN, String format) {
        return list.add(new Disk(id, judul, penerbit, tahunTerbit, ISBN, format));
    }

    private boolean inputBuku(String id, String judul, String penerbit, String tahunTerbit, String ISBN, int jumlahHalaman) {
        return list.add(new Buku(id, judul, penerbit, tahunTerbit, ISBN, jumlahHalaman));
    }

    private boolean inputMajalah(String id, String judul, String penerbit, String tahunTerbit, String ISBN, int volume, int jumlahHalaman) {
        return list.add(new Majalah(id, judul, penerbit, tahunTerbit, ISBN, volume, jumlahHalaman));
    }

    private Item cariJudul(String judul) {
        return new Disk(null, null, null, null, null, null);
    }

    private Item cariISBN(String ISBN) {
        return new Buku(null, null, null, null, null, 0);
    }
}
