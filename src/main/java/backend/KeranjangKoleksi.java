package backend;

import backend.koleksi.Buku;
import backend.koleksi.Disk;
import backend.koleksi.Koleksi;
import backend.koleksi.Majalah;
import backend.peminjam.Peminjam;
import backend.transaksi.Transaksi;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

public class KeranjangKoleksi {
	
	private List<Koleksi> arrayKoleksi;
	
	/**
	 * Konstruktor tanpa parameter.
	 * */
	public KeranjangKoleksi() {
		this(new ArrayList<>());
	}
	
	/**
	 * Konstruktor dengan parameter.
	 * */
	public KeranjangKoleksi(List<Koleksi> arrayKoleksi) {
		this.arrayKoleksi = arrayKoleksi;
	}

	/**
	 * Mendapatkan array data koleksi untuk membuat tabel sesuai dengan kolom yang ada.
	 * */
	public DefaultTableModel getTableModel() {
		if (arrayKoleksi.isEmpty()) {
			return null;
		}
		Object[][] data = new Object[arrayKoleksi.size()][4];
		String[] columns = {"id", "title", "isbn/issn", "tipe"};
		for (int i = 0; i < arrayKoleksi.size(); i++) {
            final var currentRow = arrayKoleksi.get(i);
            data[i][0] = currentRow.getIdKoleksi();
            data[i][1] = currentRow.getJudul();
			data[i][2] = switch (currentRow.getTipe()) {
				case "BUKU" -> ((Buku) currentRow).getIsbn();
				case "MAJALAH" -> ((Majalah) currentRow).getIssn();
				default -> ((Disk) currentRow).getIsbn();
			};
			data[i][3] = currentRow.getTipe();
        }
		return new DefaultTableModel(data, columns) {
			@Override
			public boolean isCellEditable(int rowIndex, int
				colIndex) {
				return false;
			}
		};
	}

	/**
	 * Menambahkan koleksi ke keranjang.
	 * */
	public boolean addKoleksi(Koleksi koleksi) {
		// Mengecek apabila sudah terdapat koleksi di keranjang.
		if (contains(koleksi)) {
			return false;
		}
		arrayKoleksi.add(koleksi);
		return true;
	}

	/**
	 * Mengecek apabila sudah terdapat koleksi {@code koleksi} di keranjang.
	 * */
	public boolean contains(Koleksi koleksi) {
		return arrayKoleksi.contains(koleksi);
	}

	/**
	 * Mendapatkan list id koleksi yang ada di keranjang dipisah dengan koma.
	 * */
	public String getStringListIdKoleksi() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arrayKoleksi.size(); i++) {
			sb.append(arrayKoleksi.get(i).getIdKoleksi());
			if (i != arrayKoleksi.size() - 1) {
				sb.append(",");
			}
		}
		return sb.toString();
	}

	/* Other functions */

	/**
	 * Membersihkan keseluruhan koleksi yang ada di keranjang.
	 * */
	public void reset() {
		arrayKoleksi.clear();
	}

	public int size() {
		return arrayKoleksi.size();
	}

	public List<Koleksi> getArrayKoleksi() {
		return arrayKoleksi;
	}
}
