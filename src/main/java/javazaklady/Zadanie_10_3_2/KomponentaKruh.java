package javazaklady.Zadanie_10_3_2;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Trieda KomponentaKruh nastavuje x-ovu, y-ovu suradnicu a sirku a vysku
 * kruznice.
 * 
 * @author berni
 *
 */
public class KomponentaKruh extends JComponent {

	private static final long serialVersionUID = 1L;
	private int x = 25;
	private int y = 30;
	private int sirka = 60;
	private int vyska = 60;

	/**
	 * Metoda painComponent vykresli kruh.
	 */
	@Override
	protected void paintComponent(Graphics grafickyKontext) {

		Graphics2D g2 = (Graphics2D) grafickyKontext;

		Kruh kruh = new Kruh(x, y, sirka, vyska);
		kruh.vykresliKruh(g2);

	}

}
