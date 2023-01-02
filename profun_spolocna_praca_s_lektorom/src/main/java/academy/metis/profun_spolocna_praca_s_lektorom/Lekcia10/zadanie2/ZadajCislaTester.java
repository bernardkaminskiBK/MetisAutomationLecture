package academy.metis.profun_spolocna_praca_s_lektorom.Lekcia10.zadanie2;

import java.util.Scanner;

public class ZadajCislaTester {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        zadajCisla(vstup);
    }

    public static void zadajCisla(Scanner vstup) {
        int[] cisla = new int[20];
        int pozicia = 0;

        for (int i = 1; i <= cisla.length; i++) {
            System.out.print("zadaj " + i + ". cislo: ");
            int cislo = vstup.nextInt();

            if (cislo >= 10 && cislo <= 100) {
                int index = vyhladaj(cislo, cisla);

                if (index == -1) {
                    cisla[pozicia] = cislo;
                    pozicia++;
                }
            }
        }
        vypisPole(cisla);
    }

    public static void vypisPole(int[] cisla) {
        for (int cislo : cisla) {
            System.out.print(cislo + " ");
        }
    }

    public static int vyhladaj(int cislo, int[] cisla) {
        int index = -1;

        for (int i = 0; i < cisla.length; i++) {
            if (cisla[i] == cislo) {
                index = i;
                break;
            }
        }
        return index;
    }
}
