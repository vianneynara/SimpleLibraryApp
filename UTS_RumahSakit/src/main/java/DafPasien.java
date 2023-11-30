import java.util.ArrayList;
import java.util.HashSet;

// Import untuk interface yang digunakan
import java.util.List;
import java.util.Set;

/**
 * Kelas untuk menyimpan daftar pasien
 * */
public class DafPasien {

	List<Pasien> pasienList;
	Set<String> daftarNrm;

	/* Constructor utama */
	public DafPasien() {
		this.pasienList = new ArrayList<>();
		this.daftarNrm = new HashSet<>();
	}

	/**
	 * Melakukan insersi / pemasukkan data pasien baru dengan melakukan pengecekan menurut NRM
	 * */
	public boolean insertPasien(Pasien data) {
		// Mengecek jika terdapat duplikasi pada list pasien menurut NRM.
		if (daftarNrm.contains(data.nrm)) {
			return false;
		} else {
			daftarNrm.add(data.nrm);
			pasienList.add(data);
			return true;
		}
	}
}
