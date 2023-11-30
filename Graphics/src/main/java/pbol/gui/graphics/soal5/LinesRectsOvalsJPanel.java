package pbol.gui.graphics.soal5;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class LinesRectsOvalsJPanel extends JPanel {
	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		this.setBackground(Color.WHITE);

		g.setColor(Color.RED);								// Mengatur warna kuas ke merah
		g.drawLine(5, 30, 380, 30);							// Menggambar garis di x1:5, y1:30, x2:380, y2:30

		g.setColor(Color.BLUE);								// Mengatur warna kuas ke biru
		g.drawRect(5, 40, 90, 55);							// Menggambar garis persegi di x1:5, y1:40, x2:90, y2:55
		g.fillRect(100, 40, 90, 55);						// Menggambar persegi terisi di x1:100, y1:40, x2:90, y2:55

		g.setColor(Color.BLACK);							// Mengatur warna kuas ke hitam
		// Menggambar garis persegi di x1:195, y:40, lebar:90, tinggi:55, ujung halus X:50, ujung halus Y:50
		g.fillRoundRect(195, 40, 90, 55, 50, 50);
		// Menggambar garis persegi di x1:290, y:40, lebar:90, tinggi:55, ujung halus X:20, ujung halus Y:20
		g.drawRoundRect(290, 40, 90, 55, 20, 20);

		g.setColor(Color.YELLOW);							// Mengatur warna kuas ke kuning
		// Menggambar garis persegi 3D di x1:5, y1:100, x2:90, y2:55, ditinggikan:menyala
		g.draw3DRect(5, 100, 90, 55, true);
		// Menggambar persegi terisi 3D di x1:100, y1:100, x2:90, y2:55, ditinggikan:mati
		g.fill3DRect(100, 100, 90, 55, false);

		g.setColor(Color.MAGENTA);							// Mengatur warna kuas ke magenta
		g.drawOval(195, 100, 90, 55);						// Menggambar garis oval di x:195, y:100, lebar:90, tinggi:55
		g.fillOval(290, 100, 90, 55);						// Menggambar oval terisi di x:290, y:100, lebar:90, tinggi:55
	} // end method paintComponent
} // end class LinesRectsOvalsJPanel

class LinesRectsOvals {
	// execute application
	public static void main(String args[]) {
		// create frame for LinesRectsOvalsJPanel
		JFrame frame =
			new JFrame("Drawing lines, rectangles and ovals");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LinesRectsOvalsJPanel linesRectsOvalsJPanel =
			new LinesRectsOvalsJPanel();
		linesRectsOvalsJPanel.setBackground(Color.WHITE);
		frame.add(linesRectsOvalsJPanel); // add panel to frame
		frame.setSize(400, 210); // set frame size
		frame.setVisible(true); // display frame
		frame.setTitle("Yohanes Maria Vianney Nara Narwandaru / 225314091");
	} // end main
} // end class LinesRectsOvals