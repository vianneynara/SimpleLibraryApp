-- THIS DELETES THE WHOLE RECORDS
BEGIN
    DELETE FROM "Koleksi" WHERE 1=1;
    COMMIT;
END;


BEGIN
    -- BUKU --

    -- Record 1
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, jumlah_halaman, isbn_issn, tahun_terbit, tipe) VALUES
    ('B56789', 'Algoritma dan Pemrograman', 'Informatika', 1, 770, '6021514917', '2019', 'BUKU');

    -- Record 2
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, jumlah_halaman, isbn_issn, tahun_terbit, tipe) VALUES
    ('B56790', 'Pemrograman C dan C plus plus', 'Informatika', 1, 290, '8221514787', '2019', 'BUKU');

    -- Record 3
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, jumlah_halaman, isbn_issn, tahun_terbit, tipe) VALUES
    ('B56791', 'Algoritma dan Pemrograman 2', 'Informatika', 1, 770, '6021514917', '2019', 'BUKU');

    -- Record 4
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, jumlah_halaman, isbn_issn, tahun_terbit, tipe) VALUES
    ('B56792', 'Pemrograman Berbasis Mobile Android Studio', 'Deepublish', 1, 550, '978602401672', '2019', 'BUKU');

    -- Record 5
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, jumlah_halaman, isbn_issn, tahun_terbit, tipe) VALUES
    ('B56793', 'Konsep dan Implementasi Pemrograman Laravel 7', 'Lokomedia', 1, 665, '986024014917', '2019', 'BUKU');

    -- Record 6
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, jumlah_halaman, isbn_issn, tahun_terbit, tipe) VALUES
    ('B56794', 'Pemrograman Mikrokontroler AVR Assembly dan C', 'Media Online', 1, 780, '235648514917', '2019', 'BUKU');

    -- Record 7
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, jumlah_halaman, isbn_issn, tahun_terbit, tipe) VALUES
    ('B56795', 'Esensi Bahasa Pemrograman Java', 'Kode"Koleksi"', 0, 770, '68948775215', '2019', 'BUKU');

    -- DISK --

    -- Row 1
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, format, isbn_issn, tahun_terbit, tipe)
    VALUES ('D12345', 'Legendary Toefl Test Of English', 'Sealova Media', 1, 'Video', '9799483530', '2020', 'DISK');

    -- Row 2
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, format, isbn_issn, tahun_terbit, tipe)
    VALUES ('D12346', 'Getting To Yes', 'Gramedia Pustaka', 1, 'Video', '978979227193', '2020', 'DISK');

    -- Row 3
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, format, isbn_issn, tahun_terbit, tipe)
    VALUES ('D12347', 'Consumer Behavior Hoyer Macinnis', 'McGraw-Hill', 1, 'Video', '978032483427', '2020', 'DISK');

    -- Row 4
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, format, isbn_issn, tahun_terbit, tipe)
    VALUES ('D12348', 'Men Are from Mars Women Are from Venus', 'Andi Offset', 0, 'Video', '978602037521', '2020', 'DISK');

    -- Row 5
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, format, isbn_issn, tahun_terbit, tipe)
    VALUES ('D12349', 'The Ancient Chinese Wisdom Sc', 'Tiga Serangkai', 1, 'Video', '978979291827', '2020', 'DISK');

    -- Row 6
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, format, isbn_issn, tahun_terbit, tipe)
    VALUES ('D12350', 'The Art of War', 'Pustaka Karya', 1, 'Video', '978602033465', '2020', 'DISK');

    -- Row 7
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, format, isbn_issn, tahun_terbit, tipe)
    VALUES ('D12351', 'X-Men Mutant Genesis 2.0 HC', 'Wiley Press', 1, 'Audio', '978078516589', '2020', 'DISK');

    -- MAJALAH --

    -- Row 1
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, volume, seri, isbn_issn, tahun_terbit, tipe)
    VALUES ('M69522', 'Infokomputer', 'Infomedia', 0, 12, 2, '21253658984', '2021', 'MAJALAH');

    -- Row 2
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, volume, seri, isbn_issn, tahun_terbit, tipe)
    VALUES ('M69582', 'Tempo', 'Tempo Press', 0, 12, 2, '212536845758', '2021', 'MAJALAH');

    -- Row 3
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, volume, seri, isbn_issn, tahun_terbit, tipe)
    VALUES ('M69581', 'Trubus', 'Gramedia Print', 0, 12, 2, '54255788548', '2021', 'MAJALAH');

    -- Row 4
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, volume, seri, isbn_issn, tahun_terbit, tipe)
    VALUES ('M69523', 'Art Projects', 'Artis Press', 1, 12, 2, '62548799521', '2021', 'MAJALAH');

    -- Row 5
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, volume, seri, isbn_issn, tahun_terbit, tipe)
    VALUES ('M69551', 'Elektron', 'Elek Media', 0, 12, 2, '356548745522', '2021', 'MAJALAH');

    -- Row 6
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, volume, seri, isbn_issn, tahun_terbit, tipe)
    VALUES ('M69541', 'PCPlus', 'Media Indonesia', 1, 12, 2, '45488784512', '2021', 'MAJALAH');

    -- Row 7
    INSERT INTO "Koleksi" (id_koleksi, judul, penerbit, status_pinjam, volume, seri, isbn_issn, tahun_terbit, tipe)
    VALUES ('M69583', 'CHIP', 'Softart Inc', 0, 12, 2, '98765215487', '2021', 'MAJALAH');

    COMMIT;
end;

select *
from "Koleksi";