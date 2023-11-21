package backend;

public class Disk extends Koleksi {
    /* atribut kelas */
    private String isbn;
    private String format;

    /* constructor untuk setiap atribut kelas */
    public Disk(String idKoleksi, String judul, String penerbit, String tahunTerbit, String isbn, String format) {
        super(idKoleksi, judul, penerbit, tahunTerbit, false, "DISK");
        this.isbn = isbn;
        /* mengecek format */
        this.format = switch (format) {
            case "audio" -> "audio";
            case "tutorial" -> "tutorial";
            default -> "multimedia";
        };
    }

    /* getter and setters */

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + "->Disk{" +
            "isbn='" + isbn + '\'' +
            ", format='" + format + '\'' +
            "} ";
    }
}
