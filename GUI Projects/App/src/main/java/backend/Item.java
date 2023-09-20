package backend;

/** Kelas abstrak yang mengimplementasi koleksi sebagai penyimpan atribut-atribut utama Koleksi. */
public abstract class Item implements Koleksi {
    /* class attributes */
    private String id;
    private String judul;
    private String penerbit;
    private String tahunTerbit;

    /* constructor for each class attribute */
    protected Item(String id, String judul, String penerbit, String tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
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
}
