package gui;

import javax.swing.*;

/**
 *
 * @author narwa
 */
public class RegistrasiPeminjamBerhasil extends javax.swing.JDialog {

    /**
     * Creates new form RegistrasiPeminjamBerhasil (untuk test)
     */
    public RegistrasiPeminjamBerhasil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);                                   // mengisi constructor parent
        initComponents();                                       // membuat dan mengatur komponen pada dialog
    }

    /**
     * Membuat RegistrasiPeminjamBerhasil dialog dengan isinya.
     */
    public RegistrasiPeminjamBerhasil
    (java.awt.Frame parent, boolean modal, String nama, String noId, String jenisNoId, String alamat, String noTelp, int maksPinjam, String noIdPeminjam) {
        super(parent, modal);                                   // mengisi constructor parent
        initComponents();                                       // membuat dan mengatur komponen pada dialog

        setTitle("Registrasi Peminjam Berhasil (" + noIdPeminjam + ")");
        /* Mengatur field sesuai dengan data yang dipassing */
        f_savedNama.setText(nama);
        f_savedNoId.setText(noId);
        f_savedJenisNoId.setText(jenisNoId);
        f_savedAlamat.setText(alamat);
        f_savedNoTelp.setText(noTelp);
        f_savedMaksPinjam.setText(String.valueOf(maksPinjam));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        l_savedNama = new javax.swing.JLabel();
        f_savedJenisNoId1 = new javax.swing.JLabel();
        f_savedNama = new javax.swing.JLabel();
        l_savedNoIdJenisNoId = new javax.swing.JLabel();
        f_savedNoId = new javax.swing.JLabel();
        f_savedJenisNoId = new javax.swing.JLabel();
        l_savedAlamat = new javax.swing.JLabel();
        f_savedAlamat = new javax.swing.JLabel();
        l_savedNoTelp = new javax.swing.JLabel();
        f_savedNoTelp = new javax.swing.JLabel();
        l_frameTitle = new javax.swing.JLabel();
        l_savedMaksPinjam = new javax.swing.JLabel();
        f_savedMaksPinjam = new javax.swing.JLabel();
        b_regBerhasilOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrasi Peminjam Berhasil");
        setBounds(new java.awt.Rectangle(0, 0, 578, 188));
        setMinimumSize(new java.awt.Dimension(578, 188));
        setPreferredSize(new java.awt.Dimension(578, 188));
        setSize(new java.awt.Dimension(578, 188));

        panel.setMinimumSize(new java.awt.Dimension(578, 188));

        l_savedNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedNama.setText("Nama Lengkap");

        f_savedJenisNoId1.setText("/");

        f_savedNama.setText("n");
        f_savedNama.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l_savedNoIdJenisNoId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedNoIdJenisNoId.setText("Nomor Identitas / Jenis");

        f_savedNoId.setText("n");
        f_savedNoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        f_savedJenisNoId.setText("n");
        f_savedJenisNoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l_savedAlamat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedAlamat.setText("Alamat");

        f_savedAlamat.setText("n");
        f_savedAlamat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l_savedNoTelp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedNoTelp.setText("Nomor Telepon");

        f_savedNoTelp.setText("n");
        f_savedNoTelp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l_frameTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_frameTitle.setText("Registrasi Peminjam Berhasil");

        l_savedMaksPinjam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedMaksPinjam.setText("Maksimal Pinjam");

        f_savedMaksPinjam.setText("n");
        f_savedMaksPinjam.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        b_regBerhasilOk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_regBerhasilOk.setText("Ok");
        b_regBerhasilOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_regBerhasilOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(l_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(l_savedNoIdJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f_savedNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_savedJenisNoId1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_savedJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(l_savedAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f_savedAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(l_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(l_frameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(l_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(f_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_regBerhasilOk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addComponent(l_frameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedNoIdJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedJenisNoId1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(b_regBerhasilOk)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(592, 257));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /** Menutup dialog. */
    private void b_regBerhasilOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_regBerhasilOkActionPerformed
        dispose();
    }//GEN-LAST:event_b_regBerhasilOkActionPerformed

    /**
     * Main method untuk mengetes tanpa pemanggilan dari {@link App}.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /* Mengatur look and feels tampilan jendela menjadi Nimbus */
            javax.swing.UIManager.setLookAndFeel(new javax.swing.plaf.nimbus.NimbusLookAndFeel());
            /* Mengantrikan aplikasi ke event queue */
            java.awt.EventQueue.invokeLater(() -> {
                RegistrasiPeminjamBerhasil dialog = new RegistrasiPeminjamBerhasil(new JFrame(), true);
                /* Mengatur apa yang dilakukan terdapat event menutup jendela */
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            });
        } catch (UnsupportedLookAndFeelException ex) {          // catch error saat look and feel tidak ditemukan
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_regBerhasilOk;
    private javax.swing.JLabel f_savedAlamat;
    private javax.swing.JLabel f_savedJenisNoId;
    private javax.swing.JLabel f_savedJenisNoId1;
    private javax.swing.JLabel f_savedMaksPinjam;
    private javax.swing.JLabel f_savedNama;
    private javax.swing.JLabel f_savedNoId;
    private javax.swing.JLabel f_savedNoTelp;
    private javax.swing.JLabel l_frameTitle;
    private javax.swing.JLabel l_savedAlamat;
    private javax.swing.JLabel l_savedMaksPinjam;
    private javax.swing.JLabel l_savedNama;
    private javax.swing.JLabel l_savedNoIdJenisNoId;
    private javax.swing.JLabel l_savedNoTelp;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
