package javazaklady.lecture9.activity2.Zadanie_9_2_1;

public class BeznyUcet extends BankovyUcet
{

    private static final double POPLATOK_ZA_VEDENIE_UCTU = 2.0;
    private static final int POCET_TRANSAKCII_ZDARMA = 3;
    private static final double CENA_TRANSAKCIE = 0.2;

    private int pocetTransakcii;

    public BeznyUcet(double pociatocnyZostatok)
    {
        super(pociatocnyZostatok);
    }

    // kvoli pocetTransakcii++ sme museli prepisat dane metody (cez CTRL + O)
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
