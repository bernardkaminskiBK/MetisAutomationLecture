package javazaklady.Zadanie_10_3_3;

import javax.swing.JFrame;

/**
 * Trieda ZobrazovacKruznic spusta a testuje funkcionalitu triedy kruh.
 * 
 * @author berni
 *
 */
public class ZobrazovacKruznic {

	public static void main(String[] args) {

		JFrame okno = new JFrame();
		okno.setSize(300, 320);
		okno.setName("Zobrazovac ");
		okno.setTitle("Kruh");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		KomponentaKruh kruh = new KomponentaKruh();
		okno.setTitle("Kruh");
		okno.add(kruh);
		okno.setVisible(true);

	}
}
