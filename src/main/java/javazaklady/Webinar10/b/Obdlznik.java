package javazaklady.Webinar10.b;

import java.awt.Graphics2D;

/**
 * Trieda Obdlznik reprezentuje obdlznik.
 * 
 * @author berni
 *
 */
public class Obdlznik {

	private static final double X_OVA_SURADNICA_OBDLZNIKA = 10;
	private static final double Y_OVA_SURADNICA_OBDLZNIKA = 10;
	private static final double SIRKA_OBDLZNIKA = 20;
	private static final double VYSKA_OBDLZNIKA = 10;

	private int xOvaSuradnicaObdlznika;
	private int yOvaSuradnicaObdlznika;
	private int sirkaObdlznika;
	private int vyskaObdlznika;

	/**
	 * Vytvara objekt triedy Obdlznik s parametrami x, y, h, w.
	 * 
	 * @param x x-ova suradnica
	 * @param y y-ova suradnica
	 * @param h vyska(height)
	 * @param w sirka(weight)
	 */
	public Obdlznik(int x, int y, int h, int w) {
		this.xOvaSuradnicaObdlznika = x;
		this.yOvaSuradnicaObdlznika = y;
		this.sirkaObdlznika = h;
		this.vyskaObdlznika = w;
	}

	/**
	 * Vykresluje obdlznikov.
	 * 
	 * @param grafickyKontext graficky kontext
	 */
	public void vykresliObdlznik(Graphics2D grafickyKontext) {

		for (int i = 0; i < 10; i++) {
			grafickyKontext.drawRect(xOvaSuradnicaObdlznika, yOvaSuradnicaObdlznika, sirkaObdlznika, vyskaObdlznika);
			xOvaSuradnicaObdlznika += X_OVA_SURADNICA_OBDLZNIKA;
			yOvaSuradnicaObdlznika += Y_OVA_SURADNICA_OBDLZNIKA;
			sirkaObdlznika += SIRKA_OBDLZNIKA;
			vyskaObdlznika += VYSKA_OBDLZNIKA;
		}

	}

}
