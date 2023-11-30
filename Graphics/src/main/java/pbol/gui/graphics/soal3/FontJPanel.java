package pbol.gui.graphics.soal3;

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class FontJPanel extends JPanel {
	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		// Mengatur font ke Serif, tipe bold, berukuran 12pt
		g.setFont(new Font("Serif", Font.BOLD, 12));
		g.drawString("Serif 12 point bold.", 20, 50);		// Menggambar string di x:20, y:50

		// Mengatur font ke Monospaced, tipe italic, berukuran 24pt
		g.setFont(new Font("Monospaced", Font.ITALIC, 24));
		g.drawString("Monospaced 24 point italic.", 20, 70);// Menggambar string di x:20, y:70

		// Mengatur font ke SansSerif, tipe plain, berukuran 14pt
		g.setFont(new Font("SansSerif", Font.PLAIN, 14));
		g.drawString("SansSerif 14 point plain.", 20, 90);	// Menggambar string di x:20, y:90

		g.setColor(Color.RED);								// Mengatur warna kuas dengan merah
		// Mengatur font ke Serif, tipe bold/italic, berukuran 18pt
		g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 18));
		// Melakukan penggambaran string di x:20, y:110
		g.drawString(g.getFont().getName() + " " + g.getFont().getSize() +
			" point bold italic.", 20, 110);
	} // end method paintComponent
} // end class FontJPanel

class Fonts {
	// execute application
	public static void main(String args[]) {
		// create frame for FontJPanel
		JFrame frame = new JFrame("Using fonts");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FontJPanel fontJPanel = new FontJPanel(); // create FontJPanel
		frame.add(fontJPanel); // add fontJPanel to frame
		frame.setSize(420, 170); // set frame size
		frame.setVisible(true); // display frame
		frame.setTitle("Yohanes Maria Vianney Nara Narwandaru / 225314091");
	} // end main
} // end class Fonts
