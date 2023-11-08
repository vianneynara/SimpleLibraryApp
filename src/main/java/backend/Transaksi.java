package backend;

import java.util.Date;

public class Transaksi {
    /* atribut kelas */
    private String id;
    private Peminjam peminjam;
    private Date tglPinjam;
    private Date tglKembali;
    private float denda;
    private Koleksi[] koleksi;

    /* constructor utama */
    public Transaksi(String id, Peminjam peminjam, Date tglPinjam, Date tglKembali, float denda, Koleksi[] koleksi) {
        this.id = id;
        this.peminjam = peminjam;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.denda = denda;
        this.koleksi = koleksi;
    }

    /* metode kosong */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Peminjam getPeminjam() {
        return peminjam;
    }

    public void setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
    }

    public Date getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(Date tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public Date getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(Date tglKembali) {
        this.tglKembali = tglKembali;
    }

    public float getDenda() {
        return denda;
    }

    public void setDenda(float denda) {
        this.denda = denda;
    }

    public Koleksi[] getKoleksi() {
        return koleksi;
    }

    public void setKoleksi(Koleksi[] koleksi) {
        this.koleksi = koleksi;
    }

    public void pinjam() {
        return;
    }

    public void kembali() {
        return;
    }
}
