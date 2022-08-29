package javazaklady.Zadanie_1_3_2;

import java.awt.*;

public class ObvodObdlznikaTester
{
    public static void main(String[] args)
    {
        Rectangle obdlznik = new Rectangle(5, 5, 15, 25);

        double obvod = getObvod(obdlznik);

        System.out.println("\n" + obdlznik + "\n");
        System.out.println("Obvod obdlznika o velkosti 15*25p je: " + getObvod(obdlznik));
        System.out.println("Ocakavana hodnota: 80.0");
    }

    // vytvorena metoda na ziskanie obvodu
    public static double getObvod(Rectangle obdlznik)
    {
        double obvod = (2 * (obdlznik.getHeight() + obdlznik.getWidth()));
        return obvod;
    }
}
