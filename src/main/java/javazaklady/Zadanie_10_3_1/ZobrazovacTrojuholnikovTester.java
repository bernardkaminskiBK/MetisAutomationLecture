package javazaklady.Zadanie_10_3_1;

import java.util.Scanner;

public class ZobrazovacTrojuholnikovTester {
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);


        System.out.println("Zadaj typ trojuholnika(-1 pre ukoncenie)");
        int typ = vstup.nextInt();

        while (typ != -1) {

            System.out.println("Vyber velkost trojuholnika");
            int velkost = vstup.nextInt();

            System.out.println("Vyber typ znaku");
            String znak = vstup.next();

            ZobrazovacTrojuholnikov trojuholnik = new ZobrazovacTrojuholnikov(velkost, znak);

            if (typ == 1) {
                System.out.println(trojuholnik.getVzorTrojuholnik1());
            } else if (typ == 2) {
                System.out.println(trojuholnik.getVzorTrojuholnik2());
            } else if (typ == 3) {
                System.out.println(trojuholnik.getVzorTrojuholnik3());
            } else if (typ == 4) {
                System.out.println(trojuholnik.getVzorTrojuholnik4());
            }

            System.out.println("Zadaj typ trojuholnika(-1 pre ukoncenie)");
            typ = vstup.nextInt();

        }

        System.out.println("Ukoncujem program");

    }
}
