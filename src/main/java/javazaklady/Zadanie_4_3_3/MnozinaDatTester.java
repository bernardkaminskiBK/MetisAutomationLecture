package javazaklady.Zadanie_4_3_3;

import java.util.Scanner;

public class MnozinaDatTester
{
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadajte tri realne cisla");
        double cislo1 = vstup.nextDouble();
        double cislo2 = vstup.nextDouble();
        double cislo3 = vstup.nextDouble();

        MnozinaDat data = new MnozinaDat(cislo1, cislo2, cislo3);

        System.out.println("Cisla zoradene od najmensieho po najvacsie: ");
        System.out.println(data.getNajmensie());
        System.out.println(data.getProstredne());
        System.out.println(data.getNajvacsie());
    }
}
