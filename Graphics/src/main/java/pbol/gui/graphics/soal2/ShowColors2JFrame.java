package pbol.gui.graphics.soal2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColors2JFrame extends JFrame {
	private JButton changeColorJButton;						// Menginisalisasi variabel tombol "Change Color"
	private Color color = Color.LIGHT_GRAY;					// Menginisalisasi variabel objek warna abu-abu terang
	private JPanel colorJPanel;								// Menginisalisasi variabel JPanel untuk warna

	// set up GUI
	public ShowColors2JFrame() {
		super("Yohanes Maria Vianney Nara Narwandaru / 225314091");

		// create JPanel for display color
		colorJPanel = new JPanel();							// Membuat JPanel
		colorJPanel.setBackground(color);					// Mengatur warna latar belakang ke warna tadi

		// set up changeColorJButton and register its event handler
		changeColorJButton = new JButton("Change Color");	// Membuat tombol Change Color dengan JButton
		changeColorJButton.addActionListener(				// Memberikan ActionListener pada button

			new ActionListener() // anonymous inner class	-- Functional interface ActionListener
			{
				/* Pada saat tombol ditekan */
				public void actionPerformed(ActionEvent event) {
					// Membuka dialog JColorChooser yang menempel pada kelas ShowColors2JFrame dengan title
					// "Choose a color" dengan warna awal warna tadi (abu-abu terang). Hasilnya input user kemudian
					// akan dikembalikan ke variabel color
					color = JColorChooser.showDialog(
						ShowColors2JFrame.this, "Choose a color", color);

					// Mengecek warna
					if (color == null)
						color = Color.LIGHT_GRAY;

					// Mengganti warna latar belakang pada JPanel
					colorJPanel.setBackground(color);
				} // end method actionPerformed
			} // end anonymous inner class
		); // end call to addActionListener

		add(colorJPanel, BorderLayout.CENTER); 				// Menambahkan komponen colorJPanel pada JFrame
		add(changeColorJButton, BorderLayout.SOUTH); 		// Menambahkan komponen changeColorJButton pada JFrame

		setSize(400, 130); 									// Mengatur ukuran frame
		setVisible(true); 									// Mengatur visiblitas frame agar terlihat
	} // end ShowColor2JFrame constructor
} // end class ShowColors2JFrame

class ShowColors2 {
	// execute application
	public static void main(String args[]) {
		ShowColors2JFrame application = new ShowColors2JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	} // end main
} // end class ShowColors2