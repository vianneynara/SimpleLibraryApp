public class Mahasiswa {

    protected String nim;                                   // atribut kelas

    public Mahasiswa(String nim) {                          // constrcutor utama
        this.nim = nim;                                     // menginisialisasi nilai nim
    }

    @Override
    public String toString() {                              // konverter menjadi bentuk String dari objek
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                '}';
    }
}
