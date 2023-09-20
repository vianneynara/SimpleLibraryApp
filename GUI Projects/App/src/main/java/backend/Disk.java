package backend;

public class Disk extends Item {
    /* atribut kelas */
    private String isbn;
    private String format;

    /* constructor untuk setiap atribut kelas */
    public Disk(String id, String judul, String penerbit, String tahunTerbit, String isbn, String format) {
        super(id, judul, penerbit, tahunTerbit);
        this.isbn = isbn;
        /* mengecek format */
        this.format = switch (format) {
            case "audio" -> "audio";
            case "tutorial" -> "tutorial";
            default -> "multimedia";
        };
    }

    /* getter and setters */

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
