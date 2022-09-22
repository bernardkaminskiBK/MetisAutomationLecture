package java_spolocna_praca_s_lektorom.webinar08.zadanie_8_2_2;

public class MnozinaDat
{
    private Minca maximum;
    private Minca minimum;
    private int pocetPrvkov;
    private double sucet;

    public void pridajPrvok(Minca minca)
    {
        double zostatok = minca.getHodnota();
        sucet += zostatok;

        if (pocetPrvkov == 0 || zostatok > maximum.getHodnota())
        {
            maximum = minca;
        }

        if (pocetPrvkov == 0 || zostatok < minimum.getHodnota())
        {
            minimum = minca;
        }

        pocetPrvkov ++;
    }

    public Minca getMaximum()
    {
        return maximum;
    }

    public Minca getMinimum()
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
