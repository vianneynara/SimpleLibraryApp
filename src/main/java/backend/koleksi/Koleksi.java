package backend.koleksi;

import java.io.Serializable;
import java.util.Objects;

/** Kelas abstrak yang mengimplementasi koleksi sebagai penyimpan atribut-atribut utama Koleksi. */
public abstract class Koleksi implements Serializable, Comparable<Koleksi> {
    /* class attributes */
    protected String idKoleksi;
    protected String judul;
    protected String penerbit;
    protected String tahunTerbit;
    protected boolean tersedia;
    protected String tipe;

    /* constructor for each class attribute */
    protected Koleksi(String idKoleksi, String judul, String penerbit, String tahunTerbit, boolean tersedia, String tipe) {
        this.idKoleksi = idKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.tersedia = tersedia;
        this.tipe = tipe;
    }

    /* getters and setters */

    public String getIdKoleksi() {
        return idKoleksi;
    }

    public void setIdKoleksi(String idKoleksi) {
        this.idKoleksi = idKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setDipinjam() {
        this.tersedia = true;
    }

    public void setKembalikan() {
        this.tersedia = false;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return "Koleksi{" +
            "idKoleksi='" + idKoleksi + '\'' +
            ", judul='" + judul + '\'' +
            ", penerbit='" + penerbit + '\'' +
            ", tahunTerbit='" + tahunTerbit + '\'' +
            ", tersedia=" + tersedia +
            ", tipe='" + tipe + '\'' +
            '}';
    }

    /**
     * Hal ini penting karena kita ingin membandingkan objek Koleksi berdasarkan idKoleksi. Terutama
     * saat mengecek apabila suatu koleksi sudah ada di keranjang (menggunakan pengecekan
     * {@link java.util.ArrayList#contains(Object)}) yang menggunakan {@link #equals(Object)}.
     * */
    @Override
    public boolean equals(Object o) {
        // Mengecek apabila objek sama dengan dirinya sendiri.
        if (this == o)
            return true;
        // Mengembalikan false apabila objek bukan merupakan anak dari Koleksi.
        if (!(o instanceof Koleksi koleksi))
            return false;
        // Mengembalikan true apabila idKoleksi sama.
        return Objects.equals(getIdKoleksi(), koleksi.getIdKoleksi());
    }

    @Override
    public int compareTo(Koleksi o) {
        if (Objects.equals(this.getIdKoleksi(), o.getIdKoleksi())) {
            return 0;
        } else if (Integer.parseInt(this.getIdKoleksi()) < Integer.parseInt(o.getIdKoleksi())) {
            return -1;
        } else {
            return 1;
        }
    }
}
