package profun_spolocna_praca_s_lektorom.Lekcia10.zadanie1;

import java.util.Scanner;

public class KategoriaPrijmovTester {
    public static final int ODMENA_FIX = 200;
    public static final double PERCENTUALNA_MIERA_ODMENY = 0.09;

    public static void main(String[] args) {

        Scanner vstup = new Scanner(System.in);

        zistiKategoriuTyzdennychPrijmov(vstup);
    }

    public static void zistiKategoriuTyzdennychPrijmov(Scanner vstup) {
        int[] kategorie = new int[9];
        double obrat;
        double odmena;

        while (true) {
            System.out.print("\nzadaj obrat (-1 pre ukoncenie): ");
            obrat = vstup.nextDouble();

            if (obrat == -1) {
                break;
            }

            odmena = vypocitajOdmenu(obrat);
            System.out.println("odmena zamestnannca je: " + odmena + " EUR");

            rozdelDoKategorie(kategorie, odmena);
        }

        System.out.println("\nkategorie tyzdennych prijmov zamestnancov");
        System.out.println("200 - 299 EUR " + kategorie[0]);
        System.out.println("300 - 399 EUR " + kategorie[1]);
        System.out.println("400 - 499 EUR " + kategorie[2]);
        System.out.println("500 - 599 EUR " + kategorie[3]);
        System.out.println("600 - 699 EUR " + kategorie[4]);
        System.out.println("700 - 799 EUR " + kategorie[5]);
        System.out.println("800 - 899 EUR " + kategorie[6]);
        System.out.println("900 - 999 EUR " + kategorie[7]);
        System.out.println("1000 a viac EUR " + kategorie[8]);
    }

    public static void rozdelDoKategorie(int[] kategorie, double odmena) {
        if (odmena >= 1000) {
            kategorie[8]++;
        } else if (odmena >= 900) {
            kategorie[7]++;
        } else if (odmena >= 800) {
            kategorie[6]++;
        } else if (odmena >= 700) {
            kategorie[5]++;
        } else if (odmena >= 600) {
            kategorie[4]++;
        } else if (odmena >= 500) {
            kategorie[3]++;
        } else if (odmena >= 400) {
            kategorie[2]++;
        } else if (odmena >= 300) {
            kategorie[1]++;
        } else {
            kategorie[0]++;
        }
    }

    public static double vypocitajOdmenu(double obrat) {
        return ODMENA_FIX + (obrat * PERCENTUALNA_MIERA_ODMENY);
    }
}
