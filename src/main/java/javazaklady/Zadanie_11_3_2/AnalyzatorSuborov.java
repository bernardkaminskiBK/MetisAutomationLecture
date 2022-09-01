package javazaklady.Zadanie_11_3_2;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class AnalyzatorSuborov {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner vstup = new Scanner(System.in);
        StatistikySuboru statistiky = new StatistikySuboru();

        while (!statistiky.isNacitavanieUkoncene()) {
            System.out.println("Nazov suboru: ");
            String nazovSuboru = vstup.nextLine();
            statistiky.nacitajSubory(nazovSuboru);
        }

        System.out.println("Znaky: " + statistiky.getPocetZnakov());
        System.out.println("Slova: " + statistiky.getPocetSlov());
        System.out.println("Riadky: " + statistiky.getPocetRiadkov());

    }
}
