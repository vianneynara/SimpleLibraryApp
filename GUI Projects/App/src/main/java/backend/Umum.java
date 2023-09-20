package backend;

public class Umum {

    protected String nik;                               // atribut kelas

    public Umum(String nik) {                           // constructor yang menerima String
        this.nik = nik;                                 // menginisialisai nilai nik kelas
    }

    @Override
    public String toString() {                          // metode konverter isi menjadi bentuk String
        return "Umum{" +
                "nik='" + nik + '\'' +
                '}';
    }
}
