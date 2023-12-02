package backend.koleksi;

public class Buku extends Koleksi {
    /* atribut kelas */
    private String isbn;
    private int jumlahHalaman;

    /* constructor untuk memuat seluruh atribut kelas*/
    public Buku(String idKoleksi, String judul, String penerbit, String tahunTerbit, String isbn, int jumlahHalaman) {
        super(idKoleksi, judul, penerbit, tahunTerbit, false, "BUKU");
        this.isbn = isbn;
        this.jumlahHalaman = jumlahHalaman;
    }

    /* constructor untuk memuat status peminjaman juga */
    public Buku(String idKoleksi, String judul, String penerbit, String tahunTerbit, boolean statusPinjam, String isbn, int jumlahHalaman) {
        super(idKoleksi, judul, penerbit, tahunTerbit, false, "BUKU");
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

    @Override
    public String toString() {
        return super.toString() + " -> Buku{" +
            "isbn='" + isbn + '\'' +
            ", jumlahHalaman=" + jumlahHalaman +
            "} ";
    }
}
