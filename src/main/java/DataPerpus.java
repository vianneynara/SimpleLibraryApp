import backend.Koleksi;
import backend.Peminjam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataPerpus {

	private List<Peminjam> listPeminjam;
	private List<Koleksi> listKoleksi;

	private ObjectInputStream peminjamInObjectStream;
	private AppendableObjectOutputStream peminjamOutObjectStream;
	private ObjectInputStream koleksiInObjectStream;
	private AppendableObjectOutputStream koleksiOutObjectStream;

	public DataPerpus() {
		this.listPeminjam = new ArrayList<>();
		this.listKoleksi = new ArrayList<>();

		initializePeminjam();
		initializeKoleksi();
	}

	/* Getters / Setters */

	public List<Peminjam> getListPeminjam() {
		return listPeminjam;
	}

	public void setListPeminjam(List<Peminjam> listPeminjam) {
		this.listPeminjam = listPeminjam;
	}

	/* Other Functions */

	private void initializePeminjam() {
		File pinjamFile = new File("peminjam.txt");

		try {
			boolean append = pinjamFile.exists();

			/* Membuat file dat jika belum ada */
			if (!append) {
				pinjamFile.createNewFile();
				append = pinjamFile.exists();
			}

			FileOutputStream fileOutputStream = new FileOutputStream(pinjamFile, append);
			peminjamOutObjectStream = new AppendableObjectOutputStream(fileOutputStream, append);

			FileInputStream inFileStream = new FileInputStream(pinjamFile);
			peminjamInObjectStream = new ObjectInputStream(inFileStream);

			while (true) {
				try {
					listPeminjam.add((Peminjam) peminjamInObjectStream.readObject());
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException | ClassNotFoundException exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, exception.getMessage(), exception);
		} finally {
			try {
				if (peminjamInObjectStream != null) {
					peminjamInObjectStream.close();
				}
			} catch (IOException ioException) {
				Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, ioException.getMessage(), ioException);
			}
		}
	}

	private void initializeKoleksi() {
		File koleksiFile = new File("koleksi.txt");

		try {
			boolean append = koleksiFile.exists();

			/* Membuat file dat jika belum ada */
			if (!append) {
				koleksiFile.createNewFile();
				append = koleksiFile.exists();
			}

			FileOutputStream fileOutputStream = new FileOutputStream(koleksiFile, append);
			koleksiOutObjectStream = new AppendableObjectOutputStream(fileOutputStream, append);

			FileInputStream inFileStream = new FileInputStream(koleksiFile);
			koleksiInObjectStream = new ObjectInputStream(inFileStream);

			while (true) {
				try {
					listPeminjam.add((Peminjam) koleksiInObjectStream.readObject());
				} catch (EOFException e) {
					break;
				}
			}
		} catch (IOException | ClassNotFoundException exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, exception.getMessage(), exception);
		} finally {
			try {
				if (koleksiInObjectStream != null) {
					koleksiInObjectStream.close();
				}
			} catch (IOException ioException) {
				Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, ioException.getMessage(), ioException);
			}
		}
	}

	public void isiDataPeminjam(Peminjam data) {
		try {
			listPeminjam.add(data);
			System.out.println(data.getNama());
			peminjamOutObjectStream.writeObject(data);
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	public void isiDataKoleksi(Koleksi data) {
		try {
			listKoleksi.add(data);
			System.out.println(data.getJudul());
			koleksiOutObjectStream.writeObject(data);
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}
}
