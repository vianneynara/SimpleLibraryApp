public abstract class Pasien {

	String nrm;
	String nama;
	String alamat;
	String dokter;
	int tahunLahir;

	public Pasien(String nrm, String nama, String alamat, String dokter, int tahunLahir) {
		this.nrm = nrm;
		this.nama = nama;
		this.alamat = alamat;
		this.dokter = dokter;
		this.tahunLahir = tahunLahir;
	}

	@Override
	public String toString() {
		return "Pasien{" +
			"nrm='" + nrm + '\'' +
			", nama='" + nama + '\'' +
			", alamat='" + alamat + '\'' +
			", dokter='" + dokter + '\'' +
			", tahunLahir=" + tahunLahir +
			'}';
	}
}
