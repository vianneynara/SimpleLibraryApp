package pbol.gui.graphics.soal9;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.*;

public class Shapes2JPanel extends JPanel {
	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		Random random = new Random(); 						// Membuat objek Random

//      int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
//      int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
		int xPoints[] = {60, 0, 120};						// Inisialisasi array penyimpan point x
		int yPoints[] = {0, 60, 60};						// Inisialisasi array penyimpan point y
		Graphics2D g2d = (Graphics2D) g;					// Cast dari Graphic ke Graphic2D
		GeneralPath star = new GeneralPath(); 				// Membuat objek GeneralPath

		star.moveTo(xPoints[0], yPoints[0]);				// Atur koordinat awal GeneralPath

		/* Mengatur arah garis pada GeneralPath menggunakan array points */
		for (int count = 1; count < xPoints.length; count++)
			star.lineTo(xPoints[count], yPoints[count]);

		star.closePath(); 									// Tutup GeneralPath

		g2d.translate(200, 200); 							// Mengubah origin (titik tengah) ke x:200, y:200

		/* Mencetak dari rotasi GeneralPath dan mengganti warnanya */
		for (int count = 1; count <= 8; count++) {
			g2d.rotate(Math.PI / 4.0); 						// Melakukan rotasi 4 sisi

			// Mengubah warna kuas secara random
			g2d.setColor(new Color(random.nextInt(256),
				random.nextInt(256), random.nextInt(256)));

			g2d.fill(star); 								// Menggambar bentuk dari GeneralPath: segitiga
		} // end for
	} // end method paintComponent
} // end class Shapes2JPanel

class Shapes2 extends Thread {
	private static Shapes2JPanel shapes2JPanel;				// Menyimpan panel shape

	public static void main(String args[]) {
		// create frame for Shapes2JPanel
		JFrame frame = new JFrame("Drawing 2D Shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		shapes2JPanel = new Shapes2JPanel();
		frame.add(shapes2JPanel); // add shapes2JPanel to frame
		frame.setBackground(Color.WHITE); // set frame background color
		frame.setSize(400, 400); // set frame size
		frame.setVisible(true); // display frame
		frame.setTitle("Yohanes Maria Vianney Nara Narwandaru / 225314091");
		Shapes2 sh = new Shapes2();							// Membuat Shape2 (diri sendiri)
		sh.start();											// Menjalankan shape
	} // end main

	public void run() {
		while (true) {
			try {
				this.sleep(1000);							// Melakukan pause keseluruhan program selama 1 detik
			} catch (InterruptedException ie) {				// Menangkap interupsi
				break;										// Break loop
			}
			shapes2JPanel.repaint();						// Melakukan penggambaran ulang
		}
	}
} // end class Shapes2