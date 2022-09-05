package javazaklady.Zadanie_8_3_1;

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
