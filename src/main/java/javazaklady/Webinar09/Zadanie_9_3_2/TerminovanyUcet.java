package javazaklady.Webinar09.Zadanie_9_3_2;

public class TerminovanyUcet extends BankovyUcet
{
    private double urokovaSadzba;
    private double pocetMesiacovViazanosti;
    private double urok;
    private static final double POKUTA_ZA_PREDCASNY_VYBER = 25;

    public TerminovanyUcet(double urokovaSadzba, double pocetMesiacovViazanosti)
    {
        this.urokovaSadzba = urokovaSadzba;
        this.pocetMesiacovViazanosti = pocetMesiacovViazanosti;
    }

    public void zapisUrok()
    {
        urok = urokovaSadzba * super.getMinZostatok() / 100;
        super.vloz(urok);
        pocetMesiacovViazanosti--;
    }

    @Override
    public void vyber(double ciastka)
    {
        if (pocetMesiacovViazanosti <= 0)
        {
            super.vyber(ciastka);
        }
        else
        {
            double pokuta = ciastka / POKUTA_ZA_PREDCASNY_VYBER;
            ciastka = ciastka - pokuta;
            super.vyber(ciastka);
        }
    }
}
