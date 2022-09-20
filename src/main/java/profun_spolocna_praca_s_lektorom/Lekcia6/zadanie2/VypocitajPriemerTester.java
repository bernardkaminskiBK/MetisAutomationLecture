package profun_spolocna_praca_s_lektorom.Lekcia6.zadanie2;

import java.util.Scanner;

public class VypocitajPriemerTester {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        vypocitajPriemer(vstup);
    }

    public static void vypocitajPriemer(Scanner vstup) {

        final int koniec = 9999;
        double sucet = 0;
        int pocet = 0;
        double priemer = 0;

        while (true) {
            System.out.print("zadaj cele cislo: ");
            int cislo = vstup.nextInt();

            if (cislo == koniec) {
                break;
            }

            sucet += cislo;
            pocet++;
        }

        if (pocet != 0) {
            priemer = sucet / pocet;
        }
        System.out.println("priemer je: " + priemer);
    }

}
