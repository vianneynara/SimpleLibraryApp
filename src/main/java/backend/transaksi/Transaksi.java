package backend.transaksi;

import backend.koleksi.Koleksi;
import backend.peminjam.Peminjam;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Transaksi implements Serializable {
    /* atribut kelas */
    private String idTransaksi;
    private Peminjam peminjam;
    private Date tglPinjam;
    private Date tglKembali;
    private float denda;
    private Koleksi[] koleksi;

    /* constructor utama */
    public Transaksi(String idTransaksi, Peminjam peminjam, Date tglPinjam, Date tglKembali, float denda, Koleksi[] koleksi) {
        this.idTransaksi = idTransaksi;
        this.peminjam = peminjam;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.denda = denda;
        this.koleksi = koleksi;
    }

	/**
	 * Mendapatkan list id koleksi yang ada di keranjang dipisah dengan koma.
	 * */
	public String getStringListIdKoleksi() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < koleksi.length; i++) {
			sb.append(koleksi[i].getIdKoleksi());
			if (i != koleksi.length - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
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

    @Override
    public String toString() {
        return "Transaksi{" +
                "idTransaksi='" + idTransaksi + '\'' +
                ", peminjam=" + peminjam +
                ", tglPinjam=" + tglPinjam +
                ", tglKembali=" + tglKembali +
                ", denda=" + denda +
                ", koleksi=" + Arrays.toString(koleksi) +
                '}';
    }
}
