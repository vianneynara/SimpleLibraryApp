import java.util.Date;

public class Transaksi {

    protected int idTransaksi;
    protected Date tglPinjam;
    protected Date tglKembali;
    protected float denda;
    protected Koleksi[] koleksi;

    public Transaksi(int idTransaksi, Date tglPinjam, Date tglKembali, float denda, Koleksi[] koleksi) {
        this.idTransaksi = idTransaksi;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.denda = denda;
        this.koleksi = koleksi;
    }

    public void pinjam() {
        return;
    }


    public void kembali() {
        return;
    }
}
