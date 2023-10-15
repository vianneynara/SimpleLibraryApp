package backend;

/**
 * Kelas ini akan menyimpan data diri yang dimiliki seorang customer / peminjam.
 * */
public abstract class Peminjam {

	protected String nama;
	protected String jenisNoId;
	protected String alamat;
	protected String noTelp;
	protected int maksPinjam;

	// Unique identifier for each customers
	private String noIdPeminjam;

	public Peminjam(String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam, String noIdPeminjam) {
		this.nama = nama;
		this.jenisNoId = jenisNoId;
		this.alamat = alamat;
		this.noTelp = noTelp;
		this.maksPinjam = maksPinjam;
		this.noIdPeminjam = noIdPeminjam;
	}

	// Getters setters

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisNoId() {
		return jenisNoId;
	}

	public void setJenisNoId(String jenisNoId) {
		this.jenisNoId = jenisNoId;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}

	public int getMaksPinjam() {
		return maksPinjam;
	}

	public void setMaksPinjam(int maksPinjam) {
		this.maksPinjam = maksPinjam;
	}

	public String getNoIdPeminjam() {
		return noIdPeminjam;
	}

	public void setNoIdPeminjam(String noIdPeminjam) {
		this.noIdPeminjam = noIdPeminjam;
	}

	@Override
	public String toString() {
		return "Customer{" +
			"nama='" + nama + '\'' +
			", jenisNoId='" + jenisNoId + '\'' +
			", alamat='" + alamat + '\'' +
			", noTelp='" + noTelp + '\'' +
			", maksPinjam=" + maksPinjam +
			", noIdPeminjam='" + noIdPeminjam + '\'' +
			'}';
	}
}
