package javazaklady.Webinar12.Zadanie_12_3_1;

import java.io.FileNotFoundException;

public class BankomatSimulator {

	public static void main(String[] args) throws FileNotFoundException {

		Banka banka = new Banka();
		banka.nacitajKlientov("klienti.txt");
		Bankomat bankomat = new Bankomat(banka);
		BankomatGUI gui = new BankomatGUI(bankomat);
		gui.setVisible(true);
	}
}
