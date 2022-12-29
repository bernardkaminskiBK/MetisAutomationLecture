package javazaklady2.Webinar04.part2;

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
