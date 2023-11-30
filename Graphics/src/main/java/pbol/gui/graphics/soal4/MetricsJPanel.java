package pbol.gui.graphics.soal4;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.*;

public class MetricsJPanel extends JPanel {
	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		// Mengatur font ke SansSerif, tipe bold, berukuran 12pt
		g.setFont(new Font("SansSerif", Font.BOLD, 12));
		FontMetrics metrics = g.getFontMetrics();			// Menyimpan metrik font dari kuas g ke objek FontMetrics
		g.drawString("Current font: " + g.getFont(), 10, 40);
		g.drawString("Ascent: " + metrics.getAscent(), 10, 55);
		g.drawString("Descent: " + metrics.getDescent(), 10, 70);
		g.drawString("Height: " + metrics.getHeight(), 10, 85);
		g.drawString("Leading: " + metrics.getLeading(), 10, 100);

		// Membuat font dengan SansSerif, tipe italic, berukuran 14pt
		Font font = new Font("Serif", Font.ITALIC, 14);
		metrics = g.getFontMetrics(font);					// Menyimpan metrik font dari kuas g ke objek FontMetrics
		g.setFont(font);									// Mengatur font kuas dengan konfigurasi font yang telah dibuat
		g.drawString("Current font: " + font, 10, 130);
		g.drawString("Ascent: " + metrics.getAscent(), 10, 145);
		g.drawString("Descent: " + metrics.getDescent(), 10, 160);
		g.drawString("Height: " + metrics.getHeight(), 10, 175);
		g.drawString("Leading: " + metrics.getLeading(), 10, 190);
	} // end method paintComponent
} // end class MetricsJPanel

class Metrics {
	// execute application
	public static void main(String args[]) {
		// create frame for MetricsJPanel
		JFrame frame = new JFrame("Demonstrating FontMetrics");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MetricsJPanel metricsJPanel = new MetricsJPanel();
		frame.add(metricsJPanel); // add metricsJPanel to frame
		frame.setSize(510, 250); // set frame size
		frame.setVisible(true); // display frame
		frame.setTitle("Yohanes Maria Vianney Nara Narwandaru / 225314091");
	} // end main
} // end class Metrics