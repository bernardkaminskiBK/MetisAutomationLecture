package java_spolocna_praca_s_lektorom.webinar03.Zadanie_3_2_3;

import java.util.Locale;
import java.util.Scanner;

public class PokladnaTester {
    public static void main(String[] args) {
        Pokladna pokladna = new Pokladna();
        Scanner vstup = new Scanner(System.in);
        vstup.useLocale(Locale.ENGLISH);

        int pocetTovarov = 5;

        for (int i = 1; i <= pocetTovarov; i++)
        {
            System.out.println("Zadaj cenu tovaru: ");
            double cenaTovaru = vstup.nextDouble();
            pokladna.naskenujTovar(cenaTovaru);
        }

        // prijmi hotovost 5.85 Eur
        pokladna.prijmiHotovst(2, 1, 1,
                1, 1, 1, 0, 0);

        System.out.println("Vas vydavok je: " + pokladna.vratVydavok() + " Eur");
        System.out.printf("Vas vydavok je: %.2f Eur%n", pokladna.vratVydavok());
    }
}
