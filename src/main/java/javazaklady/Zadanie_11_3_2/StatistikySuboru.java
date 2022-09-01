package javazaklady.Zadanie_11_3_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Trieda vytvara statistiky o precitanom subore (pocet znakov, slov
 * a riadkov).
 */

public class StatistikySuboru {
    private int pocetZnakov;
    private int pocetSlov;
    private int pocetRiadkov;

    private boolean nacitavanieUkoncene = false;

    /**
     * Spracuvava zdroj dat (subor) a naslende navysuje celkove
     * pocty znakov, slov a riadkov.
     */

    public void nacitaj(Scanner vstupneData) {
        while (vstupneData.hasNextLine()) {
            String riadok = vstupneData.nextLine();
            pocetRiadkov++;
            pocetZnakov += riadok.length();
            pocetSlov += riadok.split(" ").length;
        }
    }

    public int getPocetZnakov() {
        return pocetZnakov;
    }

    public int getPocetSlov() {
        return pocetSlov;
    }

    public int getPocetRiadkov() {
        return pocetRiadkov;
    }

    /**
     * Nacitava vstupne data zo suborov
     */
    public void nacitajVstupneDataZoSuboru(String nazovSuboru) {

        try {
            FileReader citacSuboru = new FileReader(nazovSuboru);
            Scanner vstupneData = new Scanner(citacSuboru);
            nacitaj(vstupneData);
            vstupneData.close();
        } catch (FileNotFoundException exception) {
            setNacitavanieUkoncene(true);
            System.out.println("Neexistujuci subor, statistiky zadanych suborov: ");
        }

    }

    /**
     * vrati info o stave nacitavania suborov ci je ukoncene
     */
    public boolean isNacitavanieUkoncene() {
        return nacitavanieUkoncene;
    }

    /**
     * nastavuje stav nacitavanie suborov
     */
    public void setNacitavanieUkoncene(boolean nacitavanieUkoncene) {
        this.nacitavanieUkoncene = nacitavanieUkoncene;
    }

}
