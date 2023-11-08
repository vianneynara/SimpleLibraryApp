package backend;

import java.io.Serializable;

/** Kelas abstrak yang mengimplementasi koleksi sebagai penyimpan atribut-atribut utama Koleksi. */
public abstract class Koleksi implements Serializable {
    /* class attributes */
    protected String id;
    protected String judul;
    protected String penerbit;
    protected String tahunTerbit;
    protected boolean statusPinjam;

    /* constructor for each class attribute */
    protected Koleksi(String id, String judul, String penerbit, String tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.statusPinjam = false;
    }

    /* getters and setters */

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        return statusPinjam;
    }

    public void setStatusPinjam(boolean statusPinjam) {
        this.statusPinjam = statusPinjam;
    }

    @Override
    public String toString() {
        return "Koleksi{" +
            "id='" + id + '\'' +
            ", judul='" + judul + '\'' +
            ", penerbit='" + penerbit + '\'' +
            ", tahunTerbit='" + tahunTerbit + '\'' +
            ", statusPinjam=" + statusPinjam +
            '}';
    }
}
