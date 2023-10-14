package backend;

public class Dosen extends Customer {

    private String nip;

    public Dosen(String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam, String noIdPeminjam, String nip) {
        super(nama, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam);
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
        return "Dosen{" +
                "nip='" + nip + '\'' +
                '}';
    }
}
