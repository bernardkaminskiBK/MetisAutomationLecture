package javazaklady.Zadanie_11_3_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class StatistikySuboru {
    private int pocetZnakov;
    private int pocetSlov;
    private int pocetRiadkov;

    private boolean nacitavanieUkoncene = false;

    public void nacitaj(Scanner vstupneData) {
        while (vstupneData.hasNextLine()) {
            String riadok = vstupneData.nextLine();
            pocetRiadkov++;
            pocetZnakov += riadok.length();
            pocetSlov += riadok.split("[\\s\\-]").length;
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

    public void nacitajSubory(String nazovSuboru) {

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

    public boolean isNacitavanieUkoncene() {
        return nacitavanieUkoncene;
    }

    public void setNacitavanieUkoncene(boolean nacitavanieUkoncene) {
        this.nacitavanieUkoncene = nacitavanieUkoncene;
    }

}
