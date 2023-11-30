package pbol.gui.graphics.soal1;

// Fig. 12.5: ColorJPanel.java
// Demonstrating Colors.

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;

public class ColorJPanel extends JPanel {
	/**Metode ini dipanggil saat panel ini akan digambar, instruksi di bawahnya akan dijalankan saat panel ini
	 * digambar.
	 * @param g {@link Graphics} Berfungsi sebagai perender / penggambar pada panel
	 * */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); 							// Memanggil paintComponent milik JPanel

		this.setBackground(Color.WHITE);					// Mengatur warna latar belakang menjadi PUTIH

		g.setColor(new Color(255, 0, 0));					// Mengatur kuas dengan warna merah penuh r:255, g:0, b:0
		g.fillRect(15, 25, 100, 20);						// Menggambar persegi terisi di x:15, y:25, lebar:100, tinggi:20
		// Melakukan penggambaran string di x:130, y:40
		g.drawString("Current RGB: " + g.getColor(), 130, 40);

		g.setColor(new Color(0.50f, 0.75f, 0.0f));			// Mengatur kuas dengan float warna r:0.50f, g:0.75f, b:0.75f
		g.fillRect(15, 50, 100, 20);						// Menggambar persegi terisi di x:15, y:50, lebar:100, tinggi:20
		// Melakukan penggambaran string di x:130, y:65
		g.drawString("Current RGB: " + g.getColor(), 130, 65);

		g.setColor(Color.BLUE);								// Mengatur kuas dengan objek warna BIRU
		g.fillRect(15, 75, 100, 20);						// Menggambar persegi terisi di x:15, y:75, lebar:100, tinggi:20
		// Melakukan penggambaran string di x:130, y:90
		g.drawString("Current RGB: " + g.getColor(), 130, 90);

		Color color = Color.MAGENTA;						// Membuat objek warna MAGENTA
		g.setColor(color);									// Mengatur warna dengan objek warna yang sudah dibuat
		g.fillRect(15, 100, 100, 20);						// Menggambar persegi terisi di x:100, y:75, lebar:100, tinggi:20
		// Melakukan penggambaran string di x:130, y:115
		g.drawString("RGB values: " + color.getRed() + ", " +
			color.getGreen() + ", " + color.getBlue(), 130, 115);
	} // end method paintComponent
} // end class ColorJPanel

class ShowColors
{
   // execute application
   public static void main( String args[] )
   {
      // create frame for ColorJPanel
      JFrame frame = new JFrame( "Yohanes Maria Vianney Nara Narwandaru / 225314091" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

      ColorJPanel colorJPanel = new ColorJPanel(); // create ColorJPanel
      frame.add( colorJPanel ); // add colorJPanel to frame
      frame.setSize( 400, 180 ); // set frame size
      frame.setVisible( true ); // display frame
   } // end main
} // end class ShowColors
