package javazaklady.Zadanie_11_3_4;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Program precita obsah vsetkych suborov a nasledne tento obsah zapise do
 * vysledneho suboru.
 * 
 * @author berni
 *
 */
public class SpajacSuborov {

	public static void main(String[] args) throws IOException {

		if (args.length < 2) {
			String text = "Pouzitie: SpajacSuborov subor1.txt subor2.txt subor3.txt vysledny_subor.txt";
			System.out.println(text);
			return;
		}
		String nazovZaloznySubor = args[args.length - 1];
		PrintWriter zapisovac = new PrintWriter(nazovZaloznySubor);

		for (int i = 0; i < args.length; i++) {
			String nazovVstupnySubor = args[i];
			FileReader citac = new FileReader(nazovVstupnySubor);
			Scanner citacSuboru = new Scanner(citac);

			while (citacSuboru.hasNextLine()) {
				String riadok = citacSuboru.nextLine();
				zapisovac.println(riadok);
			}
			zapisovac.println();
			citacSuboru.close();
		}
		zapisovac.close();
		System.out.println("Kopirovanie prebehlo uspesne...");
	}
}
