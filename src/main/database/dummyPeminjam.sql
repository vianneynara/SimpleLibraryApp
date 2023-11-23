-- THIS DELETES THE WHOLE RECORDS
BEGIN
    DELETE FROM "Peminjam" WHERE 1=1;
    COMMIT;
END;

-- INSERT SELURUH PEMINJAM
BEGIN
    -- MAHASISWA
    -- Row 1
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22015', 'Rafael Mahesa Putra', 'NIM', 'Jl. Sawo Matang no.133 Condongcatur', '0811234567890', 3, '205314077');

    -- Row 2
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22016', 'Justino Ardian Suban Baolangu', 'NIM', 'Gg. Kosan Indah Paingan Maguwoharjo', '0811234567890', 3, '205314079');

    -- Row 3
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22017', 'Gabriel Advent Batan', 'NIM', 'Gg. Programming no.1010 Desa Java', '0811234567890', 3, '205314096');

    -- Row 4
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22018', 'Mario Richard Paulo Yamlean', 'NIM', 'Jl. Apache Netbeans no.12B Oracle Black Street 5th', '0811234567890', 3, '205314104');

    -- Row 5
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22019', 'Katrina Yuliana Kartika', 'NIM', 'Gg. Inheritance no.77 Desa Object Oriented II', '0811234567890', 4, '205314099');

    -- Row 6
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22020', 'Marcelia Putri Supriosa', 'NIM', 'Jl. Graphical User Interface no.1 Kampung Java', '0811234567890', 3, '205314075');

    -- Row 7
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22021', 'Bernadetha Mega Devina A', 'NIM', 'Gg. Exception Personal no.2X Wall of Error II', '0811234567890', 4, '195314058');

    -- Row 8
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('M22022', 'Yohanes Dani Adipta', 'NIM', 'Gg. Eterna Marvel no.1 Boliwood India', '0811234567890', 4, '195314068');

    -- DOSEN --

    -- Row 1
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11123', 'Sujadmiko Raharjo', 'NIP', 'Jl. Kembang Arum no.123 Condongcatur', '0811234567890', 5, '19820325007');

    -- Row 2
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11124', 'Bagong Ahmadi', 'NIP', 'Jl. Proklamasi no.13 Caturtunggal', '0811234567890', 5, '19800305012');

    -- Row 3
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11125', 'Yohanes Supangat', 'NIP', 'Jl. Ayam Jantan no.23X Maguwo Hardjo', '0811234567890', 5, '19781225001');

    -- Row 4
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11126', 'Alberta Sri Sumini', 'NIP', 'Jl. Segi Tiga no.M88 Pakem', '0811234567890', 5, '19730321006');

    -- Row 5
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11127', 'John Sabar Menanti', 'NIP', 'Gg. Kapuas no.L12 Mancasan Kidul', '0811234567890', 5, '19990909009');

    -- Row 6
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11128', 'Ayu Setianing Sekar', 'NIP', 'Jl. Achmad Yani no.55 Blok I Komplek Kembang Jaya', '0811234567890', 6, '19880818018');

    -- Row 7
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11129', 'Citra Jesica Indah', 'NIP', 'Jl. Pinus 5 no. 2 Cassa Grande', '0811234567890', 5, '19850520003');

    -- Row 8
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('D11130', 'Antonius Suparman', 'NIP', 'Jl. Kantil 5 no. 352 Condongcatur', '0811234567890', 5, '19850520007');

    -- UMUM

    -- Row 1
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28810', 'Chelsea Olivia', 'NIK', 'Gg. Anak Jalanan no.2X The World of the Married', '0811234567890', 4, '3404070802756001');

    -- Row 2
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28811', 'Raffi Ahmad', 'NIK', 'Jl. Ikatan Cinta no.8 SKY Castle 2th', '0811234567890', 4, '3404080702156006');

    -- Row 3
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28812', 'Kevin Julio', 'NIK', 'Gg. Ganteng2 Srigala no.11 Crash Landing on U ', '0811234567890', 4, '3404070305875004');

    -- Row 4
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28813', 'Ayu Ting Ting', 'NIK', 'Jl. Cinta Fitri no.8A The World of the Married', '0811234567890', 4, '5404080804758009');

    -- Row 5
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28814', 'Prilly Latuconsina', 'NIK', 'Gg. Intan no.25 Squid Gam', '0811234567890', 4, '4404080602776003');

    -- Row 6
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28815', 'Via Valen', 'NIK', 'Gg. Putri Yang Ditukar no.9 Dali and Cocky Prince', '0811234567890', 4, '3404071205756012');

    -- Row 7
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28816', 'Gisella Anastasia', 'NIK', 'Gg. Preman Pensiun no.99 The Good Detective', '0811234567890', 4, '3404071112957021');

    -- Row 8
    INSERT INTO "Peminjam" (id_peminjam, nama_lengkap,  jenis_no_id, alamat,  nomor_telepon, maks_pinjam, nomor_identitas)
    VALUES ('U28817', 'Tantowi Sukoco', 'NIK', 'Gg. Manusia Srigala no.4 Horor Ritual', '0811234567890', 4, '3404071112957011');

    COMMIT;
end;

select *
from "Peminjam";