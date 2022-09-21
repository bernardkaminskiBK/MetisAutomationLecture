package profun_spolocna_praca_s_lektorom.lekcia4.zadanie2;

import java.util.Locale;
import java.util.Scanner;

public class StavNaUcteTester {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        vstup.useLocale(Locale.ENGLISH);

        zistiStavNaUcte(vstup);
    }

    public static void zistiStavNaUcte(Scanner vstup) {
        while (true) {
            System.out.print("zadaj cislo uctu (-1 pre ukoncenie programu): ");
            int cisloUctu = vstup.nextInt();

            if (cisloUctu == -1) {
                break;
            }

            System.out.print("zadaj zostatok na zaciatku mesiaca: ");
            double pociatocnyZostatok = vstup.nextDouble();

            System.out.print("zadaj celkove mesacne vydavky: ");
            double vydavky = vstup.nextDouble();

            System.out.print("zadaj celkove mesacne prijmy: ");
            double prijmy = vstup.nextDouble();

            System.out.print("zadaj limit na kreditke: ");
            double limit = vstup.nextDouble();

            double novyZostatok = getNovyZostatok(pociatocnyZostatok, vydavky, prijmy);

            if (novyZostatok > limit) {
                System.out.println("cislo uctu: " + cisloUctu);
                System.out.printf("limit na kreditke: %.02f\n", limit);
                System.out.printf("zostatok: %.02f\n", novyZostatok);
                System.out.println("limit na kreditke bol prekroceny.");
            }
        }
    }

    private static double getNovyZostatok(double pociatocnyZostatok, double vydavky, double prijmy) {
        double novyZostatok = pociatocnyZostatok + vydavky - prijmy;
        return novyZostatok;
    }

}
