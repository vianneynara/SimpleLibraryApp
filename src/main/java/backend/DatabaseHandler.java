package backend;

import java.sql.*;
import java.util.HashMap;

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
	 * Metode yang mengembalikan status boolean koneksi dengan database.
	 * */
	public static boolean isConnectedToDatabase() {
		try {
			getConnection();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}

	/**
	 * Membaca keseluruhan isi dari tabel Peminjam dan mengembalikkannya dalam bentuk hash map.
	 *
	 * @return {@link HashMap} berisi data peminjam dengan id_peminjam sebagai key dan objek {@link Peminjam}
	 * sebagai value.
	 */
	public static HashMap<String, Peminjam> readDataPeminjam() {
		try (Connection conn = getConnection()) {
			HashMap<String, Peminjam> dataPeminjam = new HashMap<>();
			String query =
				"SELECT id_peminjam, nama_lengkap, jenis_np_id, alamat, nomor_telepon, maks_pinjam, nomor_identitas FROM Peminjam";

			try (PreparedStatement ps = conn.prepareStatement(query);
				 ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					/* Mengambil atribut pada tabel dan menyimpannya ke variabel sementara */
					String id_peminjam 		= rs.getString("id_peminjam");
					String nama_lengkap 	= rs.getString("nama_lengkap");
					String jenis_no_id 		= rs.getString("jenis_np_id").toUpperCase();
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

					dataPeminjam.put(id_peminjam, peminjam);    // Memasukkan id_peminjam dan objek peminjam ke hash Map
				}
			}
			return dataPeminjam;
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
			"INSERT INTO " +
				"Peminjam (id_peminjam, nama_lengkap, jenis_np_id, alamat, nomor_telepon, maks_pinjam, nomor_identitas) " +
				"VALUES (?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection();
			 PreparedStatement ps = conn.prepareStatement(query)) {
			/* Melakukan pengisian prepared statement dengan data yang relevan */
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
}
