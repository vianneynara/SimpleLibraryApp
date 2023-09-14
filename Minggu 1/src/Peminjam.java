public class Peminjam {
    /* atribut kelas */
    private String idPeminjam;
    private String nama;
    private String alamat;
    private int maksPinjam;

    /* constructor utama */
    public Peminjam(String idPeminjam, String nama, String alamat, int maksPinjam) {
        this.idPeminjam = idPeminjam;
        this.nama = nama;
        this.alamat = alamat;
        this.maksPinjam = maksPinjam;
    }

    /* getters and setters */

    public String getIdPeminjam() {
        return idPeminjam;
    }

    public void setIdPeminjam(String idPeminjam) {
        this.idPeminjam = idPeminjam;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getMaksPinjam() {
        return maksPinjam;
    }

    public void setMaksPinjam(int maksPinjam) {
        this.maksPinjam = maksPinjam;
    }
}
