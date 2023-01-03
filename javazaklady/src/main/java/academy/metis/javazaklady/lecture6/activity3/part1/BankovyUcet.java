package academy.metis.javazaklady.lecture6.activity3.part1;

public class BankovyUcet
{
    private int cisloUctu;
    private double aktualnyZostatok;

    public BankovyUcet(int cisloUctu, double aktualnyZostatok)
    {
        this.cisloUctu = cisloUctu;
        this.aktualnyZostatok = aktualnyZostatok;
    }

    public void vloz(double ciastka)
    {
        this.aktualnyZostatok += ciastka;
    }

    public void vyber(double ciastka)
    {
        this.aktualnyZostatok -= ciastka;
    }

    public int getCisloUctu()
    {
        return cisloUctu;
    }

    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }
}