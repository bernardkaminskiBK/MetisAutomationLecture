package profun_spolocna_praca_s_lektorom.Lekcia6.zadanie1;

import java.util.Scanner;

// vyries ulohu pomocou cyklu FOR
public class SucetPostupnostCiselForTester {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.print("zadaj velkost mnoziny dat: ");
        int velkost = vstup.nextInt();
        System.out.print("sucet cisel je: " + postupnost(velkost, vstup));
    }

    public static int postupnost(int velkost, Scanner vstup) {
        int sucet = 0;
        for (int i = 1; i <= velkost; i++) {
            System.out.print("zadaj " + i + ". cislo: ");
            int cislo = vstup.nextInt();
            sucet += cislo;
        }
        return sucet;
    }
}
