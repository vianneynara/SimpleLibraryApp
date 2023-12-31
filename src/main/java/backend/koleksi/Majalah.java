package backend.koleksi;

public class Majalah extends Koleksi {
    /* atribut kelas */
    private String issn;
    private int volume;
    private int seri;

    /* constructor untuk memuat seluruh atribut kelas*/
    public Majalah(String idKoleksi, String judul, String penerbit, String tahunTerbit, String issn, int volume, int seri) {
        super(idKoleksi, judul, penerbit, tahunTerbit, false, "MAJALAH");
        this.issn = issn;
        this.volume = volume;
        this.seri = seri;
    }

    /* constructor untuk memuat status peminjaman juga */
        public Majalah(String idKoleksi, String judul, String penerbit, String tahunTerbit, boolean statusPinjam, String issn, int volume, int seri) {
        super(idKoleksi, judul, penerbit, tahunTerbit, statusPinjam, "MAJALAH");
        this.issn = issn;
        this.volume = volume;
        this.seri = seri;
    }

    /* getters and setters */
    
    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Majalah{" +
            "issn='" + issn + '\'' +
            ", volume=" + volume +
            ", seri=" + seri +
            "} ";
    }
}
