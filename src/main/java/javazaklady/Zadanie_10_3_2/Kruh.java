package javazaklady.Zadanie_10_3_2;

import java.awt.Graphics2D;

/**
 * Trieda Kruh reprezentuje kruznicu.
 * 
 * @author berni
 *
 */
public class Kruh {

	private static final double X_OVA_SURADNICA_KRUHU = 10;
	private static final double Y_OVA_SURADNICA_KRUHU = 10;
	private static final double SIRKA_KRUHU = 15;
	private static final double VYSKA_KRUHU = 15;

	private int xOvaSuradnicaKruhu;
	private int yOvaSuradnicaKruhu;
	private int sirkaKruhu;
	private int vyskaKruhu;

	/**
	 * Vytvara objekt triedy Kruh s parametrami x, y, h, w.
	 * 
	 * @param x x-ova suradnica
	 * @param y y-ova suradnica
	 * @param h vyska(height)
	 * @param w sirka(weight)
	 */
	public Kruh(int x, int y, int h, int w) {
		this.xOvaSuradnicaKruhu = x;
		this.yOvaSuradnicaKruhu = y;
		this.sirkaKruhu = h;
		this.vyskaKruhu = w;
	}

	/**
	 * Vykresluje kruznice.
	 * 
	 * @param grafickyKontext graficky kontext.
	 */
	public void vykresliKruh(Graphics2D grafickyKontext) {

		for (int i = 0; i < 10; i++) {
			grafickyKontext.drawOval(xOvaSuradnicaKruhu, yOvaSuradnicaKruhu, sirkaKruhu, vyskaKruhu);
			xOvaSuradnicaKruhu += X_OVA_SURADNICA_KRUHU;
			yOvaSuradnicaKruhu += Y_OVA_SURADNICA_KRUHU;
			sirkaKruhu += SIRKA_KRUHU;
			vyskaKruhu += VYSKA_KRUHU;
		}
	}
}
