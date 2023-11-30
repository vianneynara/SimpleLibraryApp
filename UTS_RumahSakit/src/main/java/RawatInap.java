import java.time.LocalDate;

public class RawatInap extends Pasien {

	String kamar;
	LocalDate tglMasuk;

	public RawatInap(String nrm, String nama, String alamat, String dokter, int tahunLahir, String kamar, LocalDate tglMasuk) {
		super(nrm, nama, alamat, dokter, tahunLahir);
		this.kamar = kamar;
		this.tglMasuk = tglMasuk;
	}

	@Override
	public String toString() {
		return "RawatInap{" +
			"kamar='" + kamar + '\'' +
			", tglMasuk=" + tglMasuk +
			"} " + super.toString();
	}
}
