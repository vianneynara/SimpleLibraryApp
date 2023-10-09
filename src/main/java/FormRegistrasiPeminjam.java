/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 *
 * @author narwa
 */
public class FormRegistrasiPeminjam extends javax.swing.JPanel {

    private final Color I_RED = new Color(0xFF5959);
    private JFrame parent;

    /**
     * Creates new form FormRegistrasiPeminjam
     */
    public FormRegistrasiPeminjam(JFrame parent) {
        initComponents();
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regisPeminjamTitle = new javax.swing.JLabel();
        l_nama = new javax.swing.JLabel();
        i_nama = new java.awt.TextField();
        l_noId = new javax.swing.JLabel();
        i_noId = new java.awt.TextField();
        i_jenisNoId = new javax.swing.JComboBox<>();
        l_alamat = new javax.swing.JLabel();
        i_alamat = new java.awt.TextField();
        l_telp = new javax.swing.JLabel();
        i_telp = new java.awt.TextField();
        l_maksPinjam = new javax.swing.JLabel();
        i_maksPinjam = new javax.swing.JSpinner();
        b_simpanRegPeminjam = new javax.swing.JButton();
        b_kosongkanRegPeminjam = new javax.swing.JButton();
        l_simpanPeminjamEmptyIndicator = new javax.swing.JLabel();
        l_noIdPeminjam = new javax.swing.JLabel();
        i_noIdPeminjam = new java.awt.TextField();

        setPreferredSize(new java.awt.Dimension(729, 517));

        regisPeminjamTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regisPeminjamTitle.setText("Registrasi Data Peminjam");

        l_nama.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_nama.setText("Nama Lengkap");
        l_nama.setMaximumSize(new java.awt.Dimension(150, 25));
        l_nama.setMinimumSize(new java.awt.Dimension(150, 25));

        i_nama.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        i_nama.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        i_nama.setName(""); // NOI18N
        i_nama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_namaFocusLost(evt);
            }
        });
        i_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_namaActionPerformed(evt);
            }
        });

        l_noId.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_noId.setText("Nomor Identitas");
        l_noId.setMaximumSize(new java.awt.Dimension(150, 25));
        l_noId.setMinimumSize(new java.awt.Dimension(150, 25));

        i_noId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        i_noId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_noIdFocusLost(evt);
            }
        });
        i_noId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_noIdActionPerformed(evt);
            }
        });

        i_jenisNoId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        i_jenisNoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIM", "NIP", "NIK" }));
        i_jenisNoId.setToolTipText("Jenis Nomor Identitas");
        i_jenisNoId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_jenisNoIdFocusLost(evt);
            }
        });
        i_jenisNoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_jenisNoIdActionPerformed(evt);
            }
        });

        l_alamat.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_alamat.setText("Alamat");
        l_alamat.setMaximumSize(new java.awt.Dimension(150, 25));
        l_alamat.setMinimumSize(new java.awt.Dimension(150, 25));

        i_alamat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        i_alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_alamatFocusLost(evt);
            }
        });
        i_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_alamatActionPerformed(evt);
            }
        });

        l_telp.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_telp.setText("Nomor Telepon");
        l_telp.setMaximumSize(new java.awt.Dimension(150, 25));
        l_telp.setMinimumSize(new java.awt.Dimension(150, 25));

        i_telp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        i_telp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_telpFocusLost(evt);
            }
        });
        i_telp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_telpActionPerformed(evt);
            }
        });

        l_maksPinjam.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_maksPinjam.setText("Maks. Pinjaman");
        l_maksPinjam.setMaximumSize(new java.awt.Dimension(150, 25));
        l_maksPinjam.setMinimumSize(new java.awt.Dimension(150, 25));

        int maksPinjam = switch ((String) i_jenisNoId.getSelectedItem()) {
            case "NIM" -> 5;
            case "NIP" -> 7;
            case "NIK" -> 3;
            default -> 0;
        };
        i_maksPinjam.setModel(new javax.swing.SpinnerNumberModel(1, 0, maksPinjam, 1));

        b_simpanRegPeminjam.setBackground(new java.awt.Color(51, 204, 0));
        b_simpanRegPeminjam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_simpanRegPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        b_simpanRegPeminjam.setText("Simpan");
        b_simpanRegPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_simpanRegPeminjamActionPerformed(evt);
            }
        });

        b_kosongkanRegPeminjam.setBackground(new java.awt.Color(255, 102, 102));
        b_kosongkanRegPeminjam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_kosongkanRegPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        b_kosongkanRegPeminjam.setText("Kosongkan");
        b_kosongkanRegPeminjam.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b_kosongkanRegPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_kosongkanRegPeminjamActionPerformed(evt);
            }
        });

        l_simpanPeminjamEmptyIndicator.setBackground(new java.awt.Color(153, 153, 153));
        l_simpanPeminjamEmptyIndicator.setForeground(new java.awt.Color(255, 51, 51));
        l_simpanPeminjamEmptyIndicator.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_simpanPeminjamEmptyIndicator.setText("Terdapat data yang masih kosong atau tidak benar!");
        l_simpanPeminjamEmptyIndicator.setVisible(false);

        l_noIdPeminjam.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_noIdPeminjam.setText("Id. Peminjam (6 digit)");
        l_noIdPeminjam.setToolTipText("Kode: NIM / M; NIP / D; NIK / U");
        l_noIdPeminjam.setMaximumSize(new java.awt.Dimension(150, 25));
        l_noIdPeminjam.setMinimumSize(new java.awt.Dimension(150, 25));

        i_noIdPeminjam.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        i_noIdPeminjam.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_noIdPeminjamFocusLost(evt);
            }
        });
        i_noIdPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_noIdPeminjamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regisPeminjamTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l_noIdPeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_telp, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_noId, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_alamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_maksPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(i_noId, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i_jenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(i_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(i_noIdPeminjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(i_maksPinjam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_simpanPeminjamEmptyIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_kosongkanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_simpanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regisPeminjamTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_noId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_jenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_noId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_telp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l_maksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_maksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(217, 217, 217)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_noIdPeminjam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(i_noIdPeminjam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_simpanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_kosongkanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_simpanPeminjamEmptyIndicator))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void i_namaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_namaFocusLost
        String text = i_nama.getText().trim();
//        if (!Checker.isAlphabetSpace(text, 3)) {
//            i_nama.setBackground(I_RED);
//        } else {
//            i_nama.setBackground(Color.WHITE);
//        }
        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 1
        try {
            if (!Checker.isAlphabetSpace(text, 3)) {
                throw new InputMismatchException();
            }
            i_nama.setBackground(Color.WHITE);
        } catch (InputMismatchException ex) {
            i_nama.setBackground(I_RED);
        }
    }//GEN-LAST:event_i_namaFocusLost

    private void i_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_namaActionPerformed

    private void i_noIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_noIdFocusLost
        Objects.requireNonNull(i_jenisNoId.getSelectedItem());
        int jumlahDigit = switch ((String) i_jenisNoId.getSelectedItem()) {
            case "NIM" -> 9;
            case "NIP" -> 18;
            case "NIK" -> 16;
            default -> 0;
        };
//        if (!Checker.isNomor(i_noId.getText(), jumlahDigit)) {
//            i_noId.setBackground(I_RED);
//        } else {
//            i_noId.setBackground(Color.WHITE);
//        }
        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 2
        try {
            if (!Checker.isNomor(i_noId.getText(), jumlahDigit)) {
                throw new InputMismatchException();
            }
            i_noId.setBackground(Color.WHITE);
        } catch (InputMismatchException ex) {
            i_noId.setBackground(I_RED);
        }
    }//GEN-LAST:event_i_noIdFocusLost

    private void i_noIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_noIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_noIdActionPerformed

    private void i_jenisNoIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_jenisNoIdFocusLost
        Objects.requireNonNull(i_jenisNoId.getSelectedItem());
        int maksPinjam = switch ((String) i_jenisNoId.getSelectedItem()) {
            case "NIM" -> 5;
            case "NIP" -> 7;
            case "NIK" -> 3;
            default -> 0;
        };
        int jumlahDigit = switch ((String) i_jenisNoId.getSelectedItem()) {
            case "NIM" -> 9;
            case "NIP" -> 18;
            case "NIK" -> 16;
            default -> 0;
        };
        i_maksPinjam.setModel(new javax.swing.SpinnerNumberModel(1, 0, maksPinjam, 1));
//        if (!Checker.isNomor(i_noId.getText(), jumlahDigit)) {
//            i_noId.setBackground(I_RED);
//        } else {
//            i_noId.setBackground(Color.WHITE);
//        }
        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 3
        try {
            if (!Checker.isNomor(i_noId.getText(), jumlahDigit)) {
                throw new InputMismatchException();
            }
            i_noId.setBackground(Color.WHITE);
        } catch (InputMismatchException ex) {
            i_noId.setBackground(I_RED);
        }
    }//GEN-LAST:event_i_jenisNoIdFocusLost

    private void i_jenisNoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_jenisNoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_jenisNoIdActionPerformed

    private void i_alamatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_alamatFocusLost
//        if (i_alamat.getText().trim().length() < 10) {
//            i_alamat.setBackground(I_RED);
//        } else {
//            i_alamat.setBackground(Color.WHITE);
//        }
        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 4
        try {
            if (i_alamat.getText().trim().length() < 10) {
                throw new InputMismatchException();
            }
            i_alamat.setBackground(Color.WHITE);
        } catch (InputMismatchException ex) {
            i_alamat.setBackground(I_RED);
        }
    }//GEN-LAST:event_i_alamatFocusLost

    private void i_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_alamatActionPerformed

    private void i_telpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_telpFocusLost
//        if (!Checker.isNomor(i_telp.getText().trim(), 10, 12)) {
//            i_telp.setBackground(I_RED);
//        } else {
//            i_telp.setBackground(Color.WHITE);
//        }
        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 5
        try {
            if (!Checker.isNomor(i_telp.getText().trim(), 10, 12)) {
                throw new InputMismatchException();
            }
            i_telp.setBackground(Color.WHITE);
        } catch (InputMismatchException ex) {
            i_telp.setBackground(I_RED);
        }
    }//GEN-LAST:event_i_telpFocusLost

    private void i_telpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_telpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_telpActionPerformed

    private void b_simpanRegPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanRegPeminjamActionPerformed
        /* Variabel-variabel penyimpan data DENGAN regex */
        String nama = i_nama.getText().trim().replaceAll(" {2,}", " ");
        String noId = i_noId.getText().trim().replaceAll(" ", "");
        String jenisNoId = (String) i_jenisNoId.getSelectedItem();
        String alamat = i_alamat.getText().trim().replaceAll(" {2,}", " ");
        String noTelp = i_telp.getText().trim().replaceAll(" ", "");
        int maksPinjam = (int) i_maksPinjam.getValue();
        String noIdPeminjam = i_noIdPeminjam.getText().trim().replaceAll(" ", "");

        /* mengecek apakah terdapat field yang kosong setelah ditrim untuk setiap field String */
        for (TextField field : new TextField[] {i_nama, i_noId, i_alamat, i_telp}) {
            if (Checker.stringIsEmpty(field.getText().trim())) {
                l_simpanPeminjamEmptyIndicator.setVisible(true);
                field.setBackground(I_RED);
                JOptionPane.showMessageDialog(
                    this.parent,
                    "Terdapat field input yang masih kosong/salah! (Highlight merah)",
                    "Warning",
                    JOptionPane.INFORMATION_MESSAGE
                );
                return;
            }
        }
        /* mengecek apakah format nomor identitas dan telepon sudah valid*/
        Objects.requireNonNull(jenisNoId);
        if (
            !Checker.isNomor(noId.trim(), (jenisNoId.equals("NIM") ? 9 : (jenisNoId.equals("NIP")) ? 16 : 18)) &&
            !Checker.isNomor(noTelp.trim(), 10, 12)) {
            l_simpanPeminjamEmptyIndicator.setVisible(true);
            return;
        }
        l_simpanPeminjamEmptyIndicator.setVisible(false);

        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 6
        Objects.requireNonNull(jenisNoId);
        try {
            if ((!noIdPeminjam.matches(String.format("^[%s]+[0-9]{5}$",
            (jenisNoId.equals("NIM") ? "M" : (jenisNoId.equals("NIP")) ? "D" : "U"))))) {
                throw new InputMismatchException("Nomor id peminjam masih belum sesuai!");
            }
        } catch (InputMismatchException ex) {
            JOptionPane.showMessageDialog(
                this.parent,
                ex.getMessage(),
                "Warning",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }

        /* mengeksekusi pembuatan dialog data dengan antrian event tasks */
        java.awt.EventQueue.invokeLater(
            () -> new RegistrasiPeminjamBerhasil(parent, true, nama, noId, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam)
                .setVisible(true)
        );
        kosongkanRegPeminjam();

        /* Print data */
        System.out.printf("""
            Saved peminjam baru: {
              nama: "%s",
              noId: "%s",
              jenisNoId: "%s",
              alamat: "%s",
              telp: "%s",
              maksPinjam: %1d
            }
            """,
        nama, noId, jenisNoId, alamat, noTelp, maksPinjam);
    }//GEN-LAST:event_b_simpanRegPeminjamActionPerformed

    private void b_kosongkanRegPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_kosongkanRegPeminjamActionPerformed
        kosongkanRegPeminjam();                                 // panggil metode yang mengosongkan reg. peminjam

        l_simpanPeminjamEmptyIndicator.setVisible(false);       // mematikan indikator field masih kosong
    }//GEN-LAST:event_b_kosongkanRegPeminjamActionPerformed

    private void i_noIdPeminjamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_noIdPeminjamFocusLost
        String text = i_noIdPeminjam.getText().trim();
        String jenisNoId = (String) i_jenisNoId.getSelectedItem();
        Objects.requireNonNull(jenisNoId);
        if (!text.matches(String.format("^[%s]+[0-9]{5}$",
            (jenisNoId.equals("NIM") ? "M" : (jenisNoId.equals("NIP")) ? "D" : "U")))) {
            i_noIdPeminjam.setBackground(I_RED);
        } else {
            i_noIdPeminjam.setBackground(Color.WHITE);
        }
    }//GEN-LAST:event_i_noIdPeminjamFocusLost

    private void i_noIdPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_noIdPeminjamActionPerformed
        // TODO: Nothing there
    }//GEN-LAST:event_i_noIdPeminjamActionPerformed

    /**
     * Mengosongkan/mengatur seluruh field registrasi peminjam dengan nilai awal.
     */
    private void kosongkanRegPeminjam() {
        i_nama.setText("");
        i_noId.setText("");
        i_jenisNoId.setSelectedIndex(0);
        i_alamat.setText("");
        i_telp.setText("");
        i_maksPinjam.setValue(1);
        i_noIdPeminjam.setText("");

        /* Melakukan reset model sesuai dengan tipe nomor identitas yang dipilih */
        Objects.requireNonNull(i_jenisNoId.getSelectedItem());
        int maksPinjam = switch ((String) i_jenisNoId.getSelectedItem()) {
            case "NIM" -> 5;
            case "NIP" -> 7;
            case "NIK" -> 3;
            default -> 0;
        };
        i_maksPinjam.setModel(new javax.swing.SpinnerNumberModel(1, 0, maksPinjam, 1));

        /* Melakukan reset warna background tiap field menjadi putih */
        for (TextField c : new TextField[] {i_nama, i_noId, i_alamat, i_telp, i_noIdPeminjam}) {
            c.setBackground(Color.WHITE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_kosongkanRegPeminjam;
    private javax.swing.JButton b_simpanRegPeminjam;
    private java.awt.TextField i_alamat;
    private javax.swing.JComboBox<String> i_jenisNoId;
    private javax.swing.JSpinner i_maksPinjam;
    private java.awt.TextField i_nama;
    private java.awt.TextField i_noId;
    private java.awt.TextField i_noIdPeminjam;
    private java.awt.TextField i_telp;
    private javax.swing.JLabel l_alamat;
    private javax.swing.JLabel l_maksPinjam;
    private javax.swing.JLabel l_nama;
    private javax.swing.JLabel l_noId;
    private javax.swing.JLabel l_noIdPeminjam;
    private javax.swing.JLabel l_simpanPeminjamEmptyIndicator;
    private javax.swing.JLabel l_telp;
    private javax.swing.JLabel regisPeminjamTitle;
    // End of variables declaration//GEN-END:variables
}
