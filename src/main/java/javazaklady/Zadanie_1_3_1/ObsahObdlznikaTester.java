package javazaklady.Zadanie_1_3_1;//package Obdlznik;

import java.awt.*;

public class ObsahObdlznikaTester {
    public static void main(String[] args)
    {
        Rectangle obdlznik = new Rectangle(10, 10, 50,100);

        double obsah = vypisObsah(obdlznik);

        System.out.println("\n" + obdlznik + "\n");
        System.out.println("Obsah obdlznika o velkosti 50*100p je: " + vypisObsah(obdlznik));
        System.out.println("Ocakavana hodnota: 5000.0");
    }

    // vytvorena metoda na ziskanie obsahu
    public static double vypisObsah(Rectangle obdlznik)
    {
        double obsah = (obdlznik.getHeight() * obdlznik.getWidth());
        return obsah;

    }
}
