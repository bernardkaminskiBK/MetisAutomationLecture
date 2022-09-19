package java_spolocna_praca_s_lektorom.webinar8.zadanie_8_2_3;

public class BankovyUcet implements Meratelny
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

    @Override
    public double getMiera()
    {
        return aktualnyZostatok;
    }
}