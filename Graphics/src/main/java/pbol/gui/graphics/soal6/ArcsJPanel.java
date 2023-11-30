package pbol.gui.graphics.soal6;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class ArcsJPanel extends JPanel {
	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		/* Membuat kotak warna merah */
		g.setColor(Color.RED);								// Mengatur warna graphics ke merah
		// Menggambar rectangle/kotak di x:15, y:35 dengan lebar: 80, tinggi: 80
		g.drawRect(15, 35, 80, 80);
		/* Membuat lingkaran warna hitam */
		g.setColor(Color.BLACK);							// Mengatur warna graphics ke hitam
		// Menggambar outline lingkaran di x:15, y:35 dengan lebar: 80, tinggi: 80, mulai dari sudut 0° hingga 360°
		g.drawArc(15, 35, 80, 80, 0, 360);

		/* Membuat kotak warna merah */
		g.setColor(Color.RED);								// Mengatur warna graphics ke merah
		// Menggambar rectangle/kotak di x:15, y:35 dengan lebar: 80, tinggi: 80
		g.drawRect(100, 35, 80, 80);
		/* Membuat lingkaran warna hitam */
		g.setColor(Color.BLACK);							// Mengatur warna graphics ke hitam
		// Menggambar outline lingkaran di x:100, y:35 dengan lebar: 80, tinggi: 80, mulai dari sudut 0° hingga 110°
		g.drawArc(100, 35, 80, 80, 0, 110);

		/* Membuat kotak warna merah */
		g.setColor(Color.RED);								// Mengatur warna graphics ke merah
		// Menggambar rectangle/kotak di x:185, y:35 dengan lebar: 80, tinggi: 80
		g.drawRect(185, 35, 80, 80);
		/* Membuat lingkaran warna hitam */
		g.setColor(Color.BLACK);							// Mengatur warna graphics ke hitam
		// Menggambar outline lingkaran di x:185, y:35 dengan lebar: 80, tinggi: 80, mulai dari sudut 0° hingga -270°
		g.drawArc(185, 35, 80, 80, 0, -270);

		// Menggambar lingkaran terisi di x:15, y:120 dengan lebar: 80, tinggi: 80, mulai dari sudut 0° hingga -270°
		g.fillArc(15, 120, 80, 40, 0, 360);

		// Menggambar lingkaran terisi di x:100, y:120 dengan lebar: 80, tinggi: 80, mulai dari sudut 0° hingga -270°
		g.fillArc(100, 120, 80, 40, 270, -90);

		// Menggambar lingkaran terisi di x:185, y:120 dengan lebar: 80, tinggi: 80, mulai dari sudut 0° hingga -270°
		g.fillArc(185, 120, 80, 40, 0, -270);
	} // end method paintComponent
} // end class ArcsJPanel

class DrawArcs {
	// execute application
	public static void main(String args[]) {
		// create frame for ArcsJPanel
		JFrame frame = new JFrame("Drawing Arcs");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ArcsJPanel arcsJPanel = new ArcsJPanel(); // create ArcsJPanel
		frame.add(arcsJPanel); // add arcsJPanel to frame
		frame.setSize(300, 210); // set frame size
		frame.setVisible(true); // display frame
		frame.setTitle("Yohanes Maria Vianney Nara Narwandaru / 225314091");
	} // end main
} // end class DrawArcs