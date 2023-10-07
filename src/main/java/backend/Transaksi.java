package backend;

import java.util.Date;

public class Transaksi {
    /* atribut kelas */
    protected int idTransaksi;
    protected Date tglPinjam;
    protected Date tglKembali;
    protected float denda;
    protected Koleksi[] koleksi;

    /* constructor utama */
    public Transaksi(int idTransaksi, Date tglPinjam, Date tglKembali, float denda, Koleksi[] koleksi) {
        this.idTransaksi = idTransaksi;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.denda = denda;
        this.koleksi = koleksi;
    }

    /* metode kosong */

    public void pinjam() {
        return;
    }

    public void kembali() {
        return;
    }
}
