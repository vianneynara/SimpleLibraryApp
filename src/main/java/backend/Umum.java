package backend;

public class Umum extends Peminjam {

    private String nik;

    public Umum(String id, String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam, String nik) {
        super(id, nama, jenisNoId, alamat, noTelp, maksPinjam);
        this.nik = nik;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Umum{" +
                "nik='" + nik + '\'' +
                '}';
    }
}
