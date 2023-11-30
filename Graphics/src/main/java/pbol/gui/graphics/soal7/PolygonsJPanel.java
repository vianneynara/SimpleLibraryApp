package pbol.gui.graphics.soal7;

import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.*;

public class PolygonsJPanel extends JPanel {
	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		/* Membuat garis polygon dengan array titik */
		int xValues[] = {20, 40, 50, 30, 20, 15};			// Inisialisasi titik2 x untuk polygon
		int yValues[] = {50, 50, 60, 80, 80, 60};			// Inisialisasi titik2 y untuk polygon
		Polygon polygon1 = new Polygon(xValues, yValues, 6);// Membuat objek polygon dari array titik dan jumlah titik 6
		// Menggambar garis polygon dengan objek polygon yang sudah ada
		g.drawPolygon(polygon1);

		/* Membuat garis polygon dengan objek Polygon */
		int xValues2[] = {70, 90, 100, 80, 70, 65, 60};		// Inisialisasi titik2 x untuk polygon
		int yValues2[] = {100, 100, 110, 110, 130, 110, 90};// Inisialisasi titik2 y untuk polygon
		// Menggambar garis polygon dengan array titik dan jumlah titik 7
		g.drawPolyline(xValues2, yValues2, 7);

		/* Membuat polygon (yang terisi) dengan array titik */
		int xValues3[] = {120, 140, 150, 190};				// Inisialisasi titik2 x untuk polygon
		int yValues3[] = {40, 70, 80, 60};					// Inisialisasi titik2 y untuk polygon
		// Menggambar polygon terisi dengan array titik dan jumlah titik 4
		g.fillPolygon(xValues3, yValues3, 4);

		/* Membuat polygon (yang terisi) dengan objek Polygon */
		Polygon polygon2 = new Polygon();					// Membuat objek polygon polygon kosong
		polygon2.addPoint(165, 135);						// Menambah titik pada objek polygon di x:165 , y:135
		polygon2.addPoint(175, 150);						// Menambah titik pada objek polygon di x:175 , y:150
		polygon2.addPoint(270, 200);						// Menambah titik pada objek polygon di x:270 , y:200
		polygon2.addPoint(200, 220);						// Menambah titik pada objek polygon di x:200 , y:220
		polygon2.addPoint(130, 180);						// Menambah titik pada objek polygon di x:130 , y:180
		// Membuat polygon yang terisi dengan objek polygon yang memiliki titik
		g.fillPolygon(polygon2);
	} // end method paintComponent
} // end class PolygonsJPanel

class DrawPolygons {
	// execute application
	public static void main(String args[]) {
		// create frame for PolygonsJPanel
		JFrame frame = new JFrame("Drawing Polygons");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
		frame.add(polygonsJPanel); // add polygonsJPanel to frame
		frame.setSize(280, 270); // set frame size
		frame.setVisible(true); // display frame
		frame.setTitle("Yohanes Maria Vianney Nara Narwandaru / 225314091");
	} // end main
} // end class DrawPolygons