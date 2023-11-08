package backend;

import java.io.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataIOHandler {
	String DB_DIRECTORY = "src/main/database/";
	/**
	 * Menyimpan dan melakukan overwrite data peminjam ke data_peminjam.dat .
	 * */
	public boolean saveDataPeminjam(HashMap<String, Peminjam> dataPeminjam) {
		try (FileOutputStream fout = new FileOutputStream(DB_DIRECTORY + "data_peminjam.dat");
			 ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(dataPeminjam);
		} catch (IOException e) {
			Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			return false;
		}
		return true;
	}

	/**
	 * Menyimpan dan melakukan overwrite data koleksi ke data_koleksi.dat .
	 * */
	public boolean saveDataKoleksi(HashMap<String, Koleksi> dataKoleksi) {
		try (FileOutputStream fout = new FileOutputStream(DB_DIRECTORY + "data_koleksi.dat");
			 ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(dataKoleksi);
		} catch (IOException e) {
			Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			return false;
		}
		return true;
	}

	/**
	 * Menyimpan dan melakukan overwrite data transaksi ke data_transaksi.dat .
	 * */
	public boolean saveDataTransaksi(HashMap<String, Transaksi> dataTransaksi) {
		try (FileOutputStream fout = new FileOutputStream(DB_DIRECTORY + "data_transaksi.dat");
			 ObjectOutputStream out = new ObjectOutputStream(fout))
		{
			out.writeObject(dataTransaksi);
		} catch (IOException e) {
			Logger.getLogger(DataIOHandler.class.getName()).log(Level.SEVERE, e.getMessage(), e);
			return false;
		}
		return true;
	}

	/**
	 * Membaca file data_peminjam.dat dan mengembalikan isinya.
	 * @return HashMap HashMap berisi data transaksi
	 * */
	@SuppressWarnings("unchecked")
	public HashMap<String, Transaksi> readDataPeminjam() {
		if (ensuredExists(DB_DIRECTORY + "data_peminjam.dat")) {
			try (FileInputStream fout = new FileInputStream(DB_DIRECTORY + "data_peminjam.dat");
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
	 * Membaca file data_koleksi.dat dan mengembalikan isinya.
	 * @return HashMap<String, Transaksi> HashMap berisi data koleksi
	 * */
	@SuppressWarnings("unchecked")
	public HashMap<String, Transaksi> readDataKoleksi() {
		if (ensuredExists(DB_DIRECTORY + "data_koleksi.dat")) {
			try (FileInputStream fout = new FileInputStream(DB_DIRECTORY + "data_koleksi.dat");
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
	 * Membaca file data_transaksi.dat dan mengembalikan isinya.
	 * @return HashMap<String, Transaksi> HashMap berisi data transaksi
	 * */
	@SuppressWarnings("unchecked")
	public HashMap<String, Transaksi> readDataTransaksi() {
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
	 * Memastikan bahwa file yang tertera sungguh ada dan terbuat.
	 * */
	private boolean ensuredExists(String filePath) {
		try {
			File file = new File(filePath);
			return file.exists() || file.createNewFile();
		} catch (IOException e) {
			return false;
		}
	}
}
