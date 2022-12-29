package javazaklady.lecture12.activity2.Zadanie_12_2_2;

public class BankovyUcet
{
    private double aktualnyZostatok;

    public BankovyUcet()
    {
        aktualnyZostatok = 0;
    }

    public BankovyUcet(double pociatocnyZostatok)
    {
        aktualnyZostatok = pociatocnyZostatok;
    }

    public void vloz(double ciatka)
    {
        aktualnyZostatok = aktualnyZostatok + ciatka;
    }

    public void vyber(double ciastka)
    {
        aktualnyZostatok = aktualnyZostatok - ciastka;
    }

    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}
