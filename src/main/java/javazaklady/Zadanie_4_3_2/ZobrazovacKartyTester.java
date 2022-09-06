package javazaklady.Zadanie_4_3_2;

import java.util.Scanner;

public class ZobrazovacKartyTester {
    public static void main(String[] args)
    {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Zadaj skrateny zapis karty: ");
        String skratka = vstup.nextLine();
        Karta karta = new Karta(skratka);

        System.out.println(karta.getPopis());
    }
}
