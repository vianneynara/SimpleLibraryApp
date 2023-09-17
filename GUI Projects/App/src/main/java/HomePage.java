import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 *
 * @author narwa
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        loginPage = new javax.swing.JPanel();
        logoSanataDharma = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        i_password = new javax.swing.JPasswordField();
        i_username = new javax.swing.JTextField();
        menuBar = new javax.swing.JMenuBar();
        menuBar_informasi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home: Sistem Manajemen Perpustakaan");

        loginPage.setBackground(new java.awt.Color(153, 204, 255));

        logoSanataDharma.setIcon(new ImageIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/logoSanataDharma.png"))).getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH)));

        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        i_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        i_password.setEnabled(false);
        i_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_passwordActionPerformed(evt);
            }
        });

        i_username.setEnabled(false);
        i_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_usernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPageLayout = new javax.swing.GroupLayout(loginPage);
        loginPage.setLayout(loginPageLayout);
        loginPageLayout.setHorizontalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPageLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(i_password)
                        .addComponent(i_username, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPageLayout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(53, 53, 53)
                .addComponent(logoSanataDharma, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        loginPageLayout.setVerticalGroup(
            loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPageLayout.createSequentialGroup()
                .addGroup(loginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPageLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(logoSanataDharma, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPageLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(i_username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(i_password, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        menuBar_informasi.setText("Informasi");
        menuBar.add(menuBar_informasi);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Masuk ke aplikasi utama dengan cara membuat {@link App}. Untuk menyimpan objek {@link HomePage} ini, menggunakan argumen {@code this}.
     * */
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        JFrame app = new App(this);                         // buat objek App ke app

        System.out.println("Logged as Admin");              // mencetak di terminal

        app.setVisible(true);                               // mengatur app menjadi terlihat
        this.setVisible(false);                             // mengatur home page mmenjadi tidak terlihat
    }//GEN-LAST:event_btn_loginActionPerformed

    private void i_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_passwordActionPerformed

    private void i_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_i_usernameActionPerformed

    /**
     * Metode penjalan kelas.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            /* Mengatur look and feels tampilan jendela menjadi Nimbus */
            javax.swing.UIManager.setLookAndFeel(new javax.swing.plaf.nimbus.NimbusLookAndFeel());
            /* Mengantrikan aplikasi ke event queue */
            java.awt.EventQueue.invokeLater(() -> new HomePage().setVisible(true));
        } catch (UnsupportedLookAndFeelException ex) {          // catch error saat look and feel tidak ditemukan
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPasswordField i_password;
    private javax.swing.JTextField i_username;
    private javax.swing.JPanel loginPage;
    private javax.swing.JLabel logoSanataDharma;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBar_informasi;
    // End of variables declaration//GEN-END:variables
}
