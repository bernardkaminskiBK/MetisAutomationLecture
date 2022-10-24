package javazaklady.Webinar10.c;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Trieda Kruh reprezentuje kruznicu.
 * 
 * @author berni
 *
 */
public class Kruh {

	private static final int VYSKA = 20;
	private static final int SIRKA = 20;
	private static final int Y_SURADNICA = 10;
	private static final int X_SURADNICA = 10;
	private static final int POCET_KRUHOV = 12;

	private int xOvaSuradnica;
	private int yOvaSuradnica;
	private int sirka;
	private int vyska;

	/**
	 * Vytvara objekt triedy Kruh s parametrami x, y, h, w.
	 * 
	 * @param x x-ova suradnica
	 * @param y y-ova suradnica
	 * @param h vyska(height)
	 * @param w sirka(weight)
	 */
	public Kruh(int x, int y, int h, int w) {
		this.xOvaSuradnica = x;
		this.yOvaSuradnica = y;
		this.sirka = h;
		this.vyska = w;

	}

	/**
	 * Vykresluje kruznice pricom kazda jedna kruznica je inou farbou.Random
	 * sposobom spusta metody vykresliKruhPrvaAlternativa a
	 * vykresliKruhPrvaBlternativa.
	 * 
	 * @param grafickyKontext graficky kontext.
	 */
	public void vykresliKruh(Graphics2D grafickyKontext) {

		if (randomGeneratorCisel(2) == 1) {
			vykresliKruznicePrvaAlternativa(grafickyKontext);
		} else {
			vykresliKruzniceDruhaAlternativa(grafickyKontext);
		}
	}

	/**
	 * Metoda vykresli kruznice s cervenou a modrou farbou.
	 * 
	 * @param grafickyKontext grafickyKontext.
	 */
	private void vykresliKruznicePrvaAlternativa(Graphics2D grafickyKontext) {
		for (int i = 1; i <= POCET_KRUHOV; i++) {
			if (i % 2 == 0) {
				grafickyKontext.setColor(Color.blue);
			} else {
				grafickyKontext.setColor(Color.red);
			}

			grafickyKontext.drawOval(xOvaSuradnica, yOvaSuradnica, sirka, vyska);
			xOvaSuradnica -= X_SURADNICA;
			yOvaSuradnica -= Y_SURADNICA;
			sirka += SIRKA;
			vyska += VYSKA;

		}
	}

	/**
	 * Vykresluje kruznice a to sposobom ze kazda jedna kruznica bude mat inu farbu.
	 * 
	 * @param grafickyKontext grafickyKontext.
	 */
	private void vykresliKruzniceDruhaAlternativa(Graphics2D grafickyKontext) {
		for (int i = 1; i <= POCET_KRUHOV; i++) {
			grafickyKontext.setColor(randomFarba());
			grafickyKontext.drawOval(xOvaSuradnica, yOvaSuradnica, sirka, vyska);
			xOvaSuradnica -= X_SURADNICA;
			yOvaSuradnica -= Y_SURADNICA;
			sirka += SIRKA;
			vyska += VYSKA;
		}

	}

	/**
	 * Metoda generuje random farbu z moznosti od 1 do 11.
	 * 
	 * @return vrati nahodnu farbu.
	 */
	private Color randomFarba() {
		switch (randomGeneratorCisel(11)) {
		case 1:
			return Color.YELLOW;
		case 2:
			return Color.green;
		case 3:
			return Color.cyan;
		case 4:
			return Color.orange;
		case 5:
			return Color.pink;
		case 6:
			return Color.darkGray;
		case 7:
			return Color.gray;
		case 8:
			return Color.lightGray;
		case 9:
			return Color.red;
		case 10:
			return Color.white;
		case 11:
			return Color.blue;
		}
		return null;

	}

	/**
	 * Random generator nahodnych cisel. Generuje cele cisla od 1 do podla zadanej
	 * hodnoty.
	 * 
	 * @param cislo parameter od 1 do cislo.
	 * @return nahodne vygenerovane cislo od 1 do cislo.
	 */
	public int randomGeneratorCisel(int cislo) {
		int randomCislo = (int) (Math.random() * cislo) + 1;
		return randomCislo;
	}

}
