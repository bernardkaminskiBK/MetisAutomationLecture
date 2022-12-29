package javazaklady2.Webinar11.part2;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Trieda zobrazi statistiky o obsahu vsetkych nacitanych suborov.
 */
public class AnalyzatorSuborov {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner vstup = new Scanner(System.in);
        StatistikySuboru statistiky = new StatistikySuboru();

        while (!statistiky.isNacitavanieUkoncene()) {
            System.out.println("Nazov suboru: ");
            String nazovSuboru = vstup.nextLine();
            statistiky.nacitajVstupneDataZoSuboru(nazovSuboru);
        }

    }
}
