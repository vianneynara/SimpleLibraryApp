package backend;

import java.sql.*;
import java.util.HashMap;
import java.util.List;

public class DatabaseHandler {
	/* Database Accessor Credentials */
	private static final String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "pbol";
	private static final String PASSWORD = "pbol";

	/**
	 * Wrapper connector dengan credentials yang sudah ada.
	 *
	 * @throws SQLException error ?
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
	}

	/**
	 * Metode yang mengembalikan status boolean apakah bisa terkoneksi dengan database.
	 * */
	public static boolean canConnectToDatabase() {
		try {
			getConnection();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	/**
	 * Membaca keseluruhan isi dari tabel Peminjam dan mengembalikkannya dalam bentuk hash map.
	 * @return {@link HashMap} berisi data peminjam dengan id_peminjam sebagai key dan objek {@link Peminjam}
	 * sebagai value.
	 */
	public static HashMap<String, Peminjam> readDataPeminjam() {
		try (Connection conn = getConnection()) {
			HashMap<String, Peminjam> dataPeminjam = new HashMap<>();
			/* Memilih kolom atribut yang tertera dari tabel "Peminjam" */
			String query = "SELECT * FROM \"Peminjam\"";

			// Try with resource disini beguna untuk menyiapkan query statement yang akan dijalankan menggunakan
			// Prepared Statement. Disiapkan dengan koneksi yang sudah terhubung `conn`, dengan query yang sebelumnya
			// sudah ditulis.
			// Result Set adalah hasil pengembalian dari ekseksui prepared statement sebelumnya.
			try (PreparedStatement ps = conn.prepareStatement(query);
				 ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {							// Selama masih ada nilai untuk setelahnya
					/* Mengambil atribut pada tabel dan menyimpannya ke variabel sementara */
					String id_peminjam 		= rs.getString("id_peminjam");
					String nama_lengkap 	= rs.getString("nama_lengkap");
					String jenis_no_id 		= rs.getString("jenis_no_id").toUpperCase();
					String alamat 			= rs.getString("alamat");
					String nomor_telepon 	= rs.getString("nomor_telepon");
					int maks_pinjam 		= rs.getInt("maks_pinjam");
					String nomor_identitas 	= rs.getString("nomor_identitas");

					Peminjam peminjam;
					/* Membuat objek inheritor Peminjam sesuai dengan jenis_no_id */
					if (jenis_no_id.equalsIgnoreCase("NIM")) {
						peminjam = new Mahasiswa(id_peminjam, nama_lengkap, jenis_no_id, alamat, nomor_telepon, maks_pinjam, nomor_identitas);
					} else if (jenis_no_id.equalsIgnoreCase("NIP")) {
						peminjam = new Dosen(id_peminjam, nama_lengkap, jenis_no_id, alamat, nomor_telepon, maks_pinjam, nomor_identitas);
					} else {
						peminjam = new Umum(id_peminjam, nama_lengkap, jenis_no_id, alamat, nomor_telepon, maks_pinjam, nomor_identitas);
					}

					dataPeminjam.put(id_peminjam, peminjam);// Memasukkan id_peminjam dan objek peminjam ke hash map
				}
			}
			return dataPeminjam;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Membaca keseluruhan isi dari tabel Koleksi dan mengembalikkannya dalam bentuk hash map.
	 * @return {@link HashMap} berisi data koleksi dengan id_koleksi sebagai key dan objek {@link Koleksi}
	 * sebagai value.
	 */
	public static HashMap<String, Koleksi> readDataKoleksi() {
		try (Connection conn = getConnection()) {
			HashMap<String, Koleksi> dataKoleksi = new HashMap<>();
			/* Memilih kolom atribut yang tertera dari tabel "Peminjam" */
			String query = "SELECT * FROM \"Koleksi\"";

			try (PreparedStatement ps = conn.prepareStatement(query);
				 ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {							// Selama masih ada nilai untuk setelahnya
					/* Mengambil atribut pada tabel dan menyimpannya ke variabel sementara */
					String id_koleksi 		= rs.getString("id_koleksi");
					String judul 			= rs.getString("judul");
					String penerbit 		= rs.getString("penerbit");
					String tahunTerbit		= rs.getString("tahun_terbit");
//					int status_pinjam  		= rs.getInt("status_pinjam");
					String tipe 			= rs.getString("tipe");
					String isbn_issn		= rs.getString("isbn_issn");

					Koleksi koleksi;
					/* Membuat objek inheritor Peminjam sesuai dengan tipe */
					switch (tipe) {
						case "BUKU" -> {
							koleksi = new Buku(id_koleksi, judul, penerbit, tahunTerbit, isbn_issn,
								rs.getInt("jumlah_halaman"));
						}
						case "MAJALAH" -> {
							koleksi = new Majalah(id_koleksi, judul, penerbit, tahunTerbit, isbn_issn,
								rs.getInt("volume"), rs.getInt("seri"));
						}
						default -> {
							koleksi = new Disk(id_koleksi, judul, penerbit, tahunTerbit, isbn_issn,
								rs.getString("format"));
						}
					}
					dataKoleksi.put(id_koleksi, koleksi);// Memasukkan id_koleksi dan objek peminjam ke hash map
				}
			}
			return dataKoleksi;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Memasukkan data bertipe {@link Peminjam} dan memasukkan atribut-atribut objeknya menjadi atribut record dalam
	 * database.
	 * */
	public static void insertDataPeminjam(Peminjam data) {
		String query =
			/* Memasukkan ke dalam Peminjam pada kolom (yang tertera) dengan values (sesuai dengan jumlah kolom)*/
			"INSERT INTO " +
				"\"Peminjam\" (id_peminjam, nama_lengkap, jenis_no_id, alamat, nomor_telepon, maks_pinjam, nomor_identitas) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(query)) {
			/* Melakukan pengisian template prepared statement dengan data yang relevan */
			ps.setString(1, data.getIdPeminjam());
			ps.setString(2, data.getNama());
			ps.setString(3, data.getJenisNoId());
			ps.setString(4, data.getAlamat());
			ps.setString(5, data.getNoTelp());
			ps.setInt	(6, data.getMaksPinjam());

			if (data instanceof Mahasiswa m) {
				ps.setString(7, m.getNim());
			} else if (data instanceof Dosen d) {
				ps.setString(7, d.getNip());
			} else {
				ps.setString(7, ((Umum) data).getNik());
			}

			ps.executeUpdate();									// Melakukan update menggunakan prepared statement
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Memasukkan data bertipe {@link Koleksi} dan memasukkan atribut-atribut objeknya menjadi atribut record dalam
	 * database.
	 * */
	public static void inserDataKoleksi(Koleksi data) {
		String query =
			/* Memasukkan ke dalam Peminjam pada kolom (yang tertera) dengan values (sesuai dengan jumlah kolom)*/
			"INSERT INTO " +
				"\"Koleksi\" (id_koleksi, judul, penerbit, tahun_terbit, status_pinjam, tipe, isbn_issn, jumlah_halaman, volume, seri, format) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(query)) {
			/* Melakukan pengisian template prepared statement dengan data yang relevan */
			ps.setString(1, data.getIdKoleksi());
			ps.setString(2, data.getJudul());
			ps.setString(3, data.getPenerbit());
			ps.setString(4, data.tahunTerbit);
			ps.setInt	(5, data.statusPinjam ? 1 : 0);
			ps.setString(6, data.getTipe());

			/* Handling values yang mungkin kosong sesuai tipenya */
			ps.setInt(8, 0);
			ps.setInt(9, 0);
			ps.setInt(10, 0);
			ps.setString(11, null);

			if (data instanceof Buku b) {
				ps.setString(7, b.getIsbn());
				ps.setInt(8, b.getJumlahHalaman());
			} else if (data instanceof Majalah m) {
				ps.setString(7, m.getIssn());
				ps.setInt(9, m.getVolume());
				ps.setInt(10, m.getSeri());
			} else {
				ps.setString(7, ((Disk) data).getIsbn());
				ps.setString(11, ((Disk) data).getFormat());
			}

			ps.executeUpdate();									// Melakukan update menggunakan prepared statement
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public static void printTest() {
		HashMap<String, Peminjam> dataPeminjam = readDataPeminjam();
		var arr = List.copyOf(dataPeminjam.values());

		for (Peminjam p : arr) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		printTest();
	}
}
