import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static java.awt.Font.BOLD;
import static javax.swing.SwingConstants.CENTER;

public class App extends JFrame {
    /* konstanta warna */
    private final Color MAIN_BG_COLOR = new Color(153, 204, 255);

    /* konten pada container menu / main frame */
    private JPanel menuContainer;
    private JLabel menuTitle;
    private JButton btn_regPeminjam;

    /* konten JDialog untuk formulir */
    private JPanel formContainer;

    /** Constructor yang memanggil metode memulai GUI. */
    public App() {
        putGUI();
    }

    /** Metode berisi seluruh komponen GUI. */
    private void putGUI() {
        /* membuat objek atribut */
        menuContainer       = new JPanel();
        menuTitle           = new JLabel();
        btn_regPeminjam     = new JButton();

        /* pengaturan frame */
        setTitle("Sistem Manajemen Perpustakaan");
        setSize(960, 540);
        setMaximumSize(new Dimension(1280, 720));
        setMinimumSize(new Dimension(960, 540));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* kode */
        menuContainer.setBackground(MAIN_BG_COLOR);
        menuTitle.setText("<html>Sistem Manajemen<br/>Perpustakaan</html>");
        menuTitle.setFont(new Font("Segoe UI", BOLD, 24));
        menuTitle.setHorizontalAlignment(CENTER);

        btn_regPeminjam.setFont(new Font("Segoe UI", BOLD, 14));
        btn_regPeminjam.setText("registrasi data peminjam");
        btn_regPeminjam.addActionListener(this::btn_regPeminjamActionPerformed);

        /* tampilkan GUI */
        pack();
        setVisible(true);
    }

    /** Metode yang mengganti formulir ke registrasi data peminjam. */
    private void btn_regPeminjamActionPerformed(ActionEvent e) {
        return;
    }

    /** Metode yang menjalankan aplikasi. */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            new App();
        }
    });
    }
}
