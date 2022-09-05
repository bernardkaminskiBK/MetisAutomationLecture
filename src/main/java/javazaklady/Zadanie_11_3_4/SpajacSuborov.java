package javazaklady.Zadanie_11_3_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Program precita obsah vsetkych suborov a nasledne tento obsah zapise do
 * vysledneho suboru.
 */
public class SpajacSuborov {

    public static void main(String[] args) throws IOException {

        if (args.length < 2) {
            System.out.println("Pouzitie: SpajacSuborov subor1.txt subor2.txt subor3.txt vysledny_subor.txt");
            return;
        }

        String nazovZaloznySubor = args[args.length - 1];
        spojObsahSuborov(args, nazovZaloznySubor);

    }

    public static void spojObsahSuborov(String[] args, String nazovZaloznySubor) {
        try {
            PrintWriter zapisovac = new PrintWriter(nazovZaloznySubor);

            for (String nazovVstupnySubor : args) {
                Scanner citacSuboru = new Scanner(new FileReader(nazovVstupnySubor));

                while (citacSuboru.hasNextLine()) {
                    String riadok = citacSuboru.nextLine();
                    zapisovac.println(riadok);
                }

                zapisovac.println();
                citacSuboru.close();
            }
            zapisovac.close();

            System.out.println("Kopirovanie prebehlo uspesne...");
        } catch (FileNotFoundException ignored) {

        }
    }

}
