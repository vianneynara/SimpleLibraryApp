public class Dosen {

    protected String nip;                                   // atribut kelas

    public Dosen(String nip) {                              // constructor yang menerima String
        this.nip = nip;                                     // menginisialisai nilai nip kelas
    }

    @Override
    public String toString() {                              // metode konverter isi menjadi bentuk String
        return "Dosen{" +
                "nip='" + nip + '\'' +
                '}';
    }
}
