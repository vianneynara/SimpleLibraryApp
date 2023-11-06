import backend.Koleksi;
import backend.Peminjam;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataPerpus {

	private List<Peminjam> listPeminjam;
	private List<Koleksi> listKoleksi;

	public DataPerpus() {
		this.listPeminjam = new ArrayList<>();
		this.listKoleksi = new ArrayList<>();
	}

	/* Getters / Setters */

	public List<Peminjam> getListPeminjam() {
		return listPeminjam;
	}

	public void setListPeminjam(List<Peminjam> listPeminjam) {
		this.listPeminjam = listPeminjam;
	}

	public List<Koleksi> getListKoleksi() {
		return listKoleksi;
	}

	public void setListKoleksi(List<Koleksi> listKoleksi) {
		this.listKoleksi = listKoleksi;
	}

	/* Other Functions */

	public void isiDataPeminjam(Peminjam data) {
		try {
			listPeminjam.add(data);
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	public void isiDataKoleksi(Koleksi data) {
		try {
			listKoleksi.add(data);
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}
}
