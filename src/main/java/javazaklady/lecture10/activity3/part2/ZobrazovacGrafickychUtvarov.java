package javazaklady.lecture10.activity3.part2;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Trieda ZobrazovacGrafickychUtvarov spusta a testuje funkcionalitu triedy
 * Obdlznik a kruh
 * 
 * @author berni
 *
 */
public class ZobrazovacGrafickychUtvarov {

	public static void main(String[] args) {

		JFrame okno = new JFrame();

		okno.setSize(400, 400);
		okno.setName("Zobrazovac ");
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		volbaPouzivatela(okno);

	}

	/**
	 * Staticka metoda spusta typ vzoru kruh alebo obdlznik na zaklad prijatej volby
	 * pouzivatela.
	 * 
	 * @param okno okno vykreslovacie okno JFrame.
	 */
	private static void volbaPouzivatela(JFrame okno) {

		String volba = JOptionPane
				.showInputDialog("Zadaj 1 pre vykreslenie obdlznikov\n" + "Zadaj 2 pre vykreslenie kruznic");
		int volbaPouzivatela = Integer.parseInt(volba);

		final int PRVA_VOLBA = 1;
		final int DRUHA_VOLBA = 2;

		switch (volbaPouzivatela) {
		case PRVA_VOLBA:
			KomponentaObdlznik obdlznik = new KomponentaObdlznik();
			okno.setTitle("Obdlznik");
			okno.add(obdlznik);
			okno.setVisible(true);
			break;
		case DRUHA_VOLBA:
			KomponentaKruh kruh = new KomponentaKruh();
			okno.setTitle("Kruh");
			okno.add(kruh);
			okno.setVisible(true);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Zadal si zle cislo. Je mozne zadat iba 1 alebo 2 !");

		}
	}
}
