package backend;

import backend.koleksi.Buku;
import backend.koleksi.Disk;
import backend.koleksi.Koleksi;
import backend.koleksi.Majalah;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Kelas yang merepresentasikan keranjang koleksi yang dipinjam. Kelas ini akan menyimpan koleksi yang akan dipinjam
 * oleh peminjam. Metode yang terdapat pada kelas ini adalah:
 * <ul>
 *     <li>{@link #getTableModel()}</li>
 *     <li>{@link #addKoleksi(Koleksi)}</li>
 *     <li>{@link #contains(Koleksi)}</li>
 *     <li>{@link #getPreparedKoleksiArray()}</li>
 *     <li>{@link #reset()}</li>
 *     <li>{@link #size()}</li>
 *     <li>{@link #isEmpty()}</li>
 *     <li>{@link #getArrayKoleksi()}</li>
 * </ul>
 * */
public class KeranjangKoleksi {
	
	private final List<Koleksi> arrayKoleksi;
	
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
	 * Mendapatkan {@link DefaultTableModel} koleksi untuk membuat tabel sesuai dengan kolom yang ada.
	 *
	 * @return {@link DefaultTableModel} yang berisi data koleksi yang ada di keranjang.
	 * */
	public DefaultTableModel getTableModel() {
		// Mengecek apabila tidak ada koleksi di keranjang. Mengembalikan tabel kosong
		if (arrayKoleksi.isEmpty()) {
			return new DefaultTableModel(
                new Object[][]{},
                new String[]{"id", "title", "isbn/issn", "tipe"}
            );
		}

		// Membuat tabel dengan data koleksi yang ada di keranjang
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
	 *
	 * @param koleksi Koleksi yang akan ditambahkan ke keranjang.
	 * @return boolean true atau false
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
	 *
	 * @param koleksi Koleksi yang akan dicek.
	 * @return boolean true atau false
	 * */
	public boolean contains(Koleksi koleksi) {
		return arrayKoleksi.contains(koleksi);
	}

	/**
	 * Melakukan pengembalian array koleksi yang ada di keranjang. Metode ini akan mengubah status koleksi yang ada
	 * di keranjang menjadi dipinjam.
	 * */
	public Koleksi[] getPreparedKoleksiArray() {
		for (Koleksi koleksi : arrayKoleksi) {
			koleksi.setDipinjam();
			DatabaseHandler.setKoleksiDipinjam(koleksi.getIdKoleksi());
		}
		return arrayKoleksi.toArray(new Koleksi[0]);
	}

	/* Other functions */

	/**
	 * Membersihkan keseluruhan koleksi yang ada di keranjang.
	 * */
	public void reset() {
		arrayKoleksi.clear();
	}

	/**
	 * Mendapatkan jumlah koleksi yang ada di array koleksi keranjang.
	 * */
	public int size() {
		return arrayKoleksi.size();
	}

	/**
	 * Mengembalikan apakah keranjang kosong atau tidak.
	 * */
	public boolean isEmpty() {
		return arrayKoleksi.isEmpty();
	}

	/**
	 * Mendapatkan array koleksi yang ada di keranjang.
	 * */
	public List<Koleksi> getArrayKoleksi() {
		return arrayKoleksi;
	}
}
