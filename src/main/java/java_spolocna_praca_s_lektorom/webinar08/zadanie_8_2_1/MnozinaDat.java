package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_1;

public class MnozinaDat
{
    private BankovyUcet maximum;
    private BankovyUcet minimum;
    private int pocetPrvkov;
    private double sucet;

    public void pridajPrvok(BankovyUcet ucet)
    {
        double zostatok = ucet.getAktualnyZostatok();
        sucet += zostatok;

        if (pocetPrvkov == 0 || zostatok > maximum.getAktualnyZostatok())
        {
            maximum = ucet;
        }

        if (pocetPrvkov == 0 || zostatok < minimum.getAktualnyZostatok())
        {
            minimum = ucet;
        }

        pocetPrvkov ++;
    }

    public BankovyUcet getMaximum()
    {
        return maximum;
    }

    public BankovyUcet getMinimum()
    {
        return minimum;
    }

    public double getPriemer()
    {
        if (pocetPrvkov == 0)
        {
            return 0;
        }
        return sucet / pocetPrvkov;
    }
}
