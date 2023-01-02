package academy.metis.javazaklady.lecture11.activity2.Zadanie_11_2_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Vytvor program, ktory vytvori subor text.txt, zapise do neho vetu:
 * "Programovanie v Jave nas bavi."
 * Nasledne subor zatvori, opatovne ho otvori, precita vetu (riadok) zo suboru
 * a vypise obsah suboru na konzolu.
 */
public class PracaSoSuboromTester
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // 1) Vytvor subor
        PrintWriter zapisovac = new PrintWriter("text.txt");

        // 2) Zapis do suboru vetu ...
        zapisovac.println("Programovanie v Jave nas bavi.");

        // 2a) Zatvor subor
        zapisovac.close();

        // 3) Otvor subor
        Scanner citacSuboru = new Scanner(new FileReader("text.txt"));

        // 4) Precitaj zo suboru text
        String text = citacSuboru.nextLine();

        // 5) Vypis nacitany text na standardny vystup
        System.out.println("Obsah suboru: ");
        System.out.println(text);
    }
}
