package pbol.gui.graphics.soal8;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class ShapesJPanel extends JPanel {
	public ShapesJPanel() {

	}

	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		g.setColor(Color.pink);								// Mengatur warna penggambar ke pink
		// Menggambar lingkaran terisi di x:15, y:15 dengan lebar: 80, tinggi: 80, mulai dari sudut 45° hingga 180°
		g.fillArc(15, 15, 80, 80, 45, 180);
		g.setColor(Color.black);							// Mengatur warna Graphic menjadi hitam
		g.setFont(new Font("Serif", Font.BOLD, 14));		// Mengatur font ke Serif BOLD dengan ukuran 14
		g.drawString("Ini Adalah Arc", 15, 20);				// Menggambar sebuah string di x:15, y:20

		/* Melakukan casting dari Graphics menjadi Graphics2D */
		Graphics2D g2d = (Graphics2D) g;

		/* Metode di bawah membuat Ellipse (oval) */
//      g2d.setColor(Color.blue);
//      g2d.fill( new Ellipse2D.Double( 105, 30, 65, 100 ) );
//
//      g2d.setColor(Color.yellow);
//      g2d.fill( new Ellipse2D.Double( 115, 35, 30, 65 ) );

		// Mengatur "kuas" dari renderer Graphics2D menjadi warna gradient
		g2d.setPaint(new GradientPaint(5, 30, Color.RED, 15, 100,
			Color.GREEN, true));
		// Menggambar oval 2D di x:5, y:30 dengan lebar:35, tinggi:100
		g2d.fill(new Ellipse2D.Double(5, 30, 35, 100));

		/* Menggambar persegi */
		g2d.setPaint(Color.MAGENTA);						// Mengatur "kuas" menjadi warna merah
		g2d.setStroke(new BasicStroke(10.0f));				// Mengatur garis dengan BasicStroke sebesar 10.0f
		// Menggambar objek persegi 2 dimensi di x:80, y:30 dengan lebar:65, tinggi:100
		g2d.draw(new Rectangle2D.Double(80, 30, 65, 100));

		// Membuat objek BufferedImage dengan lebar:10, tinggi:10, bertipe INT RGB = 1
		BufferedImage buffImage = new BufferedImage(10, 10,
			BufferedImage.TYPE_INT_RGB);

		/* Menggambar "tekstur" pada Graphics2D */
		Graphics2D gg = buffImage.createGraphics();			// Membuat penggambar Graphics2D dengan buffered image tadi
		gg.setColor(Color.CYAN); 							// Mengatur warna dengan CYAN
		gg.fillRect(0, 0, 10, 10); 							// Menggambar persegi terisi di x:0, y:0, lebar:10, tinggi:10
		gg.setColor(Color.ORANGE);  						// Mengatur warna dengan ORANGE
		gg.drawRect(1, 1, 6, 6); 							// Menggambar persegi terisi di x:1, y:1, lebar:6, tinggi:6
		gg.setColor(Color.WHITE); 							// Mengatur warna dengan WHITE
		gg.fillRect(1, 1, 3, 3); 							// Menggambar persegi terisi di x:1, y:1, lebar:3, tinggi:3
		gg.setColor(Color.GRAY); 							// Mengatur warna dengan GRAY
		gg.fillRect(4, 4, 3, 3); 							// Menggambar persegi terisi di x:4, y:4, lebar:3, tinggi:3

		// Mengatur kuas dengan TexturePaint dengan buffImage yang telah diedit di atas dengan bentuk persegi
		g2d.setPaint(new TexturePaint(buffImage,
			new Rectangle(10, 10)));
		// Menggambar persegi ujung halus di x:155, y,30, lebar:75, tinggi:100, ujungX:50, ujungY:50
		g2d.fill(
			new RoundRectangle2D.Double(155, 30, 75, 100, 50, 50));

		g2d.setPaint(Color.WHITE);							// Mengatur warna kuas ke PUTIH
		g2d.setStroke(new BasicStroke(6.0f));				// Mengatur garis dengan BasicStroke sebesar 10.0f
		// Menggambar lingkaran 2 dimensi di x:240, y,30, lebar:75, tinggi:100, mulai dari sudut 0° hingga 270°
		// lingkaran ini dibuat dengan Arc2D bertipe PIE
		g2d.draw(
			new Arc2D.Double(240, 30, 75, 100, 0, 270, Arc2D.PIE));

		g2d.setPaint(Color.GREEN);							// Mengatur warna kuas ke HIJAU
		g2d.draw(new Line2D.Double(395, 30, 320, 150));		// Menggambar garis di koordinat x1:395, y1:30, x2:320, y2:150

		float dashes[] = {10};								// Array berisi panjang stripnya
		g2d.setPaint(Color.YELLOW);							// Mengatur warna kuas ke KUNING
		// Mengatur garis kuas dengan BasicStroke dengan lebar:4, jenis garis ujung halus, tipe join bulat, potongan
		// segment 10, representasi garis, dan fase garis
		g2d.setStroke(new BasicStroke(4, BasicStroke.CAP_ROUND,
			BasicStroke.JOIN_ROUND, 10, dashes, 0));
		// Menggambar garis 2 dimensi dengan Line2D berargumen x1:320, y1:30, x2:395, y2:150
		g2d.draw(new Line2D.Double(320, 30, 395, 150));
	} // end method paintComponent
} // end class ShapesJPanel

class Shapes {
	// execute application
	public static void main(String args[]) {
		// create frame for ShapesJPanel
		JFrame frame = new JFrame("Drawing 2D shapes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// create ShapesJPanel
		ShapesJPanel shapesJPanel = new ShapesJPanel();

		frame.add(shapesJPanel); // add shapesJPanel to frame
		frame.setSize(425, 200); // set frame size
		frame.setVisible(true); // display frame
		frame.setTitle("Yohanes Maria Vianney Nara Narwandaru / 225314091");
	} // end main
} // end class Shapes
