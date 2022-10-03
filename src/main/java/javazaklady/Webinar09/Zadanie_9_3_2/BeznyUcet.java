package javazaklady.Webinar09.Zadanie_9_3_2;

public class BeznyUcet extends BankovyUcet
{
    private double pociatocnyZostatok;
    private static final double POPLATOK_ZA_VEDENIE_UCTU = 2.0;
    private static final double POCET_TRANSAKCII_ZDARMA = 3;
    private static final double CENA_TRANSAKCIE = 0.2;

    private int pocetTransakcii;

    public BeznyUcet(double pociatocnyZostatok)
    {
        this.pociatocnyZostatok = pociatocnyZostatok;
    }
    public BeznyUcet()
    {
        pociatocnyZostatok = 0;
    }

    @Override
    public void vloz(double ciastka)
    {
        pocetTransakcii++;
        super.vloz(ciastka);
    }

    @Override
    public void vyber(double ciastka)
    {
        pocetTransakcii++;
        super.vyber(ciastka);
    }

    public void zauctujPoplatky()
    {
        double poplatky = POPLATOK_ZA_VEDENIE_UCTU;

        if (pocetTransakcii > POCET_TRANSAKCII_ZDARMA)
        {
            poplatky += (pocetTransakcii - POCET_TRANSAKCII_ZDARMA) * CENA_TRANSAKCIE;
        }

        super.vyber(poplatky);
        pocetTransakcii = 0;
    }
}
