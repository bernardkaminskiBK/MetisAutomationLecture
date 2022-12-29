package javazaklady.lecture9.activity3.part2;

public class BankovyUcet
{
    private double aktualnyZostatok;
    private double minZostatok;

    public BankovyUcet()
    {
        aktualnyZostatok = 0;
    }

    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }

    public void vloz (double ciastka)
    {
        if (aktualnyZostatok == 0)
        {
            aktualnyZostatok += ciastka;
            minZostatok = aktualnyZostatok;
        }
        else
        {
            aktualnyZostatok += ciastka;
        }
    }

    public void vyber (double ciastka)
    {
        aktualnyZostatok -= ciastka;
        if (aktualnyZostatok < minZostatok)
        {
            minZostatok = aktualnyZostatok;
        }
    }

    public double getMinZostatok()
    {
        return minZostatok;
    }
}
