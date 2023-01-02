package academy.metis.javazaklady.lecture7.activity3.part3;
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

    public void prijmiMince(int pocet, Minca minca)
    {
        prijataHotovost += pocet * minca.getHodnotaMince();
    }

    public void prijmiBankovky(int pocet, Bankovka bankovka)
    {
        prijataHotovost += pocet * bankovka.getHodnotaBankovky();
    }

    public double datVydavok()
    {
        return prijataHotovost - celkovaCenaTovarov;
    }
}
