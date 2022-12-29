package java_spolocna_praca_s_lektorom.webinar09.Zadanie_9_2_1;

public class BankovyUcet
{
    private double aktualnyZostatok;

    public BankovyUcet(double aktualnyZostatok)
    {
        this.aktualnyZostatok = aktualnyZostatok;
    }

    public double getAktualnyZostatok()
    {
        return aktualnyZostatok;
    }

    public void vloz(double ciastka)
    {
        aktualnyZostatok += ciastka;
    }

    public void vyber(double ciastka)
    {
        aktualnyZostatok -= ciastka;
    }
}
