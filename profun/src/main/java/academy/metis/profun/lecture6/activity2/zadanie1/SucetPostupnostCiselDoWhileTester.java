package academy.metis.profun.lecture6.activity2.zadanie1;


import java.util.Scanner;

// vyries ulohu pomocou cyklu DO WHILE
public class SucetPostupnostCiselDoWhileTester {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        System.out.print("zadaj velkost mnoziny dat: ");
        int velkost = vstup.nextInt();
        System.out.print("sucet cisel je: " + postupnost(velkost, vstup));
    }

    public static int postupnost(int velkost, Scanner vstup) {
        int sucet = 0;
        int i = 1;
        do {
            System.out.print("zadaj " + i++ + ". cislo: ");
            int cislo = vstup.nextInt();
            sucet += cislo;
        }
        while (i <= velkost);
        return sucet;
    }
}