/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author narwa
 */
public class RegistrasiPeminjamBerhasil extends javax.swing.JDialog {

    /**
     * Creates new form RegistrasiPeminjamBerhasil
     */
    public RegistrasiPeminjamBerhasil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * Membuat RegistrasiPeminjamBerhasil dialog dengan isinya.
     */
    public RegistrasiPeminjamBerhasil(java.awt.Frame parent, boolean modal, String nama, String noId, String jenisNoId, String alamat, String noTelp, int maksPinjam) {
        super(parent, modal);
        initComponents();

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

        dialog_regPeminjamBerhasil = new javax.swing.JDialog();
        l_regPeminjamBerhasil = new javax.swing.JLabel();
        b_regBerhasilOk = new javax.swing.JButton();
        l_savedNama = new javax.swing.JLabel();
        f_savedNama = new javax.swing.JLabel();
        l_savedNoIdJenisNoId = new javax.swing.JLabel();
        f_savedNoId = new javax.swing.JLabel();
        f_savedJenisNoId = new javax.swing.JLabel();
        f_savedAlamat = new javax.swing.JLabel();
        l_savedAlamat = new javax.swing.JLabel();
        f_savedNoTelp = new javax.swing.JLabel();
        l_savedNoTelp = new javax.swing.JLabel();
        l_savedMaksPinjam = new javax.swing.JLabel();
        f_savedMaksPinjam = new javax.swing.JLabel();
        f_savedJenisNoId1 = new javax.swing.JLabel();

        dialog_regPeminjamBerhasil.setTitle("Registrasi berhasil");
        dialog_regPeminjamBerhasil.setResizable(false);

        javax.swing.GroupLayout dialog_regPeminjamBerhasilLayout = new javax.swing.GroupLayout(dialog_regPeminjamBerhasil.getContentPane());
        dialog_regPeminjamBerhasil.getContentPane().setLayout(dialog_regPeminjamBerhasilLayout);
        dialog_regPeminjamBerhasilLayout.setHorizontalGroup(
            dialog_regPeminjamBerhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        );
        dialog_regPeminjamBerhasilLayout.setVerticalGroup(
            dialog_regPeminjamBerhasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrasi Peminjam Berhasil");

        l_regPeminjamBerhasil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        l_regPeminjamBerhasil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_regPeminjamBerhasil.setText("Registrasi Peminjam Berhasil");

        b_regBerhasilOk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b_regBerhasilOk.setText("Ok");
        b_regBerhasilOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_regBerhasilOkActionPerformed(evt);
            }
        });

        l_savedNama.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedNama.setText("Nama Lengkap");

        f_savedNama.setText("n");
        f_savedNama.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l_savedNoIdJenisNoId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedNoIdJenisNoId.setText("Nomor Identitas / Jenis");

        f_savedNoId.setText("n");
        f_savedNoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        f_savedJenisNoId.setText("n");
        f_savedJenisNoId.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        f_savedAlamat.setText("n");
        f_savedAlamat.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l_savedAlamat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedAlamat.setText("Alamat");

        f_savedNoTelp.setText("n");
        f_savedNoTelp.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l_savedNoTelp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedNoTelp.setText("Nomor Telepon");

        l_savedMaksPinjam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        l_savedMaksPinjam.setText("Maksimal Pinjam");

        f_savedMaksPinjam.setText("n");
        f_savedMaksPinjam.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        f_savedJenisNoId1.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_regBerhasilOk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_savedNoIdJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f_savedNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f_savedJenisNoId1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f_savedJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_savedAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f_savedAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(f_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l_regPeminjamBerhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(l_regPeminjamBerhasil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedNama, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedNoIdJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedJenisNoId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedJenisNoId1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f_savedMaksPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_regBerhasilOk)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_regBerhasilOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_regBerhasilOkActionPerformed
        dispose();
    }//GEN-LAST:event_b_regBerhasilOkActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPeminjamBerhasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPeminjamBerhasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPeminjamBerhasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrasiPeminjamBerhasil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrasiPeminjamBerhasil dialog = new RegistrasiPeminjamBerhasil(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_regBerhasilOk;
    private javax.swing.JDialog dialog_regPeminjamBerhasil;
    private javax.swing.JLabel f_savedAlamat;
    private javax.swing.JLabel f_savedJenisNoId;
    private javax.swing.JLabel f_savedJenisNoId1;
    private javax.swing.JLabel f_savedMaksPinjam;
    private javax.swing.JLabel f_savedNama;
    private javax.swing.JLabel f_savedNoId;
    private javax.swing.JLabel f_savedNoTelp;
    private javax.swing.JLabel l_regPeminjamBerhasil;
    private javax.swing.JLabel l_savedAlamat;
    private javax.swing.JLabel l_savedMaksPinjam;
    private javax.swing.JLabel l_savedNama;
    private javax.swing.JLabel l_savedNoIdJenisNoId;
    private javax.swing.JLabel l_savedNoTelp;
    // End of variables declaration//GEN-END:variables
}
