package javazaklady.Zadanie_10_3_3;

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
	private int x = 130;
	private int y = 130;
	private int sirka = 20;
	private int vyska = 20;

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
