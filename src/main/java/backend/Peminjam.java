package backend;

import java.io.Serializable;

/**
 * Kelas ini akan menyimpan data diri yang dimiliki seorang customer / peminjam.
 * */
public abstract class Peminjam implements Serializable {

	protected String id;
	protected String nama;
	protected String jenisNoId;
	protected String alamat;
	protected String noTelp;
	protected int maksPinjam;

	public Peminjam(String id, String nama, String jenisNoId, String alamat, String noTelp, int maksPinjam) {
		this.id = id;
		this.nama = nama;
		this.jenisNoId = jenisNoId;
		this.alamat = alamat;
		this.noTelp = noTelp;
		this.maksPinjam = maksPinjam;
	}

	// Getters setters

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Peminjam{" +
			"id='" + id + '\'' +
			", nama='" + nama + '\'' +
			", jenisNoId='" + jenisNoId + '\'' +
			", alamat='" + alamat + '\'' +
			", noTelp='" + noTelp + '\'' +
			", maksPinjam=" + maksPinjam +
			'}';
	}
}
