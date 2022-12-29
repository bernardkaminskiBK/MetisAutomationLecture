package javazaklady.lecture10.activity3.part2;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

/**
 * Trieda KomponentaObdlznik nastavuje x-ovu, y-ovu suradnicu a sirku a vysku
 * obdlznika.
 * 
 * @author berni
 *
 */
public class KomponentaObdlznik extends JComponent {

	private static final long serialVersionUID = 1L;
	private int x = 25;
	private int y = 30;
	private int sirka = 50;
	private int vyska = 60;

	/**
	 * Metoda painComponent vykresli obdlznik.
	 */
	@Override
	protected void paintComponent(Graphics grafickyKontext) {

		Graphics2D g2 = (Graphics2D) grafickyKontext;

		Obdlznik obdlznik = new Obdlznik(x, y, sirka, vyska);
		obdlznik.vykresliObdlznik(g2);

	}

}
