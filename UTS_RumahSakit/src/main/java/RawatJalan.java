public class RawatJalan extends Pasien {

	String jadwal;
	String tindakan;

	public RawatJalan(String nrm, String nama, String alamat, String dokter, int tahunLahir, String jadwal, String tindakan) {
		super(nrm, nama, alamat, dokter, tahunLahir);
		this.jadwal = jadwal;
		this.tindakan = tindakan;
	}

	@Override
	public String toString() {
		return "RawatJalan{" +
			"jadwal='" + jadwal + '\'' +
			", tindakan='" + tindakan + '\'' +
			"} " + super.toString();
	}
}
