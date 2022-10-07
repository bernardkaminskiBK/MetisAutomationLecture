package java_spolocna_praca_s_lektorom.webinar10.zadanie_10_2_3;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Formatovac
{
    public static void main(String[] args) throws IOException
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj nazov vstupneho suboru: ");
        String nazovVstupnehoSuboru = "src/main/java/java_spolocna_praca_s_lektorom/" + "webinar10/Zadanie_10_2_3/" + vstup.next();;

        System.out.println("Zadaj nazov vystupneho suboru: ");
        String nazovVystupnehoSuboru = "src/main/java/java_spolocna_praca_s_lektorom/" + "webinar10/Zadanie_10_2_3/" + vstup.next();

        FileReader citac = new FileReader(nazovVstupnehoSuboru);
        Scanner citacSuboru = new Scanner(citac);

        PrintWriter zapisovac = new PrintWriter(nazovVystupnehoSuboru);

        int cisloRiadka = 1;

        while (citacSuboru.hasNextLine())
        {
            String riadok = citacSuboru.nextLine();
            String naformatovanyRiadok = "/* " + cisloRiadka + " */ " + riadok;
            zapisovac.println(naformatovanyRiadok);
            cisloRiadka ++;
        }
        zapisovac.close();
        citac.close();
        vstup.close();
        citacSuboru.close();
    }
}
