package backend.peminjam;

public class Mahasiswa extends Peminjam {

    private String nim;

    public Mahasiswa(String id, String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam, String nim) {
        super(id, nama, jenisNoId, alamat, noTelp, maksPinjam);
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
