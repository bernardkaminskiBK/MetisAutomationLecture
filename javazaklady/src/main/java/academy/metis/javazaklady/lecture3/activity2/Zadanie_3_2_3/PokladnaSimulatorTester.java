package academy.metis.javazaklady.lecture3.activity2.Zadanie_3_2_3;

import java.util.Locale;
import java.util.Scanner;

public class PokladnaSimulatorTester {
    public static void main(String[] args) {
        PokladnaSimulator pokladnaSimulator = new PokladnaSimulator();
        Scanner vstup = new Scanner(System.in);
        vstup.useLocale(Locale.ENGLISH);

        int pocetTovarov = 5;

        for (int i = 1; i <= pocetTovarov; i++)
        {
            System.out.println("Zadaj cenu tovaru č. " + i + ": ");
            double cenaTovaru = vstup.nextDouble();
            pokladnaSimulator.naskenujTovar(cenaTovaru);
        }

        // prijmi hotovost 5.85 Eur
        pokladnaSimulator.prijmiHotovost(2, 1, 1,
                1, 1, 1, 0, 0);

       // System.out.println("Vas vydavok je: " + pokladnaSimulator.vratVydavok() + " Eur");
        System.out.printf("Vas vydavok je: %.2f Eur%n", pokladnaSimulator.vratVydavok());
    }
}


