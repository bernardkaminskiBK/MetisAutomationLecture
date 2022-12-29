package javazaklady2.Webinar08.part1;

import java.util.Random;

public class Kocka
{
    public int pocetStran;
    public int hodeneCislo;

    public Kocka(int pocetStran)
    {
        this.pocetStran = pocetStran;
    }

    public int hod()
    {
        Random generator = new Random();
        hodeneCislo = generator.nextInt(pocetStran) + 1;
        return hodeneCislo;
    }

    public double getHodeneCislo()
    {
        return hodeneCislo;
    }
}
