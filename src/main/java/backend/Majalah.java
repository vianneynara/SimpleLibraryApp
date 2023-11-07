package backend;

public class Majalah extends Koleksi {
    /* atribut kelas */
    private String issn;
    private int volume;
    private int seri;

    /* constructor untuk memuat seluruh atribut kelas*/
    public Majalah(String id, String judul, String penerbit, String tahunTerbit, String issn, int volume, int seri) {
        super(id, judul, penerbit, tahunTerbit);
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
        return super.toString() + "-> Majalah{" +
            "issn='" + issn + '\'' +
            ", volume=" + volume +
            ", seri=" + seri +
            "} ";
    }
}
