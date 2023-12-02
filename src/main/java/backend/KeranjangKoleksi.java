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
		// Mengecek apabila tidak ada koleksi di keranjang. Mengembalikan tabel kosong
		if (arrayKoleksi.isEmpty()) {
			return new DefaultTableModel(
                new Object[][]{},
                new String[]{"id", "title", "isbn/issn", "tipe"}
            );
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

	public boolean isEmpty() {
		return arrayKoleksi.isEmpty();
	}

	public List<Koleksi> getArrayKoleksi() {
		return arrayKoleksi;
	}
}
