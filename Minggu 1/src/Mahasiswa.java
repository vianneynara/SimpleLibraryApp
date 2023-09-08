public class Mahasiswa {

    protected String nim;

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                '}';
    }
}
