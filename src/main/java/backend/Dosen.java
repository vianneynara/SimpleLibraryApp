package backend;

public class Dosen extends Peminjam {

    private String nip;

    public Dosen(String id, String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam, String nip) {
        super(id, nama, jenisNoId, alamat, noTelp, maksPinjam);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Dosen{" +
                "nip='" + nip + '\'' +
                '}';
    }
}
