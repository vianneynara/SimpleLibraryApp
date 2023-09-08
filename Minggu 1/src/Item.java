public abstract class Item implements Koleksi {
    private String id;
    private String judul;
    private String penerbit;
    private String tahunTerbit;

    protected Item(String id, String judul, String penerbit, String tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
}

class Disk extends Item {

    private String isbn;
    private String format;

    public Disk(String id, String judul, String penerbit, String tahunTerbit, String isbn, String format) {
        super(id, judul, penerbit, tahunTerbit);
        this.isbn = isbn;
        this.format = switch (format) {
            case "audio" -> "audio";
            case "tutorial" -> "tutorial";
            default -> "multimedia";
        };
    }

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

class Buku extends Item {

    private String isbn;
    private int jumlahHalaman;

    public Buku(String id, String judul, String penerbit, String tahunTerbit, String isbn, int jumlahHalaman) {
        super(id, judul, penerbit, tahunTerbit);
        this.isbn = isbn;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }
}

class Majalah extends Item {

    private String issn;
    private int volume;
    private int seri;

    public Majalah(String id, String judul, String penerbit, String tahunTerbit, String issn, int volume, int seri) {
        super(id, judul, penerbit, tahunTerbit);
        this.issn = issn;
        this.volume = volume;
        this.seri = seri;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }
}
