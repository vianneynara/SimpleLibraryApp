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
		this.dataPeminjam = new HashMap<>();
		this.dataKoleksi = new HashMap<>();
		this.dataTransaksi = new HashMap<>();
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

	public List<Peminjam> getListPeminjam() {
		return new ArrayList<>(dataPeminjam.values());
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

	public List<Koleksi> getListKoleksi() {
		return new ArrayList<>(dataKoleksi.values());
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

	public List<Transaksi> getListTransaksi() {
		return new ArrayList<>(dataTransaksi.values());
	}

	/**
	 * Menerima list yang terdiri atas {@link Koleksi} kemudian dikonversi menyesuaikan Map pada kelas ini. Hasil
	 * konversi akan masukkan sebagai nilai baru pada {@link #dataKoleksi}.
	 * */
	public void setListTransaksi(List<Transaksi> listTransaksi) {
		this.dataTransaksi =
			(HashMap<String, Transaksi>) listTransaksi.stream().collect(Collectors.toMap(Transaksi::getId, Function.identity()));
	}

	/* Other Functions */

	public void isiDataPeminjam(Peminjam data) {
		try {
			dataPeminjam.put(data.getId(), data);
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	public void isiDataKoleksi(Koleksi data) {
		try {
			dataKoleksi.put(data.getId(), data);
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	public void isiDataTransaksi(Transaksi data) {
		try {
			dataTransaksi.put(data.getId(), data);
		} catch (Exception exception) {
			Logger.getLogger(DataPerpus.class.getName()).log(Level.SEVERE, null, exception);
		}
	}

	/**
     * Membuat id random dengan format yang ditentukan untuk objek peminjam dari sebuah Map data peminjam.
     * */
    public static String generatePeminjamId(String tipe, HashMap<String, Peminjam> dataPeminjam) throws IllegalArgumentException {
		String prefix;
		switch (tipe) {
			case "NIM" -> prefix = "M";
			case "NIP" -> prefix = "D";
			case "NIK" -> prefix = "U";
			default ->
				throw new IllegalArgumentException("Tipe tidak sesuai dengan seluruh kemungkinan yang ada!");
		}

        Random random = new Random();
		StringBuilder generatedId;
		do {
			generatedId = new StringBuilder(prefix);
			for (int i = 0; i < ID_SUFFIX_LENGTH; i++) {
				int digit = random.nextInt(10);
				generatedId.append(digit);
			}
		} while (dataPeminjam.containsKey(generatedId.toString()));

        return generatedId.toString();
    }

    /**
     * Membuat id random dengan format yang ditentukan untuk objek koleksi dari sebuah Map data koleksi.
     * */
    public static String generateKoleksiId(String tipe, HashMap<String, Koleksi> dataKoleksi) throws IllegalArgumentException {
		String prefix;
		switch (tipe) {
			case "Buku" -> prefix = "B";
			case "Majalah" -> prefix = "M";
			case "Disk" -> prefix = "D";
			default ->
				throw new IllegalArgumentException("Tipe tidak sesuai dengan seluruh kemungkinan yang ada!");
		}

        Random random = new Random();
		StringBuilder generatedId;
		do {
			generatedId = new StringBuilder(prefix);
			for (int i = 0; i < ID_SUFFIX_LENGTH; i++) {
				int digit = random.nextInt(10);
				generatedId.append(digit);
			}
		} while (dataKoleksi.containsKey(generatedId.toString()));

        return generatedId.toString();
    }

    /**
     * Membuat id random dengan format yang ditentukan untuk objek transaksi dari sebuah Map data transaksi.
     * */
    public static String generateTransaksiId(String tipe, HashMap<String, Transaksi> dataTransaksi) {
        Random random = new Random();
		StringBuilder generatedId;
		do {
			generatedId = new StringBuilder("T");
			for (int i = 0; i < ID_SUFFIX_LENGTH; i++) {
				int digit = random.nextInt(10);
				generatedId.append(digit);
			}
		} while (dataTransaksi.containsKey(generatedId.toString()));

        return generatedId.toString();
    }
}
