package archived;

import backend.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CheckDB {

	public static void printAllTables() {
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "pbol";
		String password = "pbol";

		try (Connection connection = DriverManager.getConnection(jdbcUrl, user, password)) {
			DatabaseMetaData metaData = connection.getMetaData();
			ResultSet resultSet = metaData.getTables(null, null, "%", new String[]{"TABLE"});

			System.out.println("Tables in the database:");

			while (resultSet.next()) {
				String tableName = resultSet.getString("TABLE_NAME");
				if (tableName.equalsIgnoreCase("Peminjam"))
					System.out.println("Found " + tableName);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void printTest() {
		HashMap<String, Peminjam> dataPeminjam = readDataPeminjam();
		var arr = List.copyOf(dataPeminjam.values());

		for (Peminjam p : arr) {
			System.out.println(p);
		}

	}

	/**
	 * Membaca keseluruhan isi dari tabel Peminjam dan mengembalikkannya dalam bentuk hash map.
	 * @return {@link HashMap} berisi data peminjam dengan id_peminjam sebagai key dan objek {@link Peminjam}
	 * sebagai value.
	 */
	public static HashMap<String, Peminjam> readDataPeminjam() {
		try (Connection conn = DatabaseHandler.getConnection()) {
			HashMap<String, Peminjam> dataPeminjam = new HashMap<>();
			String query =
				"SELECT id_peminjam, nama_lengkap, jenis_no_id, alamat, nomor_telepon, maks_pinjam, nomor_identitas FROM \"Peminjam\"";

			try (PreparedStatement ps = conn.prepareStatement(query);
				 ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					/* Mengambil atribut pada tabel dan menyimpannya ke variabel sementara */
					String id_peminjam = rs.getString("id_peminjam");
					String nama_lengkap = rs.getString("nama_lengkap");
					String jenis_no_id = rs.getString("jenis_no_id").toUpperCase();
					String alamat = rs.getString("alamat");
					String nomor_telepon = rs.getString("nomor_telepon");
					int maks_pinjam = rs.getInt("maks_pinjam");
					String nomor_identitas = rs.getString("nomor_identitas");

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

	public static void main(String[] args) {
		printTest();
//		printAllTables();
	}
}
