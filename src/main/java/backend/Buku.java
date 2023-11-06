package backend;

public class Buku extends Koleksi {
    /* atribut kelas */
    private String isbn;
    private int jumlahHalaman;

    /* constructor untuk memuat seluruh atribut kelas*/
    public Buku(String id, String judul, String penerbit, String tahunTerbit, String isbn, int jumlahHalaman) {
        super(id, judul, penerbit, tahunTerbit);
        this.isbn = isbn;
        this.jumlahHalaman = jumlahHalaman;
    }

    /* getters and setters */

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
}
