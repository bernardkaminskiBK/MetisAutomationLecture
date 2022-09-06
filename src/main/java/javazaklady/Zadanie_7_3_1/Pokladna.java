package javazaklady.Zadanie_7_3_1;

public class Pokladna
{
    private double prijataHotovost;
    private double celkovaCenaTovarov;

    public Pokladna()
    {
        prijataHotovost = 0;
        celkovaCenaTovarov = 0;
    }

    public void naskenujTovar(double cena)
    {
        celkovaCenaTovarov += cena;
    }

    public void prijmiHotovost(int pocet, Minca minca)
    {
        prijataHotovost += pocet * minca.getHodnotaMince();
    }

    public double datVydavok()
    {
        return prijataHotovost - celkovaCenaTovarov;
    }
}
