package backend;

public class Mahasiswa extends Peminjam {

    private String nim;

    public Mahasiswa(String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam, String noIdPeminjam, String nim) {
        super(nama, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Mahasiswa{" +
                "nim='" + nim + '\'' +
                '}';
    }
}
