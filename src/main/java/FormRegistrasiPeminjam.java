/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

import backend.Customer;
import backend.Dosen;
import backend.Mahasiswa;
import backend.Umum;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

import static java.awt.event.FocusEvent.FOCUS_LOST;

/**
 *
 * @author narwa
 */
public class FormRegistrasiPeminjam extends javax.swing.JPanel {

    private final Color I_RED = new Color(0xFF5959);
    private final JFrame parent;

	/** Atribut kelas ini menyimpan list dari seluruh Customer yang disimpan */
	private List<Customer> listCustomer;

    /**
     * Creates new form FormRegistrasiPeminjam
     */
    public FormRegistrasiPeminjam(JFrame parent, List<Customer> listCustomer) {
        this.parent = parent;
        this.listCustomer = listCustomer;
        initComponents();
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
        i_noTelp = new java.awt.TextField();
        l_maksPinjam = new javax.swing.JLabel();
        i_maksPinjam = new javax.swing.JSpinner();
        b_simpanRegPeminjam = new javax.swing.JButton();
        b_kosongkanRegPeminjam = new javax.swing.JButton();
        l_simpanPeminjamEmptyIndicator = new javax.swing.JLabel();
        l_noIdPeminjam = new javax.swing.JLabel();
        i_noIdPeminjam = new java.awt.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelCustomer = new javax.swing.JTable();
        b_refresh = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(729, 517));

        regisPeminjamTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regisPeminjamTitle.setText("Registrasi Data Peminjam");

        l_nama.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        l_nama.setText("Nama Lengkap");
        l_nama.setToolTipText("Minimal 3 karakter, boleh spasi");
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
        l_alamat.setToolTipText("Minimal 10 karakter");
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
        l_telp.setToolTipText("Minimal 10 hingga 12 digit");
        l_telp.setMaximumSize(new java.awt.Dimension(150, 25));
        l_telp.setMinimumSize(new java.awt.Dimension(150, 25));

        i_noTelp.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        i_noTelp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                i_noTelpFocusLost(evt);
            }
        });
        i_noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_noTelpActionPerformed(evt);
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
        l_noIdPeminjam.setToolTipText("Kode: M / NIM ; D / NIP; U / NIK ");
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

        tabelCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nama lengkap", "alamat", "nomor telepon", "maks pinjam", "nomor identitas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelCustomer.setToolTipText("Data yang sudah tercatat dalam data");
        tabelCustomer.setRowHeight(16);
        tabelCustomer.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                retrieveData();
            }
        });
        jScrollPane2.setViewportView(tabelCustomer);

        b_refresh.setText("Refresh table");
        b_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_simpanPeminjamEmptyIndicator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_kosongkanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_simpanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(regisPeminjamTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(l_telp, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_noId, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_alamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_maksPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(l_nama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(i_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(i_noId, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(i_jenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(i_maksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(l_noIdPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(i_noIdPeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(i_noTelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regisPeminjamTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
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
                    .addComponent(i_noTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_maksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_noIdPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_maksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(i_noIdPeminjam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_simpanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_kosongkanRegPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_simpanPeminjamEmptyIndicator)))
                    .addComponent(b_refresh))
                .addGap(10, 10, 10))
        );

        l_noIdPeminjam.getAccessibleContext().setAccessibleDescription("Identifier Peminjam");
    }// </editor-fold>//GEN-END:initComponents

    private void i_namaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_namaFocusLost
        String text = i_nama.getText().trim();
/*        if (!Checker.isAlphabetSpace(text, 3)) {
            i_nama.setBackground(I_RED);
        } else {
            i_nama.setBackground(Color.WHITE);
        }*/
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
            default -> 16;  // NIK
        };
/*        if (!Checker.isNomor(i_noId.getText(), jumlahDigit)) {
            i_noId.setBackground(I_RED);
        } else {
            i_noId.setBackground(Color.WHITE);
        }*/
        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 2
        try {
            if (!Checker.isNomor(i_noId.getText().trim(), jumlahDigit)) {
                throw new InputMismatchException();
            }
            i_noId.setBackground(Color.WHITE);
        } catch (InputMismatchException ex) {
            i_noId.setBackground(I_RED);
        }
    }//GEN-LAST:event_i_noIdFocusLost

    private void i_jenisNoIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_jenisNoIdFocusLost
        Objects.requireNonNull(i_jenisNoId.getSelectedItem());
        int maksPinjam = switch ((String) i_jenisNoId.getSelectedItem()) {
            case "NIM" -> 5;
            case "NIP" -> 7;
            default -> 3;  // NIK
        };
        int jumlahDigit = switch ((String) i_jenisNoId.getSelectedItem()) {
            case "NIM" -> 9;
            case "NIP" -> 18;
            default -> 16;  // NIK
        };
        i_maksPinjam.setModel(new javax.swing.SpinnerNumberModel(1, 0, maksPinjam, 1));
        if (!Checker.stringIsEmpty(i_noIdPeminjam.getText()))
            i_noIdPeminjamFocusLost(new FocusEvent(i_noIdPeminjam, FOCUS_LOST, true));
/*        if (!Checker.isNomor(i_noId.getText(), jumlahDigit)) {
            i_noId.setBackground(I_RED);
        } else {
            i_noId.setBackground(Color.WHITE);
        }*/
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
/*        if (i_alamat.getText().trim().length() < 10) {
            i_alamat.setBackground(I_RED);
        } else {
            i_alamat.setBackground(Color.WHITE);
        }*/
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

    private void i_noTelpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_i_noTelpFocusLost
/*        if (!Checker.isNomor(i_telp.getText().trim().replaceAll("[\\s-]+", ""), 10, 12)) {
            i_telp.setBackground(I_RED);
        } else {
            i_telp.setBackground(Color.WHITE);
        }*/
        // TODO: [REMOVE LATER] COUNT THIS AS TRY-CATCH: 5
        try {
            if (!Checker.isNomor(i_noTelp.getText().trim().replaceAll("[\\s-]+", ""), 10, 12)) {
                throw new InputMismatchException();
            }
            i_noTelp.setBackground(Color.WHITE);
        } catch (InputMismatchException ex) {
            i_noTelp.setBackground(I_RED);
        }
    }//GEN-LAST:event_i_noTelpFocusLost

    private void i_noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_noTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_noTelpActionPerformed

    private void b_simpanRegPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_simpanRegPeminjamActionPerformed
        /* Variabel-variabel penyimpan data DENGAN regex */
        String nama = i_nama.getText().trim().replaceAll(" {2,}", " ");
        String noId = i_noId.getText().trim().replaceAll(" ", "");
        String jenisNoId = (String) i_jenisNoId.getSelectedItem();
        String alamat = i_alamat.getText().trim().replaceAll(" {2,}", " ");
        String noTelp = i_noTelp.getText().trim().replaceAll("[\\s-]+", "");
        int maksPinjam = (int) i_maksPinjam.getValue();
        String noIdPeminjam = i_noIdPeminjam.getText().trim().replaceAll(" ", "");

        /* mengecek apakah terdapat field yang kosong setelah ditrim untuk setiap field String */
        for (TextField field : new TextField[] {i_nama, i_noId, i_alamat, i_noTelp}) {
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
            if (!noIdPeminjam.matches(String.format("^[%s]+[0-9]{5}$",
            (jenisNoId.equals("NIM") ? "M" : (jenisNoId.equals("NIP")) ? "D" : "U")))) {
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

        listCustomer.add(
            buatCustomer(nama, noId, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam)
        );
//        /* Menambahkan secara langsung ke tabel */
//        ((DefaultTableModel) tabelCustomer.getModel())
//            .addRow(new Object[] {noIdPeminjam, nama, alamat, noTelp, maksPinjam, noId});
        updateTable();

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

    private void b_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_refreshActionPerformed
        updateTable();
    }//GEN-LAST:event_b_refreshActionPerformed

    private void i_noIdPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_noIdPeminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_noIdPeminjamActionPerformed

    // Other functions

    /**
     * Menyalakan seluruh input fields.
     * */
    private void enableInputFields() {
        i_nama.setEnabled(true);
        i_noId.setEnabled(true);
        i_jenisNoId.setEnabled(true);
        i_alamat.setEnabled(true);
        i_noTelp.setEnabled(true);
        i_maksPinjam.setEnabled(true);
        i_noIdPeminjam.setEnabled(true);
    }

    /**
     * Mematikan seluruh input fields.
     * */
    private void disableInputFields() {
        i_nama.setEnabled(false);
        i_noId.setEnabled(false);
        i_jenisNoId.setEnabled(false);
        i_alamat.setEnabled(false);
        i_noTelp.setEnabled(false);
        i_maksPinjam.setEnabled(false);
        i_noIdPeminjam.setEnabled(false);
    }


    /**
     * Mengosongkan/mengatur seluruh field registrasi peminjam dengan nilai awal.
     */
    private void kosongkanRegPeminjam() {
        i_nama.setText("");
        i_noId.setText("");
        i_jenisNoId.setSelectedIndex(0);
        i_alamat.setText("");
        i_noTelp.setText("");
        i_maksPinjam.setValue(1);
        i_noIdPeminjam.setText("");
        enableInputFields();
        b_simpanRegPeminjam.setEnabled(true);

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
        for (TextField c : new TextField[] {i_nama, i_noId, i_alamat, i_noTelp, i_noIdPeminjam}) {
            c.setBackground(Color.WHITE);
        }
        tabelCustomer.clearSelection();
    }

    /**
     * Membuat customer sesuai dengan jenis nomor identitas yang dimasukkan, menyesuaikan kelas yang akan digunakan
     * sebagai penyimpan.
     *
     * @return {@link Customer}
     * */
    private Customer buatCustomer(String nama, String noId, String jenisNoId, String alamat, String noTelp, int maksPinjam, String noIdPeminjam) {
        Customer c = switch (jenisNoId) {
            case "NIM" -> new Mahasiswa(nama, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam, noId);
            case "NIP" -> new Dosen(nama, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam, noId);
            case "NIK" -> new Umum(nama, jenisNoId, alamat, noTelp, maksPinjam, noIdPeminjam, noId);
            default ->  null;
        };
        System.out.println("Created: " + c);
        return c;
    }

    private void updateTable() {
        // <editor-fold defaultstate ="collapsed" desc="cara 1: / non-performant">
        Object[][] data = new Object[listCustomer.size()][6];
        String[] columns = {"id", "nama lengkap", "alamat", "nomor telepon", "maks pinjam", "nomor identitas"};
        for (int i = 0; i < listCustomer.size(); i++) {
            var currentRow = listCustomer.get(i);
            data[i][0] = currentRow.getNoIdPeminjam();
            data[i][1] = currentRow.getNama();
            data[i][2] = currentRow.getAlamat();
            data[i][3] = currentRow.getNoTelp();
            data[i][4] = currentRow.getMaksPinjam();
            data[i][5] =
                (currentRow instanceof Mahasiswa c) ? c.getNim() :
                    (currentRow instanceof Dosen c) ? c.getNip() :
                        ((Umum) currentRow).getNik();
        }
        var newModel = new DefaultTableModel(data, columns){
            @Override
            public boolean isCellEditable(int rowIndex, int
                colIndex) {
                return false;
            }
        };
        tabelCustomer.setModel(newModel);
        // </editor-fold>
        // <editor-fold defaultstate="collapsed" desc="cara 2: more performant, cons is directly adding to table, not dependent by list / DB">
//        var model = (DefaultTableModel) tabelCustomer.getModel();
//        for (int i = 0; i < listCustomer.size(); i++) {
//            var curr = listCustomer.get(i);
//            model.addRow(
//                new Object[] {
//                    curr.getNoIdPeminjam(),
//                    curr.getNama(),
//                    curr.getAlamat(),
//                    curr.getNoTelp(),
//                    curr.getMaksPinjam(),
//                    (curr instanceof Mahasiswa c) ? c.getNim() :
//                        (curr instanceof Dosen c) ? c.getNip() :
//                            ((Umum) curr).getNik()
//                }
//            );
//        }
//        ((DefaultTableModel) tabelCustomer.getModel()).fireTableDataChanged();
        // </editor-fold>
    }

    private void retrieveData() {
        int rowIndex = tabelCustomer.getSelectedRow();
        if (rowIndex != -1) {
            var rowData = listCustomer.get(rowIndex);
//            String[] columns = {"id", "nama lengkap", "alamat", "nomor telepon", "maks pinjam", "nomor identitas"};

            i_nama.setText(rowData.getNama());
            i_noId.setText(
                (rowData instanceof Mahasiswa c) ? c.getNim() :
                    (rowData instanceof Dosen c) ? c.getNip() :
                        ((Umum) rowData).getNik()
            );
            i_jenisNoId.setSelectedIndex(switch (rowData.getJenisNoId()) {
                case "NIM" -> 0;
                case "NIP" -> 1;
                default -> 2;
            });
            i_alamat.setText(rowData.getAlamat());
            i_noTelp.setText(rowData.getNoTelp());
            i_maksPinjam.setValue(rowData.getMaksPinjam());
            i_noIdPeminjam.setText(rowData.getNoIdPeminjam());

            disableInputFields();
            b_simpanRegPeminjam.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_kosongkanRegPeminjam;
    private javax.swing.JButton b_refresh;
    private javax.swing.JButton b_simpanRegPeminjam;
    private java.awt.TextField i_alamat;
    private javax.swing.JComboBox<String> i_jenisNoId;
    private javax.swing.JSpinner i_maksPinjam;
    private java.awt.TextField i_nama;
    private java.awt.TextField i_noId;
    private java.awt.TextField i_noIdPeminjam;
    private java.awt.TextField i_noTelp;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_alamat;
    private javax.swing.JLabel l_maksPinjam;
    private javax.swing.JLabel l_nama;
    private javax.swing.JLabel l_noId;
    private javax.swing.JLabel l_noIdPeminjam;
    private javax.swing.JLabel l_simpanPeminjamEmptyIndicator;
    private javax.swing.JLabel l_telp;
    private javax.swing.JLabel regisPeminjamTitle;
    private javax.swing.JTable tabelCustomer;
    // End of variables declaration//GEN-END:variables
}
