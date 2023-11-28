package archived;

import backend.*;
import backend.koleksi.Koleksi;
import backend.peminjam.Peminjam;

import java.io.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Kelas ini digunakan untuk melakukan handling input output stream terkhusus untuk proyek ini. Metode ini berisi metode
 * static yang dapat diakses untuk memudahkan handling. Kelas ini melakukan handling {@link HashMap} yang berisi
 * {@link String} dan {@link Peminjam} | {@link Koleksi} | {@link Transaksi}. Selain melakukan penyimpanan ke bentuk
 * stream (kemudian ke file), terdapat juga metode untuk mengecek serta membaca dari file yang menyimpan data perpustakaan.
 *
 * */
public class DataIOHandler {
	/**
	 * Alamat penyimpanan dari project source, digunakan untuk memberikan tambahan lokasi tempat menyimpan data.
	 * */
	private static final String DB_DIRECTORY = "src/main/database/";
	/**
	 * Menyimpan dan melakukan overwrite data peminjam ke data_peminjam.dat .
	 * */
	public static boolean saveDataPeminjam(HashMap<String, Peminjam> dataPeminjam) {
		try (FileOutputStream fout = new FileOutputStream(DB_DIRECTORY + "data_peminjam.dat");
			 ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(dataPeminjam);
			return true;
		} catch (IOException e) {
			Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			return false;
		}
	}

	/**
	 * Menyimpan dan melakukan overwrite data koleksi ke data_koleksi.dat .
	 * */
	public static boolean saveDataKoleksi(HashMap<String, Koleksi> dataKoleksi) {
		try (FileOutputStream fout = new FileOutputStream(DB_DIRECTORY + "data_koleksi.dat");
			 ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(dataKoleksi);
			return true;
		} catch (IOException e) {
			Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			return false;
		}
	}

	/**
	 * Menyimpan dan melakukan overwrite data transaksi ke data_transaksi.dat .
	 * */
	public static boolean saveDataTransaksi(HashMap<String, Transaksi> dataTransaksi) {
		try (FileOutputStream fout = new FileOutputStream(DB_DIRECTORY + "data_transaksi.dat");
			 ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(dataTransaksi);
			return true;
		} catch (IOException e) {
			Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			return false;
		}
	}

	/**
	 * Membaca file data_peminjam.dat dan mengembalikan isinya.
	 * @return HashMap HashMap berisi data transaksi
	 * */
	@SuppressWarnings("unchecked")
	public static HashMap<String, Peminjam> readAllDataPeminjam() {
		if (ensuredExists(DB_DIRECTORY + "data_peminjam.dat")) {
			try (FileInputStream fout = new FileInputStream(DB_DIRECTORY + "data_peminjam.dat");
				 ObjectInputStream in = new ObjectInputStream(fout)) {
				return (HashMap<String, Peminjam>) in.readObject();
			} catch (IOException | ClassNotFoundException e) {
				Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Membaca file data_koleksi.dat dan mengembalikan isinya.
	 * @return HashMap<String, Transaksi> HashMap berisi data koleksi
	 * */
	@SuppressWarnings("unchecked")
	public static HashMap<String, Koleksi> readAllDataKoleksi() {
		if (ensuredExists(DB_DIRECTORY + "data_koleksi.dat")) {
			try (FileInputStream fout = new FileInputStream(DB_DIRECTORY + "data_koleksi.dat");
				 ObjectInputStream in = new ObjectInputStream(fout)) {
				return (HashMap<String, Koleksi>) in.readObject();
			} catch (IOException | ClassNotFoundException e) {
				Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * Membaca file data_transaksi.dat dan mengembalikan isinya.
	 * @return HashMap<String, Transaksi> HashMap berisi data transaksi
	 * */
	@SuppressWarnings("unchecked")
	public static HashMap<String, Transaksi> readDataTransaksi() {
		if (ensuredExists(DB_DIRECTORY + "data_transaksi.dat")) {
			try (FileInputStream fout = new FileInputStream(DB_DIRECTORY + "data_transaksi.dat");
				 ObjectInputStream in = new ObjectInputStream(fout)) {
				return (HashMap<String, Transaksi>) in.readObject();
			} catch (IOException | ClassNotFoundException e) {
				Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
				return null;
			}
		} else {
			return null;
		}
	}
	
	/**
	 * Memastikan bahwa file yang tertera sungguh ada dan terbuat. Jika sebuah file tidak ada, maka langsung dibuat.
	 * @return true if file exists, or was successfully made when non-existent. False if there's an error
	 * */
	private static boolean ensuredExists(String filePath) {
		try {
			File file = new File(filePath);
			return file.exists() || file.createNewFile();
		} catch (IOException e) {
			return false;
		}
	}
	
	/* Pengecek apakah file data ada atau tidak */
	
	public static boolean fileDataPeminjamExists() {
		return (new File(DB_DIRECTORY + "data_peminjam.dat")).exists();
	}
	
	public static boolean fileDataKoleksiExists() {
		return (new File(DB_DIRECTORY + "data_koleksi.dat")).exists();
	}
	
	public static boolean fileDataTransaksiExists() {
		return (new File(DB_DIRECTORY + "data_transaksi.dat")).exists();
	}
}
