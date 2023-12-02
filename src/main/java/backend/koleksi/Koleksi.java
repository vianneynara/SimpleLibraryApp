package backend.koleksi;

import java.io.Serializable;

/** Kelas abstrak yang mengimplementasi koleksi sebagai penyimpan atribut-atribut utama Koleksi. */
public abstract class Koleksi implements Serializable {
    /* class attributes */
    protected String idKoleksi;
    protected String judul;
    protected String penerbit;
    protected String tahunTerbit;
    protected boolean sedangDipinjam;
    protected String tipe;

    /* constructor for each class attribute */
    protected Koleksi(String idKoleksi, String judul, String penerbit, String tahunTerbit, boolean sedangDipinjam, String tipe) {
        this.idKoleksi = idKoleksi;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.sedangDipinjam = sedangDipinjam;
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

    public boolean isDipinjam() {
        return sedangDipinjam;
    }

    public void setsedangDipinjam(boolean dipinjam) {
        this.sedangDipinjam = dipinjam;
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
            ", sedangDipinjam=" + sedangDipinjam +
            ", tipe='" + tipe + '\'' +
            '}';
    }
}
