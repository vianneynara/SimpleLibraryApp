package backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class DataPerpus {

	private static final int ID_SUFFIX_LENGTH = 5;

	/* Disimpan menggunakna hash map sehingga idnya selalu unik. */
	private HashMap<String, Peminjam> dataPeminjam;
	private HashMap<String, Koleksi> dataKoleksi;
	private HashMap<String, Transaksi> dataTransaksi;

	/* Konstruktor utama */
	public DataPerpus() {
		this.dataPeminjam = (DataIOHandler.fileDataPeminjamExists() ? 
			DataIOHandler.readDataPeminjam() : 
			new HashMap<>());
		this.dataKoleksi = (DataIOHandler.fileDataKoleksiExists() ? 
			DataIOHandler.readDataKoleksi() :
			new HashMap<>());
		this.dataTransaksi = (DataIOHandler.fileDataTransaksiExists() ?
			DataIOHandler.readDataTransaksi() :
			new HashMap<>());
	}

	/* Getters / Setters */

	public HashMap<String, Peminjam> getDataPeminjam() {
		return dataPeminjam;
	}

	public void setDataPeminjam(HashMap<String, Peminjam> dataPeminjam) {
		this.dataPeminjam = dataPeminjam;
	}

	public HashMap<String, Koleksi> getDataKoleksi() {
		return dataKoleksi;
	}

	public void setDataKoleksi(HashMap<String, Koleksi> dataKoleksi) {
		this.dataKoleksi = dataKoleksi;
	}

	public HashMap<String, Transaksi> getDataTransaksi() {
		return dataTransaksi;
	}

	public void setDataTransaksi(HashMap<String, Transaksi> dataTransaksi) {
		this.dataTransaksi = dataTransaksi;
	}

	/**
	 * Menerima list yang terdiri atas {@link Peminjam} kemudian dikonversi menyesuaikan Map pada kelas ini. Hasil
	 * konversi akan masukkan sebagai nilai baru pada {@link #dataPeminjam}.
	 * */
	public void setListPeminjam(List<Peminjam> listPeminjam) {
		this.dataPeminjam =
			(HashMap<String, Peminjam>)
				listPeminjam.stream().collect(Collectors.toMap(Peminjam::getId, Function.identity()));
	}

	public List<Peminjam> getListPeminjam() {
		return new ArrayList<>(dataPeminjam.values());
	}

	/**
	 * Menerima list yang terdiri atas {@link Koleksi} kemudian dikonversi menyesuaikan Map pada kelas ini. Hasil
	 * konversi akan masukkan sebagai nilai baru pada {@link #dataKoleksi}.
	 * */
	public void setListKoleksi(List<Koleksi> listKoleksi) {
		this.dataKoleksi =
			(HashMap<String, Koleksi>)
				listKoleksi.stream().collect(Collectors.toMap(Koleksi::getId, Function.identity()));;
	}

	public List<Koleksi> getListKoleksi() {
		return new ArrayList<>(dataKoleksi.values());
	}

	/**
	 * Menerima list yang terdiri atas {@link Koleksi} kemudian dikonversi menyesuaikan Map pada kelas ini. Hasil
	 * konversi akan masukkan sebagai nilai baru pada {@link #dataKoleksi}.
	 * */
	public void setListTransaksi(List<Transaksi> listTransaksi) {
		this.dataTransaksi =
			(HashMap<String, Transaksi>)
				listTransaksi.stream().collect(Collectors.toMap(Transaksi::getId, Function.identity()));
	}

	public List<Transaksi> getListTransaksi() {
		return new ArrayList<>(dataTransaksi.values());
	}

	/* Other Functions */

	/**
	 * Menyimpan data peminjam ke file penyimpan.
	 * */
	public void isiDataPeminjam(Peminjam data) {
		try {
			dataPeminjam.put(data.getId(), data);
			DataIOHandler.saveDataPeminjam(dataPeminjam);
			SimpleUtil.log("Inserted a new Peminjam with id: " + data.getId());
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	/**
	 * Menyimpan data koleksi ke file penyimpan.
	 * */
	public void isiDataKoleksi(Koleksi data) {
		try {
			dataKoleksi.put(data.getId(), data);
			DataIOHandler.saveDataKoleksi(dataKoleksi);
			SimpleUtil.log("Inserted a new Koleksi with id: " + data.getId());
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	/**
	 * Menyimpan data transaksi ke file penyimpan.
	 * */
	public void isiDataTransaksi(Transaksi data) {
		try {
			dataTransaksi.put(data.getId(), data);
			DataIOHandler.saveDataTransaksi(dataTransaksi);
			SimpleUtil.log("Inserted a new Transaksi with id: " + data.getId());
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	/* Id generators */

    /**
     * Membuat id random dengan prefix dan format yang ditentukan.
     * */
    public static StringBuilder generateId(String prefix, int numDigits) {
        if (numDigits < 0) {
            throw new IllegalArgumentException("Number of digits should be non-negative.");
        }

        StringBuilder idBuilder = new StringBuilder(prefix);
        Random random = new Random();

        for (int i = 0; i < numDigits; i++) {
            int digit = random.nextInt(10);
            idBuilder.append(digit);
        }

        return idBuilder;
    }

	/**
     * Membuat id random dengan format yang ditentukan untuk objek Peminjam dari sebuah Map data Peminjam.
	 * @param tipe Tipe Peminjam.
	 * @param dataPeminjam HashMap data Peminjam.
	 * @throws IllegalArgumentException Dilempar saat tipe tidak sesuai dengan tipe Peminjam.
     * */
    public static String generatePeminjamId(String tipe, HashMap<String, Peminjam> dataPeminjam)
		throws IllegalArgumentException {
		String prefix;
		switch (tipe) {
			case "NIM" -> prefix = "M";
			case "NIP" -> prefix = "D";
			case "NIK" -> prefix = "U";
			default ->
				throw new IllegalArgumentException("Tipe tidak sesuai dengan seluruh kemungkinan yang ada!");
		}

		StringBuilder generatedId;
		do {
			generatedId = generateId(prefix, 5);
		} while (dataPeminjam.containsKey(generatedId.toString()));

        return generatedId.toString();
    }

	/**
     * Membuat id random dengan format yang ditentukan untuk objek Koleksi dari sebuah Map data Koleksi.
	 * @param tipe Tipe Koleksi.
	 * @param dataKoleksi HashMap data Koleksi.
	 * @throws IllegalArgumentException Dilempar saat tipe tidak sesuai dengan tipe Koleksi.
     * */
    public static String generateKoleksiId(String tipe, HashMap<String, Koleksi> dataKoleksi)
		throws IllegalArgumentException {
		String prefix;
		switch (tipe) {
			case "Buku" -> prefix = "B";
			case "Majalah" -> prefix = "M";
			case "Disk" -> prefix = "D";
			default ->
				throw new IllegalArgumentException("Tipe tidak sesuai dengan seluruh kemungkinan yang ada!");
		}

		StringBuilder generatedId;
		do {
			generatedId = generateId(prefix, 5);
		} while (dataKoleksi.containsKey(generatedId.toString()));

        return generatedId.toString();
    }

	/**
     * Membuat id random dengan format yang ditentukan untuk objek Transaksi dari sebuah Map data Transaksi.
	 * @param dataTransaksi HashMap data Transaksi.
     * */
    public static String generateTransaksiId(HashMap<String, Transaksi> dataTransaksi) {
		StringBuilder generatedId;
		do {
			generatedId = generateId("T", 10);
		} while (dataTransaksi.containsKey(generatedId.toString()));

        return generatedId.toString();
    }
}
