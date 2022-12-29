package javazaklady2.Webinar11.a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class AnalyzatorDat {

    public static void main(String[] args) throws FileNotFoundException {

//        System.out.println("Nazov suboru: ");
//        Scanner vstup = new Scanner(System.in);
//        String nazovSuboru = vstup.next();

        String nazovSuboru = "src/main/java/javazaklady2/Zadanie_11_3_1/text.txt";

        Statistiky statistiky = new Statistiky();
        FileReader citacSuboru = new FileReader(nazovSuboru);

        Scanner vstupneData = new Scanner(citacSuboru);
        statistiky.citaj(vstupneData);
        vstupneData.close();

        System.out.println("Pocet znakov: " + statistiky.getPocetZnakov());
        System.out.println("Pocet slov: " + statistiky.getPocetSlov());
        System.out.println("Pocet riadkov: " + statistiky.getPocetRiadkov());

    }

}
