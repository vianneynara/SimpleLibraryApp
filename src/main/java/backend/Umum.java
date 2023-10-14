package backend;

public class Umum extends Customer {

    private String nik;

    public Umum(String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam, String noIdPeminjam, String nik) {
        super(nama, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam);
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
        return "Umum{" +
                "nik='" + nik + '\'' +
                '}';
    }
}
