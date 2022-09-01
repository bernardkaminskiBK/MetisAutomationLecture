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

        //TODO: doplnit...
    }

    public static void spojObsahSuborov(String[] args, String nazovZaloznySubor) {

        for (String nazovVstupnySubor : args) {
            //TODO: doplnit...
        }

    }

}
