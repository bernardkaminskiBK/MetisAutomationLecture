package javazaklady.Webinar11.a;

import java.util.Scanner;
public class Statistiky
{
    private int pocetZnakov;
    private int pocetSlov;
    private int pocetRiadkov;

    public Statistiky() {}

    public void citaj(Scanner vstupneData)
    {
        while (vstupneData.hasNextLine())
        {
            String riadok = vstupneData.nextLine();
            pocetRiadkov++;

            pocetZnakov += riadok.length();

            pocetSlov += riadok.split("[\\s\\-]").length;
        }
    }

    public int getPocetZnakov()
    {
        return pocetZnakov;
    }

    public int getPocetSlov()
    {
        return pocetSlov;
    }

    public int getPocetRiadkov()
    {
        return pocetRiadkov;
    }
}
